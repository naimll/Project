/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Stafi;
import DAL.LibraryException;
import DAL.StafiRepository;
import GUI.Model.StaffTableModel;
import com.sun.glass.events.KeyEvent;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lenovo
 */
public class RegisterStaffGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGUI
     */
    StafiRepository srepo = new StafiRepository();
    StaffTableModel sbtm = new StaffTableModel();
    
    public RegisterStaffGUI() {
        initComponents();
        loadTableModel();
        this.tableSelectedIndexChange();
        IdTextField.setEnabled(true);
    }
 
    
    
    
    public void tableSelectedIndexChange(){
         final ListSelectionModel rowSM = table.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){
             
             @Override
             public void valueChanged(ListSelectionEvent e) {
                    if(e.getValueIsAdjusting()){
                    return;             }
                    ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                    int selectedIndex = rowSM.getAnchorSelectionIndex();
                    if(selectedIndex > -1){
                    Stafi s = sbtm.getStafi(selectedIndex);
                    
                    IdTextField.setText(s.getStafiId().toString());
                    IdTextField.setEnabled(false);
                   // NoEdit.setVisible(true);
                    NameTextField.setText(s.getSEmri());
                    SurnameTextField.setText(s.getSMbiemri());
                    TelephoneTextField.setText(s.getSTel());
                    int role = s.getSRoli();
                    if(role == 0){
                        UserRadioButton.setSelected(true);
                        AdminRadioButton.setSelected(false);
                    }
                    else{
                        UserRadioButton.setSelected(false);
                        AdminRadioButton.setSelected(true);
                    }
                        UsernameTextField.setText(s.getSUser());
                        PasswordField.setText(s.getSPassword());
                            
                    
                        
                }
            }
         });
    }

    
    public void Clear(){
        IdTextField.setEnabled(true);
        IdTextField.setText("");
        this.NameTextField.setText("");
        this.SurnameTextField.setText("");
        this.TelephoneTextField.setText("");
        this.AdminRadioButton.setSelected(false);
        this.UserRadioButton.setSelected(false);
        this.UsernameTextField.setText("");
        this.PasswordField.setText("");
        //this.NoEdit.setVisible(false);
        
    }
        
    
    public void loadTableModel(){
        
        try{
            List<Stafi> lista = srepo.findAll();
            sbtm.addList(lista);
            table.setModel(sbtm);
            sbtm.fireTableDataChanged();
        }catch(LibraryException ex){
            java.util.logging.Logger.getLogger(RegisterBookGUI.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomePanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        RegiserPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        TelephoneLabel = new javax.swing.JLabel();
        RoleLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswrodLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        TelephoneTextField = new javax.swing.JTextField();
        SurnameTextField = new javax.swing.JTextField();
        AdminRadioButton = new javax.swing.JRadioButton();
        UserRadioButton = new javax.swing.JRadioButton();
        UsernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        WelcomePanel.setBackground(new java.awt.Color(153, 153, 153));
        WelcomePanel.setMaximumSize(new java.awt.Dimension(800, 100));
        WelcomePanel.setMinimumSize(new java.awt.Dimension(800, 100));
        WelcomePanel.setPreferredSize(new java.awt.Dimension(800, 100));

        WelcomeLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Register Staff");

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(WelcomeLabel)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        RegiserPanel.setBackground(new java.awt.Color(204, 204, 204));
        RegiserPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        RegiserPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        RegiserPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        SurnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        SurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SurnameLabel.setText("Surname");

        TelephoneLabel.setBackground(new java.awt.Color(255, 255, 255));
        TelephoneLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelephoneLabel.setText("Phone");

        RoleLabel.setBackground(new java.awt.Color(255, 255, 255));
        RoleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RoleLabel.setText("Role");

        UsernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UsernameLabel.setText("Username");

        PasswrodLabel.setBackground(new java.awt.Color(255, 255, 255));
        PasswrodLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswrodLabel.setText("Password");

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TelephoneTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        SurnameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AdminRadioButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AdminRadioButton.setText("Admin");
        AdminRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRadioButtonActionPerformed(evt);
            }
        });

        UserRadioButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        UserRadioButton.setText("User");
        UserRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserRadioButtonActionPerformed(evt);
            }
        });

        UsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RegisterButton.setBackground(new java.awt.Color(102, 255, 102));
        RegisterButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegisterButton.setText("Save");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(51, 204, 255));
        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 51, 51));
        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        IdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addGap(48, 48, 48)
                        .addComponent(RegisterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(DeleteButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelephoneLabel)
                            .addComponent(RoleLabel)
                            .addComponent(UsernameLabel)
                            .addComponent(PasswrodLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(AdminRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserRadioButton))
                                .addComponent(TelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SurnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameTextField)
                            .addComponent(IdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameLabel)
                    .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelephoneLabel)
                    .addComponent(TelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLabel)
                    .addComponent(AdminRadioButton)
                    .addComponent(UserRadioButton))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswrodLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(RegisterButton)
                    .addComponent(DeleteButton))
                .addGap(68, 68, 68))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search");

        javax.swing.GroupLayout RegiserPanelLayout = new javax.swing.GroupLayout(RegiserPanel);
        RegiserPanel.setLayout(RegiserPanelLayout);
        RegiserPanelLayout.setHorizontalGroup(
            RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegiserPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(search))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegiserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(249, 249, 249))
        );
        RegiserPanelLayout.setVerticalGroup(
            RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegiserPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegiserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WelcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addComponent(RegiserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegiserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRadioButtonActionPerformed
        if(AdminRadioButton.isSelected()){
            UserRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_AdminRadioButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
     try{
            int row = table.getSelectedRow();
            if(row == -1){
              Stafi s = new Stafi () ;
              
              
              //if(IdTextField.getText())
              
              if(IdTextField.getText() == "" || IdTextField.getText().length() < 3){                   
                  throw new LibraryException("Id should not be null or shorter than 3");
                 
              }
            int ErrorID = 0 ;//0 tregon error per id qe gjendet ne databaze, 1 tegon per error kur id nuk shkruhet si integer
            try{
              s.setStafiId(Integer.parseInt(IdTextField.getText())); 
            }catch(Exception ex){
                ErrorID = 1;
             //JOptionPane.showMessageDialog(this,"Id is not typed as INTEGER");
             
            }
            System.out.println("Hej2");
              if(NameTextField.getText() == "" || NameTextField.getText().length() < 3){
                  throw new LibraryException("Name should not be null or shorter than 3");                  
              }
              s.setSEmri(NameTextField.getText());
              
              if(SurnameTextField.getText() == "" || SurnameTextField.getText().length() < 3){
                  throw new LibraryException("Surname should not be null or shorter than 3");                  
              }              
              s.setSMbiemri(SurnameTextField.getText());
              
              if(TelephoneTextField.getText() == "" || TelephoneTextField.getText().length() < 9){
                  throw new LibraryException("Phone Number should not be null or shorter than 9");                  
              }              
              s.setSTel(TelephoneTextField.getText());
              
              if(!AdminRadioButton.isSelected() && !UserRadioButton.isSelected()){
                  throw new LibraryException("Admin or User should be checked");               
              }
              if(AdminRadioButton.isSelected()){
                  s.setSRoli(1);
              }
              else if(UserRadioButton.isSelected()){
                  s.setSRoli(0);
              }

              if(UsernameTextField.getText() == "" || UsernameTextField.getText().length() < 6){
                  throw new LibraryException("Username should not be null or shorter than 6");                  
              }              
              s.setSUser(UsernameTextField.getText());
              
              if(PasswordField.getText() == "" || PasswordField.getText().length() < 6){
                  throw new LibraryException("Password should not be null or shorter than 6");                  
              }              
              s.setSPassword(PasswordField.getText());
              

              try{
              srepo.create(s);
              }catch (LibraryException ex){
                  if(ErrorID == 1){
                   JOptionPane.showMessageDialog(this,"Id is not typed as INTEGER");
                     
                  }else{
                  JOptionPane.showMessageDialog(this,"Id already exists in database");
                  }
              }
            }else{
                Stafi s= sbtm.getStafi(row);
               
              //ID nuk ben te ndryshohet
              if(NameTextField.getText() == "" || NameTextField.getText().length() < 6){
                  
                  throw new LibraryException("Name should not be null or shorter than 6");
                                      
              }              
              s.setSEmri(NameTextField.getText());
              if(SurnameTextField.getText() == "" || SurnameTextField.getText().length() < 6){
                  throw new LibraryException ("Surname should not be null or shorter than 6");                  
              }              
              s.setSMbiemri(SurnameTextField.getText());
              
              if(TelephoneTextField.getText() == "" || TelephoneTextField.getText().length() < 6){
                  throw new LibraryException("Phone Number should not be null or shorter than 6");                  
              }              
              s.setSTel(TelephoneTextField.getText());
              
              if(!AdminRadioButton.isSelected() && !UserRadioButton.isSelected()){
                  throw new LibraryException("Admin or User should be checked");               
              }
              if(AdminRadioButton.isSelected()){
                  s.setSRoli(1);
              }
              else if(UserRadioButton.isSelected()){
                  s.setSRoli(0);
              }

              if(UsernameTextField.getText() == "" || UsernameTextField.getText().length() < 6){
                  throw new LibraryException("Username should not be null or shorter than 3");                  
              }              
              s.setSUser(UsernameTextField.getText());
              
              if(PasswordField.getText() == "" || PasswordField.getText().length() < 6){
                  throw new LibraryException("Password should not be null or shorter than 6");                  
              }              
              s.setSPassword(PasswordField.getText());
              
              srepo.edit(s);
                
                
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            Clear();
            this.loadTableModel();
     }catch(LibraryException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
            
        }
     
     
         
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
     
        this.table.clearSelection();
        Clear();      
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void UserRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserRadioButtonActionPerformed
        if(UserRadioButton.isSelected()){
            AdminRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_UserRadioButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
                try{
                    int row = table.getSelectedRow();
                    if(row != -1){
                        Object[] ob = {"Yes","No"} ;
                        int i = JOptionPane.showOptionDialog(this,"Would you like to delete the selected object ?","Delete", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
                        
                        if(i==0){
                         Stafi s = sbtm.getStafi(row);
                        srepo.delete(s);                       
                        }

                    
                    }else{
                    throw new LibraryException("Please select a staff from the table");
                    }
            this.Clear();
            this.loadTableModel();
        }   
        catch (LibraryException ex){
                   
          JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        StaffTableModel model = (StaffTableModel) this.table.getModel();
        String search = this.search.getText();//.toLowerCase();
        TableRowSorter<StaffTableModel> tr = new TableRowSorter<StaffTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void IdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTextFieldKeyPressed
        //KEY TYPE FOR ID
        try{ char c = evt.getKeyChar();
       if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
           getToolkit().beep();
          evt.consume();
          throw new LibraryException("Type ID as digits");
       }}catch (LibraryException ex){
           
       JOptionPane.showMessageDialog(this, ex.getMessage());
       this.IdTextField.setText("");
       }
    }//GEN-LAST:event_IdTextFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterStaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStaffGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadioButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswrodLabel;
    private javax.swing.JPanel RegiserPanel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JTextField SurnameTextField;
    private javax.swing.JLabel TelephoneLabel;
    private javax.swing.JTextField TelephoneTextField;
    private javax.swing.JRadioButton UserRadioButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

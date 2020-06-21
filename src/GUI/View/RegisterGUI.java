/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

/**
 *
 * @author Lenovo
 */
public class RegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterGUI
     */
    public RegisterGUI() {
        initComponents();
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
        RegisterLabel = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        WelcomePanel.setBackground(new java.awt.Color(153, 153, 153));
        WelcomePanel.setMaximumSize(new java.awt.Dimension(800, 100));
        WelcomePanel.setMinimumSize(new java.awt.Dimension(800, 100));
        WelcomePanel.setPreferredSize(new java.awt.Dimension(800, 100));

        WelcomeLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLabel.setText("Welcome to Library");

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanelLayout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(WelcomeLabel)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        RegiserPanel.setBackground(new java.awt.Color(204, 204, 204));
        RegiserPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        RegiserPanel.setMinimumSize(new java.awt.Dimension(800, 500));
        RegiserPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        RegisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setText("Register");

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        SurnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        SurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SurnameLabel.setText("Surname");

        TelephoneLabel.setBackground(new java.awt.Color(255, 255, 255));
        TelephoneLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TelephoneLabel.setText("Telephone");

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

        UsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelephoneLabel)
                            .addComponent(RoleLabel)
                            .addComponent(UsernameLabel)
                            .addComponent(PasswrodLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(AdminRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserRadioButton))
                                .addComponent(TelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SurnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
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
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout RegiserPanelLayout = new javax.swing.GroupLayout(RegiserPanel);
        RegiserPanel.setLayout(RegiserPanelLayout);
        RegiserPanelLayout.setHorizontalGroup(
            RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegiserPanelLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegiserPanelLayout.createSequentialGroup()
                        .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegiserPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))))
        );
        RegiserPanelLayout.setVerticalGroup(
            RegiserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegiserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterLabel)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(RegiserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(WelcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RegiserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadioButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswrodLabel;
    private javax.swing.JPanel RegiserPanel;
    private javax.swing.JLabel RegisterLabel;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

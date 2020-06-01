/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import Classes.User;

/**
 *
 * @author David
 */
public class SUProfile extends javax.swing.JFrame {
    User UC = new User();
    /**
     * Creates new form SUProfile
     */
    public SUProfile(String pst,String id,String username,String email, int contact, String password,int icno,String status) {
        initComponents();
        UC.setUserRole(pst);
        UC.setUserID(id);
        UC.setUsername(username);
        UC.setEmailAddress(email);
        UC.setContactNo(contact);
        UC.setPassword(password);
        UC.setICNO(icno);
        
        UserIDTextField.setText(id);
        UserIDTextField.setEditable(false);
        UsernameTextFIeld.setText(username);
        UsernameTextFIeld.setEditable(false);
        ContactTextField.setText(String.valueOf(contact));
        ContactTextField.setEditable(false);
        ICNOTextFIeld.setText(String.valueOf(contact));
        ICNOTextFIeld.setEditable(false);
        PasswordTextField.setText(password);
        PasswordTextField.setEditable(false);
        StatusTextField.setText(status);
        StatusTextField.setEditable(false);
        EmailTextField.setText(email);
        EmailTextField.setEditable(false);
        REPasswordTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserIDTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UsernameTextFIeld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ContactTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        REPasswordTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        StatusTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ICNOTextFIeld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Manage Profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 26, 170, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("User ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        UserIDTextField.setText("jTextField1");
        jPanel1.add(UserIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 220, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        UsernameTextFIeld.setText("jTextField1");
        jPanel1.add(UsernameTextFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, -1));

        ContactTextField.setText("jTextField1");
        jPanel1.add(ContactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 220, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, -1));

        EmailTextField.setText("jTextField1");
        jPanel1.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 220, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Re-EnterPassword");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 120, -1));

        REPasswordTextField.setText("jTextField1");
        jPanel1.add(REPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 220, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 70, -1));

        PasswordTextField.setText("jTextField1");
        jPanel1.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 220, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, -1));

        StatusTextField.setText("jTextField1");
        jPanel1.add(StatusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 220, -1));

        CancelButton.setText("Cancel");
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jButton2.setText("Edit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        SaveButton.setText("Save");
        jPanel1.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("ICNO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, -1));

        ICNOTextFIeld.setText("jTextField1");
        jPanel1.add(ICNOTextFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        EmailTextField.setEditable(true);
        ContactTextField.setEditable(true);
        PasswordTextField.setEditable(true);
        REPasswordTextField.setEditable(true);
        UsernameTextFIeld.setEditable(true);
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField ICNOTextFIeld;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField REPasswordTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField StatusTextField;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JTextField UsernameTextFIeld;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

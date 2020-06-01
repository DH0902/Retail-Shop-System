package Jframes;


import Classes.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class AdminProfile extends javax.swing.JFrame implements ValidationInterface {

    User UC = new User();
    boolean checkEmpty = false;
    boolean checkPassword = false;
    public AdminProfile(String pst, String id,String username,String email, int contact, String password,int icno) {
        initComponents();
        
        UC.setUserRole(pst);
        UC.setUserID(id);
        UC.setUsername(username);
        UC.setEmailAddress(email);
        UC.setContactNo(contact);
        UC.setPassword(password);
        UC.setICNO(icno);
        
        UsernameTextField.setText(username);
        UsernameTextField.setEditable(false);
        UserIDTextField.setText(id);
        UserIDTextField.setEditable(false);
        UserRoleTextField.setText(pst);
        UserRoleTextField.setEditable(false);
        EmailTextField.setText(email);
        EmailTextField.setEditable(false);
        ContactTextField.setText(String.valueOf(contact));
        ContactTextField.setEditable(false);
        PasswordField.setText(password);
        PasswordField.setEditable(false);
        NewPasswordField.setText("");
        NewPasswordField.setEditable(false);
        ICNOTextField.setText(String.valueOf(icno));
        ICNOTextField.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        RegisterFormClose = new javax.swing.JLabel();
        RegisterFormMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UsernameLabel10 = new javax.swing.JLabel();
        UsernameLabel11 = new javax.swing.JLabel();
        UsernameLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameLabel13 = new javax.swing.JLabel();
        UsernameLabel14 = new javax.swing.JLabel();
        UsernameLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        UsernameLabel16 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        UsernameLabel17 = new javax.swing.JLabel();
        ContactTextField = new javax.swing.JTextField();
        UsernameTextField = new javax.swing.JTextField();
        UserIDTextField = new javax.swing.JTextField();
        UserRoleTextField = new javax.swing.JTextField();
        ICNOTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        NewPasswordField = new javax.swing.JPasswordField();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 171, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        RegisterFormClose.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        RegisterFormClose.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFormClose.setText("X");
        RegisterFormClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterFormClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterFormCloseMouseClicked(evt);
            }
        });
        jPanel1.add(RegisterFormClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        RegisterFormMinimize.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        RegisterFormMinimize.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFormMinimize.setText("_");
        RegisterFormMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterFormMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterFormMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(RegisterFormMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 18, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 706, 60));

        jPanel2.setBackground(new java.awt.Color(252, 246, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel10.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel10.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel10.setText("User ID");
        jPanel2.add(UsernameLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        UsernameLabel11.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel11.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel11.setText("New Password");
        jPanel2.add(UsernameLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        UsernameLabel12.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel12.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel12.setText("Username");
        jPanel2.add(UsernameLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 630, 30));

        UsernameLabel13.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel13.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel13.setText("User Role");
        jPanel2.add(UsernameLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        UsernameLabel14.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel14.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel14.setText("Email Address");
        jPanel2.add(UsernameLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        UsernameLabel15.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel15.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel15.setText("Identification Number");
        jPanel2.add(UsernameLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 630, 30));

        UsernameLabel16.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel16.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel16.setText("Contact Number");
        jPanel2.add(UsernameLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        jPanel2.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        UsernameLabel17.setBackground(new java.awt.Color(203, 206, 145));
        UsernameLabel17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        UsernameLabel17.setForeground(new java.awt.Color(252, 118, 106));
        UsernameLabel17.setText("Password");
        jPanel2.add(UsernameLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        jPanel2.add(ContactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, -1));
        jPanel2.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, -1));
        jPanel2.add(UserIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 120, -1));
        jPanel2.add(UserRoleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 120, -1));
        jPanel2.add(ICNOTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 120, -1));
        jPanel2.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 120, -1));
        jPanel2.add(NewPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 150, -1));
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 710, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterFormCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterFormCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_RegisterFormCloseMouseClicked

    private void RegisterFormMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterFormMinimizeMouseClicked
        this.setState(RegisterForm.ICONIFIED);
    }//GEN-LAST:event_RegisterFormMinimizeMouseClicked

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        EmptyValidation();
        PasswordValidation();
        
        if(checkPassword == true && checkEmpty == true){
             try{
                FileInputStream fstream = new FileInputStream("Admin.txt"); //make a connection between system and text file
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream)); //start to read entire text file
                String line = "";
                StringBuilder data = new StringBuilder(); //read lines from text file then put into StringBuilder for editing use
                while ((line = br.readLine()) != null) { //if there is data in text file
                String values[] = line.split(","); //read every values between coma in a row and put into string array
                if (values.length>0) { //if array is not empty
                    if (values[0].equals(UserIDTextField.getText())) { //if the first data in array (id) is equal to student id in text field
                        String dataRow = UserIDTextField.getText()+","+  UsernameTextField.getText()+"," + ICNOTextField.getText() + "," +String.valueOf(PasswordField.getPassword())+","+ ContactTextField.getText()+
                        ","+ EmailTextField.getText() + "," + UserRoleTextField.getText()+",";
                        //id,name,password,level,contact,email,gender,usertype
                        data.append(dataRow); //make edit to this line
                        data.append("\n"); //put a new line
                    }
                    else {
                        data.append(line); //write remaining data from other users
                        data.append("\n"); //put a new line
                    }
                }
            }
            fstream.close(); //close the input stream
            FileWriter fw = new FileWriter("Admin.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data.toString()); //write the entire data in String Builder to text file
            bw.close(); //close buffered writer
            fw.close(); //close file writer
            JOptionPane.showMessageDialog(null,"Information updated.");
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        EmailTextField.setEditable(true);
        ContactTextField.setEditable(true);
        PasswordField.setEditable(true);
        NewPasswordField.setEditable(true);
    }//GEN-LAST:event_EditButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        User UC = new User();
        String id = UC.getUserID();
        String pst = UC.getUserRole();
        String username = UC.getUsername();
        String email = UC.getEmailAddress();
        int icno = UC.getICNO();
        int contact = UC.getContactNo();
        String password = UC.getPassword();
        AdminDashboard adm = new AdminDashboard(pst,id,username,email,contact,password,icno);
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public boolean EmptyValidation(){
        if(EmailTextField.getText().equals("") || ContactTextField.getText().equals("") ||
                String.valueOf(PasswordField.getPassword()) == null || String.valueOf(NewPasswordField.getPassword()) == null){
            JOptionPane.showMessageDialog(null,"Please check your text fields.");
            checkEmpty = false;
            return false;
        }
        else{
            return true;
        }
    }
            
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField ICNOTextField;
    private javax.swing.JPasswordField NewPasswordField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel RegisterFormClose;
    private javax.swing.JLabel RegisterFormMinimize;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JTextField UserRoleTextField;
    private javax.swing.JLabel UsernameLabel10;
    private javax.swing.JLabel UsernameLabel11;
    private javax.swing.JLabel UsernameLabel12;
    private javax.swing.JLabel UsernameLabel13;
    private javax.swing.JLabel UsernameLabel14;
    private javax.swing.JLabel UsernameLabel15;
    private javax.swing.JLabel UsernameLabel16;
    private javax.swing.JLabel UsernameLabel17;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void PasswordValidation() {
        checkPassword = true;
        if(!String.valueOf(PasswordField.getPassword()).equals(String.valueOf(NewPasswordField.getPassword()))){
            JOptionPane.showMessageDialog(null, "Please make sure your password is correct.");
            checkPassword = false;
        }
    }   
}

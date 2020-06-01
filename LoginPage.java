package Jframes;


import Classes.ProductManager;
import Jframes.AdminDashboard;
import Classes.User;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LoginPage extends javax.swing.JFrame {

    User UC = new User();
    ProductManager PM = new ProductManager();
    
    
    public LoginPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLayeredPanel = new javax.swing.JLayeredPane();
        PMLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginIDTextBox = new javax.swing.JTextField();
        LoginPasswordTextBox = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        LoginSelectionPanel = new javax.swing.JPanel();
        PMManageButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginLayeredPanel.setBackground(new java.awt.Color(252, 246, 245));
        LoginLayeredPanel.setLayout(new java.awt.CardLayout());

        PMLoginPanel.setBackground(new java.awt.Color(252, 246, 245));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 118, 106));
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 118, 106));
        jLabel2.setText("Password:");

        LoginIDTextBox.setBackground(new java.awt.Color(204, 204, 204));
        LoginIDTextBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        LoginPasswordTextBox.setBackground(new java.awt.Color(204, 204, 204));

        LoginButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PMLoginPanelLayout = new javax.swing.GroupLayout(PMLoginPanel);
        PMLoginPanel.setLayout(PMLoginPanelLayout);
        PMLoginPanelLayout.setHorizontalGroup(
            PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMLoginPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PMLoginPanelLayout.createSequentialGroup()
                        .addGroup(PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginIDTextBox)
                            .addComponent(LoginPasswordTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(PMLoginPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LoginButton)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        PMLoginPanelLayout.setVerticalGroup(
            PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMLoginPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LoginIDTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PMLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(LoginPasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(LoginButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        LoginLayeredPanel.add(PMLoginPanel, "card2");

        LoginSelectionPanel.setBackground(new java.awt.Color(137, 171, 227));

        PMManageButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        PMManageButton.setForeground(new java.awt.Color(252, 246, 245));
        PMManageButton.setText("Login Page");
        PMManageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PMManageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMManageButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LoginSelectionPanelLayout = new javax.swing.GroupLayout(LoginSelectionPanel);
        LoginSelectionPanel.setLayout(LoginSelectionPanelLayout);
        LoginSelectionPanelLayout.setHorizontalGroup(
            LoginSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginSelectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PMManageButton)
                .addGap(208, 208, 208))
        );
        LoginSelectionPanelLayout.setVerticalGroup(
            LoginSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PMManageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginLayeredPanel)
            .addComponent(LoginSelectionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LoginSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLayeredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PMManageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMManageButtonMouseEntered

    }//GEN-LAST:event_PMManageButtonMouseEntered

    private void PMManageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMManageButtonMouseExited

    }//GEN-LAST:event_PMManageButtonMouseExited

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
                String userIn = LoginIDTextBox.getText();
                String passIn = LoginPasswordTextBox.getText();
                boolean userFound = false;
                
                if(userIn.startsWith("AD")){
                    try {
                    File file = new File("Admin.txt");
                    Scanner sc = new Scanner(file);
                    String[] lineArr;
                    String dbUserType, dbUserID, dbUsername, dbPassword, dbEmailAddress;
                    int dbContactNo, dbICNO;
                    
                    while (sc.hasNext()) {
                        lineArr = sc.nextLine().split(",");
                        dbUserID = lineArr[0];
                        dbUsername = lineArr[1];
                        dbICNO = Integer.parseInt(lineArr[2]);
                        dbPassword = lineArr[3];            
                        dbContactNo = Integer.parseInt(lineArr[4]);
                        dbEmailAddress = lineArr[5];
                        dbUserType = lineArr[6];
                        
                        if (dbUserID.equals(userIn)) {
                            userFound = true;
                            if (dbPassword.equals(passIn)) {
                                JOptionPane.showMessageDialog(null, "Login Successful");
                                UC.setUserID(dbUserID);
                                UC.setUserRole(dbUserType);
                                UC.setUsername(dbUsername);
                                UC.setEmailAddress(dbEmailAddress);
                                UC.setContactNo(dbContactNo);
                                UC.setPassword(dbPassword);
                                UC.setICNO(dbICNO);
                                
                                LoginLog();
                               
                                String id = UC.getUserID();
                                String username = UC.getUsername();
                                String pst = UC.getUserRole();
                                String email = UC.getEmailAddress();
                                int contact = UC.getContactNo();
                                String password = UC.getPassword();
                                int icno = UC.getICNO();
                                
                                
                                AdminDashboard adm = new AdminDashboard(pst,id,username,email,contact,password,icno);
                                adm.setVisible(true);
                                AdminProfile adp = new AdminProfile(pst,id,username,email,contact,password,icno);
                                this.dispose();
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry, invalid Password");
                            }
                        }
                    }
                    
                } catch (FileNotFoundException | HeadlessException ea) {
                }
                }
                else if(userIn.startsWith("PM")){
                    try {
                    File file = new File("ProductManager.txt");
                    Scanner sc = new Scanner(file);
                    String[] lineArr;
                    String dbUserType, dbUserID, dbStatus, dbUsername, dbEmailAddress, dbPassword, dbRe_Password, dbGender, Status;
                    int dbContactNo, dbICNO;
                    
                    while (sc.hasNext()) {
                        lineArr = sc.nextLine().split(",");
                        dbUserID = lineArr[0];
                        dbUsername = lineArr[1];
                        dbICNO = Integer.parseInt(lineArr[2]);
                        dbPassword = lineArr[3];
                        dbContactNo = Integer.parseInt(lineArr[4]);
                        dbEmailAddress = lineArr[5];
                        dbUserType = lineArr[6];
                        dbStatus = lineArr[7];
                        
                        if (dbUserID.equals(userIn)) {
                            userFound = true;
                            if (dbPassword.equals(passIn)) {
                                JOptionPane.showMessageDialog(null, "Login Successful");
                                PM.setUserID(dbUserID);
                                
                                LoginLog();
                                
                                String id = PM.getUserID();
                                PMDashboard pm = new PMDashboard(id);
                                pm.setVisible(true);
                                this.dispose();
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry, invalid Password");
                            }
                        }
                    }
                    
                } catch (FileNotFoundException | HeadlessException ea) {
                }
                }
                else if(userIn.startsWith("SU")){
                    try {
                    File file = new File("Supplier.txt");
                    Scanner sc = new Scanner(file);
                    String[] lineArr;
                    String dbUserType, dbUserID, dbUserStatus, dbUsername, dbEmailAddress, dbPassword, dbStatus;
                    int dbContactNo, dbICNO;
                    
                    while (sc.hasNext()) {
                        lineArr = sc.nextLine().split(",");
                        dbUserID = lineArr[0];
                        dbUsername = lineArr[1];
                        dbICNO = Integer.parseInt(lineArr[2]);
                        dbPassword = lineArr[3];
                        dbContactNo = Integer.parseInt(lineArr[4]);
                        dbEmailAddress = lineArr[5];
                        dbUserType = lineArr[6];
                        dbStatus = lineArr[7];
                        
                        if (dbUserID.equals(userIn)) {
                            userFound = true;
                            if (dbPassword.equals(passIn)) {
                                JOptionPane.showMessageDialog(null, "Login Successful");
                                UC.setUserID(dbUserID);
                                UC.setUserRole(dbUserType);
                                UC.setUsername(dbUsername);
                                UC.setEmailAddress(dbEmailAddress);
                                UC.setContactNo(dbContactNo);
                                UC.setPassword(dbPassword);
                                UC.setICNO(dbICNO);
                                UC.setStatus(dbStatus);
                                
                                LoginLog();
                                
                                String id = UC.getUserID();
                                String username = UC.getUsername();
                                String pst = UC.getUserRole();
                                String email = UC.getEmailAddress();
                                int contact = UC.getContactNo();
                                String password = UC.getPassword();
                                int icno = UC.getICNO();
                                String status = UC.getStatus();
                                
                                
                                SUDashboard su1 = new SUDashboard();
                                su1.setVisible(true);
                                SUProfile sup = new SUProfile(pst,id,username,email,contact,password,icno,status);
                                this.dispose();
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry, invalid Password");
                            }
                        }
                    }
                    
                } catch (FileNotFoundException | HeadlessException ea) {
                }
                }
                if(!userFound){
                    JOptionPane.showMessageDialog(null, "Sorry, invalid username");
                }
    }//GEN-LAST:event_LoginButtonActionPerformed
  
    public void LoginLog(){
         Date date = new Date();
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
         if(LoginIDTextBox.getText().startsWith("PM")){
             try{
                FileWriter writer = new FileWriter("Login Log.txt", true);
                BufferedWriter filecontent = new BufferedWriter(writer);

                String Content = "" + PM.getUserRole() +"," + PM.getUserID() + "," + PM.getUsername() + "," + formatter.format(date) + ",";
                filecontent.write(Content);
                filecontent.newLine();
                filecontent.close();
                writer.close();
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
                
            }
        }
         else{
             try{
                FileWriter writer = new FileWriter("Login Log.txt", true);
                BufferedWriter filecontent = new BufferedWriter(writer);

                String Content = "" + UC.getUserRole() +"," + UC.getUserID() + "," + UC.getUsername() + "," + formatter.format(date) + ",";
                filecontent.write(Content);
                filecontent.newLine();
                filecontent.close();
                writer.close();
            
            } catch (IOException ex) {
                
            }
         }
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField LoginIDTextBox;
    private javax.swing.JLayeredPane LoginLayeredPanel;
    private javax.swing.JPasswordField LoginPasswordTextBox;
    private javax.swing.JPanel LoginSelectionPanel;
    private javax.swing.JPanel PMLoginPanel;
    private javax.swing.JLabel PMManageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
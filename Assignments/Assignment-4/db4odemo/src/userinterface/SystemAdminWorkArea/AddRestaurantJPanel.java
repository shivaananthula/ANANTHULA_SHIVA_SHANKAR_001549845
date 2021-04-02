/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author shiva
 */
public class AddRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddRestaurantJPanel
     */
    private RestaurantDirectory restaurantDirectory;
    private JPanel container;
    private EcoSystem system;
    public AddRestaurantJPanel(JPanel container, EcoSystem system, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.restaurantDirectory = restaurantDirectory;
        this.container = container;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhoneNo = new javax.swing.JTextField();
        lblPhoneNo1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAddRes = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblResName = new javax.swing.JLabel();
        lblStreetAdd = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtResName = new javax.swing.JTextField();
        txtStreetAddress = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 204));

        lblPhoneNo1.setText("Email:");

        btnSave.setText("Create Restaurant");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblAddRes.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        lblAddRes.setText(" Create Restaurant");

        lblResName.setText("Restaurant Name:");

        lblStreetAdd.setText("Address:");

        lblPhoneNo.setText("Phone no:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhoneNo1)
                    .addComponent(btnBack))
                .addGap(118, 118, 118)
                .addComponent(btnSave)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblResName)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStreetAdd)
                                        .addComponent(lblUsername)
                                        .addComponent(lblPhoneNo))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(109, 109, 109)
                        .addComponent(lblPassword)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lblAddRes)))
                .addGap(41, 314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAddRes)
                .addGap(18, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNo1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStreetAdd))))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtResName.getText();
        String address = txtStreetAddress.getText();
        String phone = txtPhoneNo.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String email = txtEmail.getText();

        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Phone No.");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        }  else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            JOptionPane.showMessageDialog(null, "Username Already Exists!");
        } else if (!restaurantDirectory.isPhoneUnique(phone)) {
            JOptionPane.showMessageDialog(null, "Phone no Already Registered!");
        } else {
            Restaurant restaurant = new Restaurant(name, address, phone, email);
            restaurant.setRestaurantId(restaurantDirectory.RestaurantList.size() +1);
            restaurantDirectory.AddRestaurant(restaurant);
            system.setRestaurantDirectory(restaurantDirectory);
            Employee employee = system.getEmployeeDirectory().createEmployee(restaurant.getRestaurantName());
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant has been added!");
            ResetFields();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public void ResetFields(){
        txtResName.setText("");
        txtStreetAddress.setText("");
        txtPhoneNo.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantJPanel manageRestaurantJPanel = (ManageRestaurantJPanel) component;
        manageRestaurantJPanel.populateRestaurants();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddRes;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNo1;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblStreetAdd;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtResName;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Demographic;
import Model.Address;
import Model.AccountInfo;
import Model.DrivingLicense;
import Model.MedicalRecord;
import Model.Person;

/**
 *
 * @author shiva
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    public Demographic demographic;
    public Address address;
    public AccountInfo savingsAccount;
    public AccountInfo checkingAccount;
    public DrivingLicense drivingLicense;
    public MedicalRecord medicalRecord;
    public Person person;
    
    public MainJFrame() {
        initComponents();
        this.demographic = new Demographic();
        this.address =  new Address();
        this.savingsAccount = new AccountInfo();
        this.checkingAccount =  new AccountInfo();
        this.drivingLicense = new DrivingLicense();
        this.medicalRecord = new MedicalRecord();
        this.person = new Person();
        
        this.person.demographicInfo = new Demographic();
        this.person.addressInfo = new Address();
        this.person.savingsAccount =new AccountInfo();
        this.person.checkingAccount = new AccountInfo();
        this.person.drivingLicense =  new DrivingLicense();
        this.person.medicalRecord = new MedicalRecord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        createDemographicButton = new javax.swing.JButton();
        createAddressButton = new javax.swing.JButton();
        createAccountInfoButton = new javax.swing.JButton();
        createDrivingLicenseButton = new javax.swing.JButton();
        createMedicalRecordButton = new javax.swing.JButton();
        viewDemographicButton = new javax.swing.JButton();
        viewAddressButton = new javax.swing.JButton();
        viewAccountInfoButton = new javax.swing.JButton();
        viewDrivingLicenseButton = new javax.swing.JButton();
        viewMedicalRecordButton = new javax.swing.JButton();
        reportDetails = new javax.swing.JButton();
        rightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(150);

        createDemographicButton.setText("Create Demographic Info");
        createDemographicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDemographicButtonActionPerformed(evt);
            }
        });

        createAddressButton.setText("Create Address Info");
        createAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAddressButtonActionPerformed(evt);
            }
        });

        createAccountInfoButton.setText("Create Accounts Info");
        createAccountInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountInfoButtonActionPerformed(evt);
            }
        });

        createDrivingLicenseButton.setText("Create DrivingLicense Info");
        createDrivingLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDrivingLicenseButtonActionPerformed(evt);
            }
        });

        createMedicalRecordButton.setText("Create Medical Record");
        createMedicalRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMedicalRecordButtonActionPerformed(evt);
            }
        });

        viewDemographicButton.setText("View Demographic Info");
        viewDemographicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDemographicButtonActionPerformed(evt);
            }
        });

        viewAddressButton.setText("View Address Info");
        viewAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAddressButtonActionPerformed(evt);
            }
        });

        viewAccountInfoButton.setText("View Accounts Info");
        viewAccountInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountInfoButtonActionPerformed(evt);
            }
        });

        viewDrivingLicenseButton.setText("View DrivingLicense Info");
        viewDrivingLicenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrivingLicenseButtonActionPerformed(evt);
            }
        });

        viewMedicalRecordButton.setText("View Medical Record");
        viewMedicalRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedicalRecordButtonActionPerformed(evt);
            }
        });

        reportDetails.setText("Report Details");
        reportDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createDemographicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAddressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAccountInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDrivingLicenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createMedicalRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDemographicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAddressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAccountInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDrivingLicenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewMedicalRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDemographicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAddressButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAccountInfoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createDrivingLicenseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createMedicalRecordButton)
                .addGap(32, 32, 32)
                .addComponent(viewDemographicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAddressButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAccountInfoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewDrivingLicenseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewMedicalRecordButton)
                .addGap(36, 36, 36)
                .addComponent(reportDetails)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPanel);

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(rightPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createMedicalRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMedicalRecordButtonActionPerformed
        // TODO add your handling code here:
        CreateMedicalRecordPanel createMedicalPanel = new CreateMedicalRecordPanel(medicalRecord, person);
        splitPane.setRightComponent(createMedicalPanel);
    }//GEN-LAST:event_createMedicalRecordButtonActionPerformed

    private void viewMedicalRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedicalRecordButtonActionPerformed
        // TODO add your handling code here:
        ViewMedicalRecord viewMedicalPanel = new ViewMedicalRecord(medicalRecord);
        splitPane.setRightComponent(viewMedicalPanel);
    }//GEN-LAST:event_viewMedicalRecordButtonActionPerformed

    private void createDemographicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDemographicButtonActionPerformed
        // TODO add your handling code here:
        CreateDemoGraphic createdemoPanel = new CreateDemoGraphic(demographic,person);
        splitPane.setRightComponent(createdemoPanel);
    }//GEN-LAST:event_createDemographicButtonActionPerformed

    private void viewDemographicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDemographicButtonActionPerformed
        // TODO add your handling code here:
        ViewDemoGraphic viewdemoPanel = new ViewDemoGraphic(demographic);
        splitPane.setRightComponent(viewdemoPanel);
    }//GEN-LAST:event_viewDemographicButtonActionPerformed

    private void createAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAddressButtonActionPerformed

        // TODO add your handling code here:
        CreateAddressPanel createAddressPanel = new CreateAddressPanel(address,person);
        splitPane.setRightComponent(createAddressPanel);
    }//GEN-LAST:event_createAddressButtonActionPerformed

    private void viewAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAddressButtonActionPerformed
        // TODO add your handling code here:
        ViewAddressPanel viewAddressPanel =  new ViewAddressPanel(address);
        splitPane.setRightComponent(viewAddressPanel);
    }//GEN-LAST:event_viewAddressButtonActionPerformed

    private void createAccountInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountInfoButtonActionPerformed
        // TODO add your handling code here:
        CreateBankAccountPanel bankAccPanel = new CreateBankAccountPanel(savingsAccount,checkingAccount,person);
        splitPane.setRightComponent(bankAccPanel);
    }//GEN-LAST:event_createAccountInfoButtonActionPerformed

    private void viewAccountInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountInfoButtonActionPerformed
        // TODO add your handling code here:
        ViewBankAccountPanel viewBankAccPanel = new ViewBankAccountPanel(savingsAccount, checkingAccount);
        splitPane.setRightComponent(viewBankAccPanel);
    }//GEN-LAST:event_viewAccountInfoButtonActionPerformed

    private void createDrivingLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDrivingLicenseButtonActionPerformed
        // TODO add your handling code here:
        CreateDrivingLicensePanel createLicensePanel = new CreateDrivingLicensePanel(drivingLicense, person);
        splitPane.setRightComponent(createLicensePanel);
    }//GEN-LAST:event_createDrivingLicenseButtonActionPerformed

    private void viewDrivingLicenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrivingLicenseButtonActionPerformed
        // TODO add your handling code here:
        ViewLicenseInformationPanel viewLicense = new ViewLicenseInformationPanel(drivingLicense);
        splitPane.setRightComponent(viewLicense);
    }//GEN-LAST:event_viewDrivingLicenseButtonActionPerformed

    private void reportDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportDetailsActionPerformed
        // TODO add your handling code here:
        ViewFullReportPanel fullReportPanel = new ViewFullReportPanel(person);
        splitPane.setRightComponent(fullReportPanel);
    }//GEN-LAST:event_reportDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountInfoButton;
    private javax.swing.JButton createAddressButton;
    private javax.swing.JButton createDemographicButton;
    private javax.swing.JButton createDrivingLicenseButton;
    private javax.swing.JButton createMedicalRecordButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton reportDetails;
    private javax.swing.JPanel rightPane;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton viewAccountInfoButton;
    private javax.swing.JButton viewAddressButton;
    private javax.swing.JButton viewDemographicButton;
    private javax.swing.JButton viewDrivingLicenseButton;
    private javax.swing.JButton viewMedicalRecordButton;
    // End of variables declaration//GEN-END:variables
}

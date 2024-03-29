/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Model.Demographic;

/**
 *
 * @author shiva
 */
public class ViewDemoGraphic extends javax.swing.JPanel {

    /**
     * Creates new form ViewDemoGraphic
     */
    public Demographic demographicInfo;
    public ViewDemoGraphic(Demographic demographic) {
        initComponents();
        this.demographicInfo = demographic;
        this.DisplayDemoGraphic();
        
    }
    
    public void DisplayDemoGraphic(){
       firstNameText.setText(this.demographicInfo.getFirstName());
       lastNameText.setText(this.demographicInfo.getLastName());
       phoneNumberText.setText(this.demographicInfo.getPhoneNumber());
       dateOfBirthText.setText(this.demographicInfo.getDateOfBirth());
       ageText.setText(Integer.toString(this.demographicInfo.getAge()));
       heightText.setText(Integer.toString(this.demographicInfo.getHeight()));
       weightText.setText(Integer.toString(this.demographicInfo.getWeight()));
       ssnText.setText(this.demographicInfo.getSocialSecurityNumber());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastNameText = new javax.swing.JTextField();
        ssn = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        ssnText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        dateOfBirthText = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        createDemoGraphicInfo = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        weightText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(169, 228, 220));

        lastNameText.setEditable(false);
        lastNameText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ssn.setBackground(new java.awt.Color(0, 255, 0));
        ssn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ssn.setText("SSN:");

        phoneNumber.setBackground(new java.awt.Color(0, 255, 0));
        phoneNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneNumber.setText("Phone Number:");

        ssnText.setEditable(false);
        ssnText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        phoneNumberText.setEditable(false);
        phoneNumberText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        dateOfBirth.setBackground(new java.awt.Color(0, 255, 0));
        dateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateOfBirth.setText("Date Of Birth:");

        dateOfBirthText.setEditable(false);
        dateOfBirthText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        age.setBackground(new java.awt.Color(0, 255, 0));
        age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        age.setText("Age:");

        ageText.setEditable(false);
        ageText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        createDemoGraphicInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createDemoGraphicInfo.setForeground(new java.awt.Color(255, 0, 0));
        createDemoGraphicInfo.setText("THE DEMOGRAPHIC INFORMATION OF THE PERSON IS AS FOLLOWS");

        height.setBackground(new java.awt.Color(0, 255, 0));
        height.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        height.setText("Height:");

        firstName.setBackground(new java.awt.Color(0, 255, 0));
        firstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstName.setText("First Name:");

        heightText.setEditable(false);
        heightText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        firstNameText.setEditable(false);
        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        weight.setBackground(new java.awt.Color(0, 255, 0));
        weight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weight.setText("Weight:");

        lastName.setBackground(new java.awt.Color(0, 255, 0));
        lastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastName.setText("Last Name:");

        weightText.setEditable(false);
        weightText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(createDemoGraphicInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lastNameText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(phoneNumberText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(dateOfBirthText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ageText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(heightText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(weightText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(createDemoGraphicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfBirthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel createDemoGraphicInfo;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JTextField dateOfBirthText;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel height;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JLabel ssn;
    private javax.swing.JTextField ssnText;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
}

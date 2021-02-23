/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shiva
 * This class stores all the info about the Medical Record.
 */
public class MedicalRecord {
    
    public String MedicalRecordNumber;
    public String Allergy1;
    public String Allergy2;
    public String Allergy3;

    public String getMedicalRecordNumber() {
        return MedicalRecordNumber;
    }

    public void setMedicalRecordNumber(String MedicalRecordNumber) {
        this.MedicalRecordNumber = MedicalRecordNumber;
    }

    public String getAllergy1() {
        return Allergy1;
    }

    public void setAllergy1(String Allergy1) {
        this.Allergy1 = Allergy1;
    }

    public String getAllergy2() {
        return Allergy2;
    }

    public void setAllergy2(String Allergy2) {
        this.Allergy2 = Allergy2;
    }

    public String getAllergy3() {
        return Allergy3;
    }

    public void setAllergy3(String Allergy3) {
        this.Allergy3 = Allergy3;
    }
    
    
}

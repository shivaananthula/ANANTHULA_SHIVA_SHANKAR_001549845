/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shiva
 */
public class Person {

    public Demographic demographicInfo;
    
    public Address addressInfo;
    
    public AccountInfo savingsAccount;
    
    public AccountInfo checkingAccount;
    
    public DrivingLicense drivingLicense;
    
    public MedicalRecord medicalRecord;

    public Demographic getDemographicInfo() {
        return demographicInfo;
    }

    public void setDemographicInfo(Demographic demographicInfo) {
        this.demographicInfo = demographicInfo;
    }

    public Address getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(Address addressInfo) {
        this.addressInfo = addressInfo;
    }

    public AccountInfo getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(AccountInfo savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public AccountInfo getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(AccountInfo checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    
    
           
}

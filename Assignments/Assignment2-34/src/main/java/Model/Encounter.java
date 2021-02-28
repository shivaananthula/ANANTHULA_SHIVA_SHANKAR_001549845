/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author shiva
 */
public class Encounter {
    
    public Date TimeStamp;
    
    public String HospitalName;
    
    public VitalSigns VitalsSigns;

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public VitalSigns getVitalsSigns() {
        return VitalsSigns;
    }

    public void setVitalsSigns(VitalSigns VitalsSigns) {
        this.VitalsSigns = VitalsSigns;
    }
    
    
}

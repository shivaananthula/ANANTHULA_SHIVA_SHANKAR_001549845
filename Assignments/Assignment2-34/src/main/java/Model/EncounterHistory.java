/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class EncounterHistory {
    
    public ArrayList<Encounter> EncounterHistory;

    public EncounterHistory() {
        this.EncounterHistory = new ArrayList<Encounter>();
    }
    

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }
    
    public void AddEncounter(Encounter enc){
        this.EncounterHistory.add(enc);
    }
}

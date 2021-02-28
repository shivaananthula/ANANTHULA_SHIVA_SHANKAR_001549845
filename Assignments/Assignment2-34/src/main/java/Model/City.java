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
public class City {
    
    public String Name;
    
    public ArrayList<Community> Communities;

    public City() {
        this.Communities = new ArrayList<Community>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Community> getCommunities() {
        return Communities;
    }

    public void setCommunities(ArrayList<Community> Communities) {
        this.Communities = Communities;
    }
    
    public void AddCommunities(Community community){
        this.Communities.add(community);
    }
    
    
    
    
}

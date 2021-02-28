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
public class Community {
    
    public String Name;
    
    public ArrayList<House> Houses;

    public Community() {
        this.Houses = new ArrayList<House>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<House> getHouses() {
        return Houses;
    }

    public void setHouses(ArrayList<House> Houses) {
        this.Houses = Houses;
    }
    
    public void AddHouses(House h){
        this.Houses.add(h);
    }
    
    
}

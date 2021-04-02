/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class DeliveryManDirectory {
    
    public ArrayList<DeliveryMan> DeliveryManList;

    public DeliveryManDirectory() {
        this.DeliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return DeliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> DeliveryManList) {
        this.DeliveryManList = DeliveryManList;
    }
    
    public void AddDeliveryMan(DeliveryMan deliveryman){
        this.DeliveryManList.add(deliveryman);
    }
    
    public boolean isPhoneUnique(String phone){
        for(DeliveryMan deliveryman: this.DeliveryManList){
            if(deliveryman.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(DeliveryMan deliver: this.DeliveryManList){
            if(deliver.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void DeleteDeliveryMan(int id){
        DeliveryMan toDelete = null;
        for(DeliveryMan deliverMan: this.DeliveryManList){
            if(deliverMan.getDeliveryManId()== id){
                toDelete = deliverMan;
            }
        }
        
        if(toDelete != null){
            this.DeliveryManList.remove(toDelete);
        }
    }
    
    public DeliveryMan getDeliverMan(int deliverManId){
        for(DeliveryMan d : this.DeliveryManList){
            if(d.getDeliveryManId()== deliverManId){
                return d;
            }
        }
        return null;
    }
    
    public void updateDeliveryMan(int id,String name,String phone,String email){
        for(DeliveryMan deliveryMan: this.DeliveryManList){
            if(deliveryMan.getDeliveryManId() == id){
                deliveryMan.setName(name);
                deliveryMan.setPhoneNumber(phone);
                deliveryMan.setEmail(email);
            }
        }
    }
    
    
}

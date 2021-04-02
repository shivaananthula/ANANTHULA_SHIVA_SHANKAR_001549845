/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class DeliveryMan {

    public DeliveryMan(String Name, String PhoneNumber, String Email, String VehicleType) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.VehicleType = VehicleType;
        this.OrderHistory = new ArrayList<Order>();
    }
    
    public int DeliveryManId;
    public String Name;
    public String PhoneNumber;
    public String Email;
    public String VehicleType;
    public String Address;
    public boolean IsAssigned;
    public ArrayList<Order> OrderHistory;

    public ArrayList<Order> getOrderHistory() {
        return OrderHistory;
    }

    public void setOrderHistory(ArrayList<Order> OrderHistory) {
        this.OrderHistory = OrderHistory;
    }

    public int getDeliveryManId() {
        return DeliveryManId;
    }

    public void setDeliveryManId(int DeliveryManId) {
        this.DeliveryManId = DeliveryManId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public boolean isIsAssigned() {
        return IsAssigned;
    }

    public void setIsAssigned(boolean IsAssigned) {
        this.IsAssigned = IsAssigned;
    }

}

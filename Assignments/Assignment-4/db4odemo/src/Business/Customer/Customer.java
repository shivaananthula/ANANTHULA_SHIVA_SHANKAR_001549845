/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Order.OrderStatus;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class Customer {
    public int CustomerId;
    public String Name;
    public String Phone;
    public String Street;
    public String Zipcode;
    public String Email;
    public ArrayList<Order> OrderHistory;

    public Customer(String Name, String Phone, String Street, String Zipcode, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Street = Street;
        this.Zipcode = Zipcode;
        this.Email = Email;
        this.OrderHistory = new ArrayList<Order>();
    }
    
    public void AddOrder(Order order){
        this.OrderHistory.add(order);
    }
    
    public ArrayList<Order> GetCompletedOrders(){
        ArrayList<Order> completedOrders = new ArrayList<Order>();
        
        for(Order order: this.OrderHistory){
            if(order.Status.equals(OrderStatus.Status.Completed))
                completedOrders.add(order);
        }
        return completedOrders;
    }
    
    public ArrayList<Order> GetActivreOrders(){
        ArrayList<Order> activeOrders = new ArrayList<Order>();
        
        for(Order order: this.OrderHistory){
            if(order.Status.equals(OrderStatus.Status.Active))
                activeOrders.add(order);
        }
        return activeOrders;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class OrderDirectory {
    
    public ArrayList<Order> Orders;

    public OrderDirectory() {
        this.Orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Order> Orders) {
        this.Orders = Orders;
    }
    
    public Order GetOrderById(int index){
        return this.Orders.get(index);
    }
    
    public void addNewOrder(Order order){
        this.Orders.add(order);
    }
    
    public Order RetrieveOrder(int OrderNo){
        for(Order order: this.Orders){
            if(order.OrderId == OrderNo){
                return order;
            }
        }
        return null;
    }
    
}

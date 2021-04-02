/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.Item;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class Order {
    
    public int OrderId;
    public Item OrderItem;
    public Customer customer;
    public Restaurant Restaurant;
    public DeliveryMan DeliveryManId;
    public OrderStatus.Status Status;
    public int Quantity;

    public Order(Customer customer, Restaurant Restaurant, DeliveryMan DeliveryManId, Item item, int quantity) {
        this.customer = customer;
        this.Restaurant = Restaurant;
        this.DeliveryManId = DeliveryManId;
        this.OrderItem = item;
        this.Quantity = quantity;
    }

    public OrderStatus.Status getStatus() {
        return Status;
    }

    public void setStatus(OrderStatus.Status Status) {
        this.Status = Status;
    }
    
    public void SetActive(){
        this.Status = Status.Active;
    }
    
    public void SetCompleted(){
        this.Status = Status.Completed;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public Item getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(Item OrderItem) {
        this.OrderItem = OrderItem;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(Restaurant Restaurant) {
        this.Restaurant = Restaurant;
    }

    public DeliveryMan getDeliveryManId() {
        return DeliveryManId;
    }

    public void setDeliveryManId(DeliveryMan DeliveryManId) {
        this.DeliveryManId = DeliveryManId;
    }
}

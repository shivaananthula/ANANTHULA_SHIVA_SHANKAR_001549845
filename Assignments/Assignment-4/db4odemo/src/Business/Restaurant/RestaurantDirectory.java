/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class RestaurantDirectory {
    public ArrayList<Restaurant> RestaurantList;

    public RestaurantDirectory() {
        this.RestaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return RestaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> RestaurantList) {
        this.RestaurantList = RestaurantList;
    }
    
     public void AddRestaurant(Restaurant restaurant){
        this.RestaurantList.add(restaurant);
    }
    
    public boolean isPhoneUnique(String phone){
        for(Restaurant restaurant: this.RestaurantList){
            if(restaurant.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Restaurant restaurant: this.RestaurantList){
            if(restaurant.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void DeleteRestaurant(int id){
        Restaurant toDelete = null;
        for(Restaurant restaurant: this.RestaurantList){
            if(restaurant.getRestaurantId()== id){
                toDelete = restaurant;
            }
        }
        
        if(toDelete != null){
            this.RestaurantList.remove(toDelete);
        }
    }
    
    public Restaurant getRestaurant(int restaurantId){
        for(Restaurant r : this.RestaurantList){
            if(r.getRestaurantId()== restaurantId){
                return r;
            }
        }
        return null;
    }
    
    public void updateDeliveryMan(int id,String name,String phone,String address, String email){
        for(Restaurant restaurant: this.RestaurantList){
            if(restaurant.getRestaurantId()== id){
                restaurant.setRestaurantName(name);
                restaurant.setPhoneNumber(phone);
                restaurant.setAddress(address);
                restaurant.setEmail(email);
            }
        }
    }
    
    
}

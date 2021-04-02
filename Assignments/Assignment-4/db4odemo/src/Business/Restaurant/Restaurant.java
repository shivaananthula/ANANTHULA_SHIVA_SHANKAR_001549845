/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.Item;
import Business.Menu.Menu;

/**
 *
 * @author shiva
 */
public class Restaurant {
    
    public int RestaurantId;
    public String RestaurantName;
    public String Address;
    public String PhoneNumber;
    public String Email;
    public Menu menu;

    public int getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(int RestaurantId) {
        this.RestaurantId = RestaurantId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Restaurant(String RestaurantName, String Address, String PhoneNumber, String Email) {
        this.RestaurantName = RestaurantName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.menu = new Menu();
    }
    
    public void AddItem(String ItemName,int Price ){
        Item item = new Item(ItemName,Price);
        this.menu.AddItem(item);
    }
    
    public void DeleteItem(int itemid){
        this.menu.DeleteItem(itemid);
    }

    public String getRestaurantNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, DeliveryManDirectory deliverymanDirectory, RestaurantDirectory restaurantDirectory, OrderDirectory orderDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliverymanDirectory, orderDirectory);
    }

    
    
}

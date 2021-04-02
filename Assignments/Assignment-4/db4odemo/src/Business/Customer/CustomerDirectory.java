/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class CustomerDirectory {
    
    public ArrayList<Customer> CustomerList;

    public CustomerDirectory() {
        this.CustomerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
    public void add(Customer customer){
        this.CustomerList.add(customer);
    }
    
    public Customer getCustomerId(int CustomerId){
        for(Customer c : this.CustomerList){
            if(c.getCustomerId() == CustomerId){
                return c;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Customer customer: this.CustomerList){
            if(customer.getPhone().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Customer customer: this.CustomerList){
            if(customer.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateCustomer(int id, String customerName, String customerPhone, String customerStreet,String customerZipcode,String customerEmail){
        for(Customer customer: this.CustomerList){
            if(customer.getCustomerId() == id){
                customer.setName(customerName);
                customer.setPhone(customerPhone);
                customer.setStreet(customerStreet);
                customer.setZipcode(customerZipcode);
                customer.setEmail(customerEmail);
            }
        }
    }
    
    public void DeleteCustomer(int id){
        Customer toDelete = null;
        for(Customer customer: this.CustomerList){
            if(customer.getCustomerId() == id){
                toDelete = customer;
            }
        }
        
        if(toDelete != null){
            this.CustomerList.remove(toDelete);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class Menu {
    
    public ArrayList<Item> ItemList;

    public Menu() {
        this.ItemList = new ArrayList<Item>();
    }

    public ArrayList<Item> getItemList() {
        return ItemList;
    }

    public void setItemList(ArrayList<Item> ItemList) {
        this.ItemList = ItemList;
    }
    
    public void AddItem(Item i){
        i.setItemId(this.ItemList.size() + 1);
        this.ItemList.add(i);
    }
    
    public Item getItem(int itemId){
        for(Item i: this.ItemList){
            if(i.getItemId() == itemId){
                return i;
            }
        }
        return  null;
    }
    
    public void DeleteItem(int id){
        ArrayList<Item> tempArrayList = this.ItemList;
        
        for(Item item: tempArrayList){
            if(item.getItemId() == id){
                this.ItemList.remove(item);
            }
        }
    }
    
    public Item RetrieveItem(int id){
        for(Item item: this.ItemList){
            if(item.getItemId() == id){
                return item;
            }
        }
        return null;
    }
    
    
}

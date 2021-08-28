package by.dm_bzh.grow.Dragon.main;

import java.io.Serializable;

public class Treasure implements Serializable {
    private String name;                                                //наименование сокровища
    private int price;                                                  //цена единицы сокровища
    private int quantity;                                               //количество данного сокровища    

    public Treasure(){
        this.name="";
        this.quantity=0;
        this.price=0;
    }
    
    public Treasure(String name, int quantity, int price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;        
        
    }
    public void setQuantity(int qt) {
        this.quantity=qt;        
    }   
    public void setName(String name) {
        this.name=name;        
    }   
    public void setPrice(int price) {
        this.price=price;        
    }       
    public int getPrice() {
        return price;        
    }
    public int getQuantity() {
        return quantity;        
    }
    public String getName() {
        return name;        
    }    
    public int getTotalCost() {
        return price*quantity;        
    }
    public String toString () {
        return String.format("%s, количество - %d, цена за единицу - %d", name, quantity, price);        
    }
    
    public boolean equals(Treasure tr) {
        if (this==tr) return true;
        if (name.equals(tr.name) && (price==tr.price) && (quantity==tr.quantity) ) return true;
        return false;
    }
    public int hashCode() {
        return name.hashCode()+price*quantity;        
    }
    public Treasure clone() {
        return new Treasure(name, quantity, price);
    }

}

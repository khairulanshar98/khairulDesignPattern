/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.CommandPattern;

/**
 *
 * @author khairulanshar
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;
    
    private void setQuantity(int qty){
        this.quantity +=qty;
    }
    
   

    public void buy(int qty) {
        System.out.println("Current Quantity: "+this.quantity);
        setQuantity(qty);
        System.out.println("Stock [ Name: " + name + ", Quantity: " + qty + " ] bought, Total: "+quantity);
    }

    public void sell(int qty) {
        System.out.println("Current Quantity: "+this.quantity);
        setQuantity(-qty);
        System.out.println("Stock [ Name: " + name + ", Quantity: " + qty + " ] sold, Total: "+quantity);
    }
}

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
public class BuyStock implements Order {

    private Stock abcStock;
    private int quantity=0;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public BuyStock(Stock abcStock, int quantity) {
        this(abcStock);
        this.quantity=quantity;
    }

    @Override
    public void execute() {
        abcStock.buy(quantity);
    }

}

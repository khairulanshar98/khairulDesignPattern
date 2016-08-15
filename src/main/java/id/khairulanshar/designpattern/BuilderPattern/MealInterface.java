/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.BuilderPattern;


/**
 *
 * @author khairulanshar
 */
public interface MealInterface {
    void addItem(Item item);
    float getCost();
    int getCount();
    void showItems();
}

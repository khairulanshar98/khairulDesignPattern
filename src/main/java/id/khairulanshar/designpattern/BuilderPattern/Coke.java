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
public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 7.0f;
    }

    @Override
    public String name() {
        return this.getClass().getName();
    }

    @Override
    public int count() {
        return 1;
    }
    
}

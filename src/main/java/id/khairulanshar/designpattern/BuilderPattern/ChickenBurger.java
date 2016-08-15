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
public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 28.0f;
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public String name() {
        String a=super.name();
        return a+" | " +this.getClass().getName();
    }
    
}

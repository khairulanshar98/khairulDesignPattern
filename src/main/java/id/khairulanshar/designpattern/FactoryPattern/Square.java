/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.FactoryPattern;

/**
 *
 * @author khairulanshar
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    
    @Override
    public void drawWithBorder(String color) {
        System.out.println("Inside Square::draw() method. Color: "+color);
    }
    
}

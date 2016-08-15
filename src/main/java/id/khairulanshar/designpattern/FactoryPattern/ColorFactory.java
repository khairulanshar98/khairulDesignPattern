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
public class ColorFactory {

    public Color getColor(String color) {
        System.out.println("Inside ColorFactory::getColor() method:"+color);
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else {
            return null;
        }
    }
}

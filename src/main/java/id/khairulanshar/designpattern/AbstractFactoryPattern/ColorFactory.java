/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.AbstractFactoryPattern;

import id.khairulanshar.designpattern.FactoryPattern.*;

/**
 *
 * @author khairulanshar
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        System.out.println("Inside AbstractFactory ColorFactory::getColor() method:"+color);
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }

}

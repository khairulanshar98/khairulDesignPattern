/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.DecoratorPattern;

import id.khairulanshar.designpattern.FactoryPattern.*;

/**
 *
 * @author khairulanshar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with no border");
        redCircle.draw();

        System.out.println("\nCircle of red border");
        redCircle.drawWithBorder("red");

        System.out.println("\nRectangle of red border");
        redRectangle.drawWithBorder("blue");
    }

}

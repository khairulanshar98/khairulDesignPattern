/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.PrototypePattern;

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
        ShapeCache.getInstance();
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        
        
        
        System.out.println("Has been initiated by ShapeCache.getInstance() and shapeCache.loadCache()");

        ShapeCache.loadCache2();

        Shape clonedShape11 = (Shape) ShapeCache.getShape("4");
        System.out.println("Shape : " + clonedShape11.getType());

        Shape clonedShape22 = (Shape) ShapeCache.getShape("5");
        System.out.println("Shape : " + clonedShape22.getType());

        Shape clonedShape33 = (Shape) ShapeCache.getShape("6");
        System.out.println("Shape : " + clonedShape33.getType());

    }

}

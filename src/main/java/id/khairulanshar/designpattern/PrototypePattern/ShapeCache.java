/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.PrototypePattern;

import java.util.Hashtable;

/**
 *
 * @author khairulanshar
 */
public class ShapeCache {

    private static ShapeCache instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private ShapeCache() {
    }

    //Get the only object available
    public static ShapeCache getInstance() {
        if (instance == null) {
            System.out.println("getInstance!");
            instance = new ShapeCache();
            shapeMap = new Hashtable<String, Shape>();
        }
        return instance;
    }

    private static Hashtable<String, Shape> shapeMap = null;

    public static Shape getShape(String shapeId) {
        if (shapeMap != null) {
            Shape cachedShape = shapeMap.get(shapeId);
            return (Shape) cachedShape.clone();
            //return cachedShape;
        }
        return null;
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache() {
        if (shapeMap != null) {
            Circle circle = new Circle();
            circle.setId("1");
            shapeMap.put(circle.getId(), circle);

            Square square = new Square();
            square.setId("2");
            shapeMap.put(square.getId(), square);

            Rectangle rectangle = new Rectangle();
            rectangle.setId("3");
            shapeMap.put(rectangle.getId(), rectangle);
        }
    }
    
    public static void loadCache2() {
        if (shapeMap != null) {
            Circle circle = new Circle();
            circle.setId("6");
            shapeMap.put(circle.getId(), circle);

            Square square = new Square();
            square.setId("4");
            shapeMap.put(square.getId(), square);

            Rectangle rectangle = new Rectangle();
            rectangle.setId("5");
            shapeMap.put(rectangle.getId(), rectangle);
        }
    }
}

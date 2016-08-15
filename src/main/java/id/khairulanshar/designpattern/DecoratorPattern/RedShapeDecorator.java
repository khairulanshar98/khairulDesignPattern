/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.DecoratorPattern;

import id.khairulanshar.designpattern.FactoryPattern.Shape;

/**
 *
 * @author khairulanshar
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
    }
    
    @Override
    public void drawWithBorder(String color) {
        super.drawWithBorder(color);
        setRedBorder(decoratedShape,color);
    }

    private void setRedBorder(Shape decoratedShape, String color) {
        System.out.println("Border Color: "+color+", Shape: "+decoratedShape.getClass().getSimpleName());
    }
}

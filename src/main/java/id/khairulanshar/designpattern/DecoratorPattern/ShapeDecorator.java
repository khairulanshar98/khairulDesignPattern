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
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    @Override
    public void draw() {
        System.out.println("Inside ShapeDecorator draw");
        decoratedShape.draw();
    }
    
    @Override
    public void drawWithBorder(String color) {
        System.out.println("Inside ShapeDecorator drawWithBorder");
        decoratedShape.drawWithBorder(color);
    }
}

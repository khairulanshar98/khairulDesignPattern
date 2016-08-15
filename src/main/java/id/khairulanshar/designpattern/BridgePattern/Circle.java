/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.BridgePattern;

/**
 *
 * @author khairulanshar
 */
public class Circle extends Shape {

    private int x, y, radius;
    private String color;
    
    private Circle(DrawAPI drawAPI,String color) {
        super(drawAPI, color);
        this.color = color;
    }

    public Circle(int x, int y, int radius, String color, DrawAPI drawAPI) {
        this(drawAPI,color);
        this.x = x;
        this.y = y;
        this.radius = radius;
        
    }

    @Override
    public void draw() {
        System.out.print("[Circle] ");
        drawAPI.drawCircle(radius, x, y, color);
    }

}

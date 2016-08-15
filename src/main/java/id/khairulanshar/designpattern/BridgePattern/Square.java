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
public class Square extends Shape {

    private int x, y;
    private String color;
    
    public Square(int x, int y, String color, DrawAPI drawAPI) {
        super(drawAPI, color);
        this.color = color;
        this.x = x;
        this.y = y;
        
    }

    @Override
    public void draw() {
        System.out.print("[Square] ");
        drawAPI.drawSquare(x, y, color);
    }

}

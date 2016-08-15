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
public class GreenSquare implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y, String color) {
        //do nothing
    }

    @Override
    public void drawSquare(int x, int y, String color) {
        System.out.println("Drawing Square[ color: " + color + ", x: " + x + ", " + y + "]");
    }

}

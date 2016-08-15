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
public interface DrawAPI {
    public void drawCircle(int radius, int x, int y, String color);
    public void drawSquare(int x, int y, String color);
}

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
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected String anyVariable;

    protected Shape(DrawAPI drawAPI,String color) {
        anyVariable="[Inside abstract class Shape, color: "+color+", class: "+drawAPI.getClass().getSimpleName()+"] ";
        System.out.print(anyVariable);
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

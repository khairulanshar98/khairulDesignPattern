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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape redCircle = new Circle(100, 100, 10, "red", new RedCircle());
        redCircle.draw();
        Shape greenCircle = new Circle(100, 100, 10, "green", new GreenCircle());
        greenCircle.draw();
        Shape blueCircle = new Circle(100, 100, 10, "blue", new BlueCircle());
        blueCircle.draw();
        
        Shape redSquare = new Square( 100, 10, "red", new RedSquare());
        redSquare.draw();
        Shape greenSquare = new Square( 100, 10, "green", new GreenSquare());
        greenSquare.draw();
        Shape blueSquare = new Square( 100, 10, "blue", new BlueSquare());
        blueSquare.draw();
    }

}

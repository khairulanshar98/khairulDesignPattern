/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.SingletonPattern;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject1 objecta = SingleObject1.getInstance();

        //show the message
        objecta.showMessage();
        System.out.println(objecta.getInitiatedDate().toString());
        try {
            Thread.sleep(5000);
            System.out.println((new java.util.Date()).toString());

            //Get the only object available
            SingleObject1 objectb = SingleObject1.getInstance();

            //show the message
            objectb.showMessage();
            System.out.println(objectb.getInitiatedDate().toString());
        } catch (InterruptedException ex) {}
    }

}

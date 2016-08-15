/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.SingletonPattern;

import java.util.Date;

/**
 *
 * @author khairulanshar
 */
public class SingleObject1 {

    //create an object of SingleObject
    private static SingleObject1 instance = null;

    private static Date initiatedDate = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject1() {}

    //Get the only object available
    public static SingleObject1 getInstance() {
        if (instance == null) {
            System.out.println("getInstance!");
            instance = new SingleObject1();
            initiatedDate = new Date();
        }
        return instance;
    }

    public void showMessage() {
        System.out.print("Hello World! ");
    }

    public Date getInitiatedDate() {
        return initiatedDate;
    }
}

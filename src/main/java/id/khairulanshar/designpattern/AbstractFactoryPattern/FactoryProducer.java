/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.AbstractFactoryPattern;

/**
 *
 * @author khairulanshar
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
      System.out.println("Inside FactoryProducer::getFactory() method:"+choice);
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}

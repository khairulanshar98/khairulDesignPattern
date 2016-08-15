/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.AdapterPattern;

/**
 *
 * @author khairulanshar
 */
public class AviPlayer implements AviMediaPlayer {

    @Override
    public void playAvi(String fileName) {
        System.out.println(this.getClass().getSimpleName()+" : Playing avi file. Name: "+ fileName);	
    }
    
}

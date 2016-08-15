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
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println(this.getClass().getSimpleName()+" : Playing vlc file. Name: "+ fileName);	
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
    
}

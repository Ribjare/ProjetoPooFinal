/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarm;

import Misc.Room;
import java.io.Serializable;


/**
 * 
 * @author Daniel
 */
public class FilmCamera extends Camera implements Serializable{
    
    public FilmCamera(){
        super(Room r);
        
    }
    
    @Override
    public void startFilming(){
        System.out.println("Just filmed you!");
    }
}

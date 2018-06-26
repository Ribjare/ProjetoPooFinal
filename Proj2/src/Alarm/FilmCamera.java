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
public class FilmCamera extends Camaras implements Serializable{
    
    private Room room;
    
    public FilmCamera(Room r){
        super(r);
        room = r;
    }
    
    /**
     * Método que devolve uma mensagem que avisa que foi feito um video.
     */
    public void startFilming(){
        System.out.println("Just filmed you!\n");
    }
    
    
}

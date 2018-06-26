/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarm;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Siren implements Serializable{
    
    private boolean active;
    private int volume;
    private final int DEFAULT_VOLUME=5;
    
    public Siren(){
        active=false;
        volume= DEFAULT_VOLUME;
        
    }
    
    public void changeVolume(int volume){
        this.volume=volume;
    }
    
    public void activate(){
        active=true;
    }

    public boolean isActive() {
        return active;
    }

    public int getVolume() {
        return volume;
    }
    
    
            
}

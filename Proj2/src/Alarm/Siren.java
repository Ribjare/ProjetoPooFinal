/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarm;

/**
 *
 * @author Daniel
 */
public class Siren {
    
    private boolean active;
    private int volume;
    
    public Siren(){
        active=false;
        volume= 5;
        
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

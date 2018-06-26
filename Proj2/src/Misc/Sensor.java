/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

/**
 *
 * @author Daniel
 */
public abstract class Sensor {
    private Room room;

    public Sensor(){
    }
    
    
    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room r) {
        room = r;
    }
    
}

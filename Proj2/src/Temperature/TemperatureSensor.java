/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;
import Misc.Room;

/**
 *
 * @author Daniel
 */

import Misc.Sensor;
public class TemperatureSensor extends Sensor{
    private boolean ON;
    
    public TemperatureSensor(Room r){
        super();
        super.setRoom(r);
        ON = false;
    }
    
    public boolean isON() {
        return ON;
    }
    
    public void setON(boolean turn) {
        ON = turn;
    }
    
    public double getTemperature(){
        return super.getRoom().getTemperature();
    }
     
}

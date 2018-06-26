/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

import Misc.Room;
import java.util.ArrayList;

/**
 *
 * @author Adriana
 */
public class TemperatureModule {

    //private int roomTemperature;
    private ArrayList<TemperatureSensor> sensors;
    private ArrayList<AirConditioner> ac;
    private boolean mode;//true-automatico; false-manual

//valores default
    private int VAR = 2;//variação
    private int IDEAL_TEMP = 23;//temperatura ideal

    public TemperatureModule() {
        mode = true;
        sensors = new ArrayList<>();
        ac = new ArrayList<>();
    }

    public void setMode(boolean b) {
        mode = b;
    }

    ///
    public void changeMode() {
        if (mode == true) {
            mode = false;
        } else {
            mode = true;
        }
    }

    ///
    public boolean getMode() {
        return mode;
    }

    ///
    public void setIdealTemperature(int temp, int var) {
        IDEAL_TEMP = temp;
        VAR = var;
    }

    //maneira manual
    public void setAirConditionerManual(int temp, Room room) {
        for (AirConditioner x : ac) {
            if (x.getRoom().equals(room)) {
                x.setTemperature(temp);
                return;
            }
        }
    }

    public void addSensors(TemperatureSensor tS) {
        sensors.add(tS);
    }

    public void addAirConditioner(AirConditioner aC) {
        ac.add(aC);
    }

//    public void s
    public void act() {

        for (TemperatureSensor ts : sensors) {

            if (ts.isON()) {

                System.out.println("Temperature Sensor is on.\n");
                System.out.println("Temperature: " + ts.getTemperature() + "ºC\n");

                for (AirConditioner ac : ac) {
                    
                    if (getMode()) {
                        
                        if (ts.getTemperature() < IDEAL_TEMP - VAR || ts.getTemperature() > IDEAL_TEMP + VAR) {

                            if (ts.getRoom().equals(ac.getRoom())) {
                                if (ac.isOn()) {
                                    System.out.println("The air conditioner is on.\n");
                                    ac.setTemperature(IDEAL_TEMP);
                                    System.out.println("Temperature is back to " + IDEAL_TEMP + "ºC\n");
                                }
                                System.out.println("The air conditioner is off.\n");
                            }
                        }
                    }
                    else{
                        if (ts.getRoom().equals(ac.getRoom())) {
                            setAirConditionerManual(IDEAL_TEMP, ac.getRoom());
                            System.out.println("The air conditioner is on.\n");
                            System.out.println("Temperature is at " + IDEAL_TEMP + "ºC\n");
                        }
                        
                    }

                }
            }

        }
    }

}

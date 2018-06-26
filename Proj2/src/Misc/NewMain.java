/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import Temperature.*;
import Alarm.*;
import Light.*;
import java.util.Scanner;



/**
 *
 * @author Adriana
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WiFi wifi = new WiFi();
        CenterConsole c1 = new CenterConsole("BatCave", 5);
        Room r1 = new Room("Sala");
        Door d1 = new Door();
        
        r1.addDoor(d1);
        
        Siren s = new Siren();
        AlarmModule am = new AlarmModule(s, r1);
        TemperatureSensor ts = new TemperatureSensor(r1);
        TemperatureModule tm = new TemperatureModule();
        AirConditioner ac = new AirConditioner(r1);
        LightSensor ls = new LightSensor(r1);
        Lamp l = new Lamp(r1);
        LightModule lm = new LightModule();
        Camera c = new Camera(r1);
        DoorSensor ds = new DoorSensor(r1);
        
        
        
        

        ///////Testar Temperatura////////
        r1.setTemperature(17);
        
        
        c1.setTemperatureModule(tm);
        c1.addSensors(ts);
        
        ts.setON(true);
        
        c1.addAirConditioner(ac);
        
//        ac.setON(true);
//        
//        tm.act();
        /////////Testar Luminosidade////////
        r1.setLight(40);
        
        c1.setLightModule(lm);
        c1.addLamp(l);
        c1.addSensor(ls);
//        
        
//        lm.act();

        /////////Testar Alarme////////

        MotionSensor ms = new MotionSensor(am);

        r1.setPersons(true);
        d1.setOpen(true);
        
        am.addDoorSensor(ds);
        am.addMotionSensor(ms);
        am.setOn(true);
        ds.setAlarmModule(am);
        ac.setOn(true);
        ts.setON(true);
        c1.setWifi(wifi);
        am.addCamera(c);
        
        
        c1.setAlarmModule(am);
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like manual or automatic?\n1-Manual\n2-Automatic");
        int i = scan.nextInt();
        switch (i) {
            case 2:
                c1.automatedAct();
                break;
            case 1:
                c1.manualAct();
                break;
            default:
                System.out.println("Choice not possible.\n");
                
                //am.act();
                break;
        }
        
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import Temperature.AirConditioner;
import Temperature.TemperatureSensor;
import Temperature.TemperatureModule;
import Alarm.*;
import Light.*;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class CenterConsole implements WiFi, Serializable{

    private String name;
    private int numero;
    private int id;
    //private ArrayList<Module> m;
    private LightModule lightModule;
    private AlarmModule alarmModule;
    private TemperatureModule temperatureModule;
    private boolean connected;

    private String info;

    /*
    private ArrayList<Room> rooms;
    private ArrayList<MotionSensor> ms;
    private ArrayList<DoorSensor> ds;
    private ArrayList<TemperatureSensor> ts;
    private ArrayList<LightSensor> ls;
    //private modules
    //
     */
    public CenterConsole(String name, int numero) {
        //m = new ArrayList<>();
        this.name = name;
        this.numero = numero;
        // m.get(0).getModule().
        id = 1;
    }

    public void connect() {
        connected = true;
    }

    public void disconnect(){
        connected = false;
    }
    
    public void setLightModule(LightModule lm) {
        this.lightModule = lm;
    }

    public void setAlarmModule(AlarmModule am) {
        this.alarmModule = am;
    }

    public void setTemperatureModule(TemperatureModule tm) {
        this.temperatureModule = tm;
    }

    public LightModule getLightModule() {
        return lightModule;
    }

    public AlarmModule getAlarmModule() {
        return alarmModule;
    }

    public TemperatureModule getTemperatureModule() {
        return temperatureModule;
    }

    public void automatedAct() {
        //alarme
        if (connected) {
            System.out.println("==========Alarms==========\n");
            Random rand = new Random();
            int i = rand.nextInt((2 - 1) + 1) + 1;
            if (i == 1) {
                for (DoorSensor d : alarmModule.getDoorSensor()) {
                    d.act();
                }
            } else {
                for (MotionSensor m : alarmModule.getMotionSensor()) {
                    m.act();
                }
            }
        } else {
            System.out.println("Wifi is disconnected.\n");
        }
        //temperatura
        System.out.println("==========Temperature==========\n");
        temperatureModule.act();
        //luz
        System.out.println("==========Light==========\n");
        lightModule.act();
    }

    public void manualAct() {
        Scanner scan = new Scanner(System.in);
        //alarme
        if (connected) {
            System.out.println("==========Alarms==========\n");
            System.out.println("Activate motion sensor?\n1-Yes\n2-No\n");
            int i = scan.nextInt();
            Random rand = new Random();
            int j = rand.nextInt((2 - 1) + 1) + 1;
            switch (i) {
                case 1:
                    if (j == 1) {
                        for (MotionSensor m : alarmModule.getMotionSensor()) {

                            m.setActive(true);
                            m.act();
                        }
                    } else {
                        for (DoorSensor d : alarmModule.getDoorSensor()) {
                            d.act();
                        }
                    }
                    break;
                case 2:
                    for (MotionSensor m : alarmModule.getMotionSensor()) {
                        m.setActive(false);
                    }
                    for (DoorSensor d : alarmModule.getDoorSensor()) {
                        d.act();
                    }
                    break;
                default:
                    System.out.println("Choice not possible.\n");
                    break;
            }

        } else {
            System.out.println("Wifi is disconnected.\n");
        }
        //temperatura
        System.out.println("==========Temperature==========\n");
        System.out.println("Ideal temperature: ");
        int k = scan.nextInt();
        System.out.println("Variation of temperature: ");
        int l = scan.nextInt();
        temperatureModule.setMode(false);
        temperatureModule.setIdealTemperature(k, l);
        temperatureModule.act();
        //luz
        System.out.println("==========Light==========\n");

        lightModule.setMode(false);
        lightModule.act();
    }

    //Temperature
    public void setAirConditionerManual(int temp, Room room) {
        temperatureModule.setAirConditionerManual(temp, room);
    }

    public void setIdealTemperature(int temp, int var) {
        temperatureModule.setIdealTemperature(temp, var);
    }

    public void changeTemperatureModuleMode() {
        temperatureModule.changeMode();
    }

    public void addSensors(TemperatureSensor tS) {
        temperatureModule.addSensors(tS);
    }

    public void addAirConditioner(AirConditioner aC) {
        temperatureModule.addAirConditioner(aC);
    }

    //Light
    public void setLightManual(int intensity, Room r) {
        lightModule.setLightManual(intensity, r);
    }

    public void setAllLightsManual(int intensity) {
        lightModule.setAllLightsManual(intensity);
    }

    public void changeLightModuleMode() {
        lightModule.getMode();
    }

    public void addLamp(Lamp p) {
        lightModule.addLamp(p);
    }

    public void addSensor(LightSensor l) {
        lightModule.addSensor(l);
    }

    //Alarm
    public void setPin(String pin) {
        alarmModule.setPin(pin);
    }

    public void addDoorSensor(DoorSensor d) {
        alarmModule.addDoorSensor(d);
    }

    public void addMotionSensor(MotionSensor s) {
        alarmModule.addMotionSensor(s);
    }

    public void addCamera(PhotoCamera c) {
        alarmModule.addCamera(c);
    }

    public void setSiren(Siren s) {
        alarmModule.setSiren(s);
    }

    //falta os gets dos modulos e 

    
    
    
//    @Override
//    public int getCode() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int generateCode() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}

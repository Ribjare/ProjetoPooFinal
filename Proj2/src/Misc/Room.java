/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import Alarm.Door;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Room {

    private double temperature;
    private int light;
    private boolean persons; //
    private Door door;
    private String name;

    // private 
    // private Array
    public Room(String name) {
        this.name = name;
        persons = false;
        temperature = 25;
        light = 0;

    }
    
    public void addDoor(Door d) {
        door = d;
    } 

    public double getTemperature() {
        return temperature;
    }

    public int getLight() {
        return light;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public void setPersons(boolean persons) {//
        this.persons = persons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasPersons() {//
        return persons;
    }
    
    public Door getDoor() {
        return door;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String s = "";
        s += "Sala: " + name;
        return s;
    }
}

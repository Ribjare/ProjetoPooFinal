package Alarm;

import java.util.ArrayList;
import java.util.Scanner;
import Misc.Room;
import java.io.Serializable;

/*
 * Cria um módulo de alarme que coordena 
 * os sensores associados e é responsável 
 * por informar o utilizador de que a divisão está a ser invadida.
 *
 *@author Adriana Oliveira e Daniel Alves
 */
public class AlarmModule implements Serializable{

    private ArrayList<DoorSensor> doorSensors;
    private ArrayList<MotionSensor> motionSensors;
    private ArrayList<Camera> cameras;
    private Siren siren;
    private String pin;
    private boolean on;
    private Room room;

    /**
     * Recebe uma sirene que soará se a divisão estiver a ser assaltada, inicia
     * o módulo desligado e cria listas para os sensores e câmaras.
     *
     */
    public AlarmModule(Siren s, Room r) {
        doorSensors = new ArrayList<>();
        motionSensors = new ArrayList<>();
        cameras = new ArrayList<>();
        on = false;
        if (s != null) {
            siren = s;
        }
        room = r;
        
    }

    /**
     * Método seletor que retorna uma lista de sensores de portas.
     * 
     * @return doorSensors - ArrayList de DoorSensor que representa essa lista
     */
    public ArrayList<DoorSensor> getDoorSensors() {
        return doorSensors;
    }

    /**
     * Método seletor que retorna uma lista de sensores de movimentos.
     * 
     * @return motionSensor - ArrayList de MotionSensor que representa essa lista
     */
    public ArrayList<MotionSensor> getMotionSensors() {
        return motionSensors;
    }

    /**
     * Método seletor que retorna uma lista de câmaras.
     * 
     * @return doorSensors - ArrayList de Camera que representa essa lista
     */
    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    /**
     * Método modificador que permite alterar o pin.
     *
     * @param pin - representa o novo pin
     */
    public void setPin(String pin) {
        if (pin.length() == 4) {
            this.pin = pin;
        }
    }

    /**
     * Método que permite mudar o estado do módulo, ligado ou desligado,
     * conforme a inserção do pin por parte do utilizador esteja certo ou não.
     *
     */
    public void verifyPin() {
        if (pin == null) {
            Scanner sca = new Scanner(System.in);
            System.out.println("New PIN: ");
            String l = sca.next();
            setPin(l);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Verify PIN: ");
        String p = scan.next();
        if (p.equals(pin)) {
            if (!isOn()) {
                on = true;
            } else {
                on = false;
            }
        }
    }

    /**
     * Método modificador que permite mudar o estado do módulo.
     *
     * @param on - representa esse novo estado
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Método seletor que devolve o estado do módulo.
     *
     * @return on - boolean que representa esse mesmo estado
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Método que permite adicionar um sensor de porta a uma lista.
     *
     * @param d - representa o sensor a ser adicionado
     */
    public void addDoorSensor(DoorSensor d) {
        doorSensors.add(d);
    }

    /**
     * Método que permite adicionar um sensor de movimento a uma lista.
     *
     * @param s - representa o sensor a ser adicionado
     */
    public void addMotionSensor(MotionSensor s) {
        motionSensors.add(s);
    }

    /**
     * Método que permite adicionar uma câmara a uma lista.
     *
     * @param c - representa a câmara a ser adicionada
     */
    public void addCamera(Camera c) {
        cameras.add(c);
    }
    
    ///NOT
    public Room getRoom(){
        return room;
    }

    /**
     * Método modificador que permite alterar a sirene associada ao módulo.
     *
     * @param s - representa essa nova sirene
     */
    public void setSiren(Siren s) {
        if (s != null) {
            siren = s;
        }
    }

    
    public void act() {
        verifyPin();
        if (isOn()) {
            System.out.println("PIN is incorrect.");
            siren.activate();
            System.out.println("Room is being robbed, turning on the siren!");//hahahahaah
            for (Camera c : cameras) {
                if (c.getRoom().equals(room)) {
                    System.out.println("Camera activated:\n");
                    c.randomCamera();
                    return;
                }
            }
        }
        else
            System.out.println("PIN is correct!");
    }

    /**
     * Método seletor que devolve uma lista de sensores de porta.
     *
     * @return doorSensor - o ArrayList de DoorSensor que será devolvido.
     */
    public ArrayList<DoorSensor> getDoorSensor() {
        return doorSensors;
    }

    /**
     * Método seletor que devolve uma lista de sensores de movimento.
     *
     * @return doorSensor - o ArrayList de MotionSensor que será devolvido.
     */
    public ArrayList<MotionSensor> getMotionSensor() {
        return motionSensors;
    }

    /**
     * Método seletor que devolve uma lista de câmaras.
     *
     * @return doorSensor - o ArrayList de Camera que será devolvido.
     */
    public ArrayList<Camera> getCamera() {
        return cameras;
    }

    /**
     * Método seletor que devolve a sirene associada ao módulo.
     *
     * @return siren - Siren que representa essa sirene
     */
    public Siren getSiren() {
        return siren;
    }

    /**
     * Método seletor que devolve o pin do módulo.
     *
     * @return pin - String que representa esse pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * Método seletor que devolve a referência deste módulo
     *
     * @return this - AlarmModule que representa esta classe
     */
    public AlarmModule getModule() {
        return this;
    }
}

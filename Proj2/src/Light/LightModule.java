package Light;

import java.util.ArrayList;
import java.util.Scanner;
import Misc.Room;
import java.io.Serializable;
import java.util.Iterator;

/**
 * Cria um módulo de luminosidade que coordena o sensores associados e regula a
 * luminosidade da divisão em que se encontra.
 *
 * @author Adriana Oliveira e Daniel Alves
 */
public class LightModule implements Serializable{

    private ArrayList<Lamp> lamps;
    private ArrayList<LightSensor> lightSensors;
    private boolean mode;//true-automatico; false-manual

    /**
     * Não recebe nada por parâmetro, inicia a lista de Lamp e a lista de
     * LightSensor.
     *
     */
    public LightModule() {
        lamps = new ArrayList<>();
        lightSensors = new ArrayList<>();
        mode = true;
    }

    /**
     * Permite adicionar uma lâmpada à lista.
     *
     * @param p - Lamp que representa essa lâmpada
     */
    public void addLamp(Lamp p) {
        lamps.add(p);
    }

    /**
     * Permite adicionar um sensor de luminosidade à lista.
     *
     * @param l - LightSensor que representa esse sensor
     */
    public void addSensor(LightSensor l) {
        lightSensors.add(l);
    }

    public boolean isMode() {
        return mode;
    }

    //maneira manual
    public void setLightManual(int intensity, Room r) {
        for (Iterator<Lamp> it = lamps.iterator(); it.hasNext();) {
            Lamp l = it.next();
            if (l.getRoom().equals(r)) {
                l.changeLigth(intensity);
                return;
            }
        }
    }

    public void setAllLightsManual(int intensity) {
        lamps.forEach((l) -> {
            l.changeLigth(intensity);
        });
    }
    ///

    public void setMode(boolean b) {
        mode = b;
    }

    ///
    public boolean getMode() {
        return mode;
    }

//not sure
    public void act() {

        for (LightSensor ls : lightSensors) {

            System.out.println("Light is at " + ls.getLightIntensity() + "%\nLight sensor is on.");
            if (isMode()) {
                for (Lamp l : lamps) {
                    if (ls.getRoom().equals(l.getRoom())) {
                        if (ls.getLightIntensity() < 30) {
                            l.changeLigth(20);
                            System.out.println("Light at 20%");
                            return;
                        } else if (ls.getLightIntensity() > 80) {
                            l.changeLigth(0);
                            System.out.println("Light at 80%");
                            return;
                        } else {
                            l.changeLigth(10);
                            System.out.println("Light is at 10%");
                            return;
                        }
                    }
                }
            } else {
                Scanner scan = new Scanner(System.in);
                System.out.println("Light: ");
                int t = scan.nextInt();
                
                setAllLightsManual(t);
                System.out.println("Light is at " + t + "%\n");
            }

        }
    }
}

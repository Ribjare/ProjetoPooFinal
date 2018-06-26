package Alarm;

import Alarm.AlarmModule;
import Misc.Room;
import Misc.Sensor;

/**
 * Cria um sensor de porta que verifica se a porta se encontra aberta ou
 * fechada.
 *
 * @author Adriana oliveira e Daniel Alves
 */
public class DoorSensor extends Sensor {

    
    private Door door;
    private AlarmModule alarmModule;

    /**
     * Recebe referência da divisão em que se encontra e inicializa o atributo
     * door com a referência do objecto que se encontra na classe Room.
     *
     * @param r - representa essa divisão
     */
    public DoorSensor(Room r) {
        super();
        super.setRoom(r);
        door = r.getDoor();
    }

    /**
     * Método modificador que altera a referência do módulo de alarme associado.
     * 
     * @param am - AlarmModule que representa essa nova referência
     */
    public void setAlarmModule(AlarmModule am) {
        this.alarmModule = am;
    }

    /**
     * Método seletor que devolve o estado da porta, se se encontra aberta ou
     * fechada.
     *
     * @return door.isOpen() - método seletor da classe Door que devolve um
     * boolean
     */
    public boolean isOpen() {
        return door.isOpen();
    }

    /**
     * Método que gere toda a classe.
     */
    public void act() { // VER
        if (alarmModule.isOn()) {
            if (isOpen()) {
                System.out.println("Door Sensor activated.\n");
                alarmModule.act();
            }
        }
    }

}

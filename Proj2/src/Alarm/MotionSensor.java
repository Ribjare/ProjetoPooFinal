package Alarm;

import Alarm.AlarmModule;
import Misc.Sensor;

/**
 * Cria um sensor que
 *
 * @author Daniel
 */
public class MotionSensor extends Sensor {

    private AlarmModule alarmModule;//subtituir pelo wifi
    private boolean active;

    public MotionSensor(AlarmModule am) {
        super();
        alarmModule = am;
        super.setRoom(alarmModule.getRoom());
        active = false;
    }

    public boolean isMotion() {
        return super.getRoom().hasPersons();
    }

    public void setAlarmModule(AlarmModule am) {
        this.alarmModule = am;
    }

    public AlarmModule getAlarmModule() {
        return alarmModule;
    }

    public void setActive(boolean ac) {
        active = ac;
    }

    public void act() {
        if (isMotion()) {
            System.out.println("Motion Sensor activated.\n");
            alarmModule.act();
        }

    }
}

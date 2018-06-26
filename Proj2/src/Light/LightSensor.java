
package Light;

import Misc.Room;
import Misc.Sensor;
import java.io.Serializable;

/**
 * Cria um sensor que verifica o nível de intencidade da luz 
 * de uma divisão.
 * 
 * @author Adriana Oliveira e Daniel Alves
 */
public class LightSensor extends Sensor implements Serializable{
    
    //private
    
    /**
     * Recebe uma referência para a divisão em que se encontra.
     * 
     * @param r - Room que representa essa divisão
     */
    public LightSensor(Room r){
        super();
        super.setRoom(r);
    }
    /*
    em percentagem
    */
    
    /**
     * Método seletor que retorna a luminosidade da divisão.
     * 
     * @return super.getRoom().getLight() - int que representa a 
     *                                      luminosidade da divisão em percentagem
     */
    public int getLightIntensity(){ //int to double, percentagem pode ser double
        return super.getRoom().getLight();
    }
}

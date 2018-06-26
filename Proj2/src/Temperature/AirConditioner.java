
package Temperature;

import Misc.Atuadores;
import Misc.Room;

/**
 * Cria um ar condicionado que, em modo automático, 
 * vai contrariar a temperatura do quarto quando esta 
 * é inferior a 21ºC ou superior a 25ºC, e que, em 
 * modo manual, liga-se à temperatura inserida pelo 
 * utilizador e mantém-na até que seja dito o contrário, 
 * neste, o modo automático é desligado.
 *
 * @author Adriana Oliveira e Daniel Alves
 */
public class AirConditioner extends Atuadores{
    private boolean on; 
    private int temperature;
    private Room room; 

    /**
     * Recebe a referência da divisão em que está localizado, 
     * encontra-se desligado e a temperatura inicial a 23ºC.
     * 
     */
    public AirConditioner(Room r) {
        if(r != null)
            room = r;
        on=false;
        temperature = 23;// default do automatico
    }
    
    /**
     * Método seletor que indica a divisão em que o ar condicionado 
     * está localizado.
     * 
     * @return room - objecto que representa a divisão
     */
    public Room getRoom() {
        return room;
    }
    
    /**
     * Método seletor que indica a temperatura do ar condicionado.
     * 
     * @return temperature - int que representa essa temperatura
     */
    public int getTemperature() {
        return temperature;
    }
    
    /**
     * Metodo modificador que permite mudar a temperatura do
     * ar condicionado.
     * 
     * @param temp - representa a nova temperatura
     */
    public void setTemperature(int temp){
        if(temp >= 16 && temp <= 28) {
            temperature = temp;
            room.setTemperature(temperature);
        }
    }

    /**
     * Método seletor que indica se o ar condicionado está
     * ligado ou desligado.
     * 
     * @return on - boolean que representa esse estado
     */
    public boolean isOn() {
        return on;
    }
    
    /**
     * Método modificador que permite mudar o estado 
     * do ar condicionado.
     * 
     * @param turn - boolean que representa esse novo estado
     */
    public void setOn(boolean turn) {
        on = turn;
    }
    
}

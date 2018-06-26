
package Light;

import Misc.Atuadores;
import Misc.Room;

/**
 *Cria uma lâmpada que irá regular a luminosidade 
 * da divisão em que se encontra.
 * 
 * @author Adriana Oliveira e Daniel Alves
 */
public class Lamp extends Atuadores{
    private boolean on;
    
    /**
     * Recebe referência da divisão em que 
     * se encontra, iniciando-se como apagada.
     * 
     * @param r - referência da divisão a que está associada
     */
    public Lamp(Room r){
        super.setRoom(r);
        
        on = false;
    }
    
    /**
     * Método modificador que permite alterar a luminosidade
     * da divisão.
     * 
     * @param l - int que representa essa nova luminosidade
     */
    public void changeLigth(int l){
        if(l>0 &&l<20)
            getRoom().setLight((l*100)/20); //20 -> 100%; x -> y%; y=(x*100)/20;
        
    
    }
    
    /**
     * Método seletor que devolve o estado da lâmpada.
     * 
     * @return on - boolean que reresenta esse mesmo estado
     */
    public boolean isOn() {
        return on;
    }
}
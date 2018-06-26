
package Alarm;

import java.io.Serializable;

/**
 * Cria uma porta para a divisão, que poderá estar aberta ou fechada.
 * 
 * @author Adriana Oliveira e Daniel Alves
 */
public class Door implements Serializable{
    private boolean open;
    
    /**
     * Não recebe nada por parâmetros e inicia-se como fechada.
     */
    public Door() {
        open = false;
    }
    
    /**
     * Método modificador que permite alterar o estado da porta.
     * 
     * @param open - representa esse novo estado
     */
    public void setOpen(boolean open) {
        this.open = open;
    }
    
    /**
     * Método seletor que devolve o estado da classe.
     * 
     * @return open - boolean que representa esse estado
     */
    public boolean isOpen() {
        return open;
    }
}

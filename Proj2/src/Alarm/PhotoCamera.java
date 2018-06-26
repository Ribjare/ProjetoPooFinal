
package Alarm;

import java.util.Random;
import Misc.Atuadores;
import Misc.Room;
import java.io.Serializable;

/**
 * Cria uma câmara que pode tirar fotografias ou filmar.
 * 
 * @author Adriana Oliveira e Daniel Alves
 */
public class PhotoCamera extends Camaras implements Serializable{
    private Room room;
    public PhotoCamera(Room r){
        super(r);
        room = r;
    }
    
    /**
     * Método que devolve uma mensagem que avisa que foi tirada uma fotografia.
     */
    public void takePicture(){
        System.out.println("Took a picture!\n");
    }
    
    
    
    
}


package Alarm;

import java.util.Random;
import Misc.Atuadores;
import Misc.Room;

/**
 * Cria uma câmara que pode tirar fotografias ou filmar.
 * 
 * @author Adriana Oliveira e Daniel Alves
 */
public class Camera extends Atuadores{
    private boolean foto; //True-foto; False-Film
    private Room room;
    
    /**
     * Recebe a referência a que está associada e inica-se como uma
     * câmara de filmar.
     * 
     * @param r - Room que representa a referência da divisão
     */
    public Camera(Room r){
        foto = false;
        room = r;
    }
    
    /**
     * Método seletor que devolve o estado da classe e consequentemente 
     * o tipo de câmara a ser utilizada.
     * 
     * @return foto - boolean que representa o tipo de câmara
     */
    public boolean isFoto(){
        return foto;
    }
    
    /**
     * Método seletor que devolve a divisão a que a classe está associada.
     * 
     * @return room - Room que representa essa referência
     */
    @Override
    public Room getRoom() {
        return room;
    }
    /**
     * Método que gera aletoriamente a câmara a ser utilizada
     */
    public void randomCamera() {
        Random rand = new Random();
        int i = rand.nextInt((2 - 1) + 1) + 1;
        if(i == 1)
            takePicture();
        else
            startFilming();
    }
    
    /**
     * Método que devolve uma mensagem que avisa que foi tirada uma fotografia.
     */
    public void takePicture(){
        System.out.println("Took a picture!\n");
    }
    
    /**
     * Método que devolve uma mensagem que avisa que foi feito um video.
     */
    public void startFilming(){
        System.out.println("Just filmed you!\n");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarm;

import Misc.Atuadores;
import Misc.Room;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Adriana
 */
public class  Camaras extends Atuadores implements Serializable {
    private boolean foto; //True-foto; False-Film
    private Room room;
    
    /**
     * Recebe a referência a que está associada e inica-se como uma
     * câmara de filmar.
     * 
     * @param r - Room que representa a referência da divisão
     */
    public Camaras(Room r){
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
    public Room getRoom() {
        return room;
    }
    
    /**
     * Método que tira uma foto ou faz um video
     */
    public void action(){
        if(isFoto()){
            PhotoCamera pc = new PhotoCamera(room);
            pc.takePicture();
        }
        else{
            FilmCamera fc = new FilmCamera(room);
            fc.startFilming();
        }
    }
}

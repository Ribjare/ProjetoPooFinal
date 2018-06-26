/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.UUID;

/**
 *
 * @author Adriana
 */
public class WiFi {

    //private int id;
    private boolean connected;

    public WiFi() {
        connected = true;
    }
  
  public boolean isConnected() {
      return connected;
  }
  
}

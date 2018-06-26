/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author Adriana
 */
public class RF1 extends TabPane {

    public RF1() {
        Tab intro = new Tab("Introdução");
        this.getTabs().add(intro);
        intro.setClosable(false);
        
        GridPane dp = new GridPane();
        dp.setHgap(10);
        dp.setVgap(10);
        dp.setPadding(new Insets(20, 20, 20, 20));
        dp.setGridLinesVisible(false);
        
        intro.setContent(dp);
        
        //User
        Label nameLabel = new Label("Nome do Utilizador:");
        TextField nameField = new TextField();

        //Divisoes
        Label numLabel = new Label("Número de Divisões:");
        TextField numField = new TextField();

        //Modulos
        Label modLabel = new Label("Módulos e Sensores:");
        CheckBox modTempCheck = new CheckBox("Módulo de Controlo de Temperatura");
        CheckBox modLumCheck = new CheckBox("Módulo de Controlo de Luminosidade");
        CheckBox modAlarmCheck = new CheckBox("Módulo de Alarm");

        //Sensores
        CheckBox lumCheck = new CheckBox("Sensor de Luminosidade");
        CheckBox tempCheck = new CheckBox("Sensor de Temperatura");
        CheckBox portaCheck = new CheckBox("Sensor de Porta Aberta");
        CheckBox movCheck = new CheckBox("Sensor de Movimento");

        //Atuadores
        Label atuaLabel = new Label("Atuadores:");
        CheckBox lampCheck = new CheckBox("Lâmpada");
        CheckBox tomCheck = new CheckBox("Tomada");
        CheckBox acCheck = new CheckBox("Ar Condicionado");
        CheckBox sirCheck = new CheckBox("Sirene");
        CheckBox fotoCheck = new CheckBox("Câmara Fotográfica");
        CheckBox vidCheck = new CheckBox("Câmara de Vídeo");

        //Distribuicao
        
        
        
        
        
        
        

        dp.add(nameLabel, 0, 1);
        dp.add(nameField, 0, 1);
        nameField.setTranslateX(nameField.getTranslateX()+120);
        nameField.setMaxWidth(200);
        

        dp.add(numLabel, 0, 3);
        dp.add(numField, 0, 3);
        numField.setTranslateX(numField.getTranslateX()+120);
        numField.setMaxWidth(50);
        numField.setOnInputMethodTextChanged(e->{
            if(numField.getText().trim().contains("[a-zA-Z]+")){
                Alert alert = new Alert(AlertType.WARNING);
                alert.setContentText("São só permitidos números");
                alert.setTitle("Warning");
                alert.setHeaderText("Alert Message");
                alert.showAndWait();
            }
        });
        
      
        dp.add(modLabel, 0, 4);
        dp.add(modAlarmCheck, 0, 5);
        dp.add(portaCheck,0, 6);
        portaCheck.setDisable(true);
        portaCheck.setTranslateX(portaCheck.getTranslateX()+20);
        dp.add(movCheck, 0, 7);
        movCheck.setDisable(true);
        movCheck.setTranslateX(movCheck.getTranslateX()+20);
        
        dp.add(modLumCheck, 0, 8);
        dp.add(lumCheck, 0, 9);
        lumCheck.setDisable(true);
        lumCheck.setTranslateX(lumCheck.getTranslateX()+20);
       
        dp.add(modTempCheck, 0, 10);
        dp.add(tempCheck,0, 11);
        tempCheck.setDisable(true);
        tempCheck.setTranslateX(tempCheck.getTranslateX()+20);
        
        modAlarmCheck.setOnAction(e->{
            if(!modAlarmCheck.isSelected()){
                portaCheck.setDisable(true);
                portaCheck.setSelected(false);
                
                movCheck.setDisable(true);
                movCheck.setSelected(false);
                
                fotoCheck.setDisable(true);
                fotoCheck.setSelected(false);
                
                vidCheck.setDisable(true);
                vidCheck.setSelected(false);
                
                sirCheck.setDisable(true);
                sirCheck.setSelected(false);
            }
            else{
                portaCheck.setDisable(false);
                movCheck.setDisable(false);
                
                fotoCheck.setDisable(false);
                
                vidCheck.setDisable(false);
                
                sirCheck.setDisable(false);
            }
        });
        
        modLumCheck.setOnAction(e->{
            if(!modLumCheck.isSelected()){
                lumCheck.setDisable(true);
                lumCheck.setSelected(false);
                
                lampCheck.setDisable(true);
                lampCheck.setSelected(false);
            }
            else{
                lumCheck.setDisable(false);
                
                lampCheck.setDisable(false);
            }
        });
        
        modTempCheck.setOnAction(e->{
            if(!modTempCheck.isSelected()){
                tempCheck.setDisable(true);
                tempCheck.setSelected(false);
                
                acCheck.setDisable(true);
                acCheck.setSelected(false);
            }
            else{
                tempCheck.setDisable(false);
                
                acCheck.setDisable(false);
            }
        });
        
        dp.add(atuaLabel, 20,0);
        
        dp.add(lampCheck, 20,1);
        lampCheck.setDisable(true);
        
        dp.add(tomCheck, 20, 2);
        
        dp.add(acCheck, 20, 3);
        acCheck.setDisable(true);
        
        dp.add(sirCheck, 20, 4);
        sirCheck.setDisable(true);
        
        dp.add(fotoCheck, 20, 5);
        fotoCheck.setDisable(true);
        
        dp.add(vidCheck, 20, 6);
        vidCheck.setDisable(true);
        
//        Image image = new Image("file:pr.jpg");
//        ImageView iv = new ImageView(image);
//        
////        HBox hb = new HBox();
////        hb.getChildren().add(iv);
////        dp.add(hb, 0, 7);
//        
//        Paint paint = new ImagePattern(image);
//
//        Circle circle = new Circle(70);
//        circle.setFill(paint);
//        circle.setStroke(Color.BLACK);
//        circle.setStrokeWidth(5);
//        circle.setTranslateY(-100);
//        circle.setTranslateX(0);
//        
//        dp.add(circle, 20, 7);
//        BatalhaNaval bn = new BatalhaNaval();
//        dp.add(bn, 20, 7);
    }
}

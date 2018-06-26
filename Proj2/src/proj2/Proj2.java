/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

/**
 *
 * @author Adriana
 */
public class Proj2 extends Application {

    private Stage s;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        //runLoad(primaryStage);
        runRF1(primaryStage);

        primaryStage.setTitle("Login");
        primaryStage.show();
    }
    
    public void runRF1(Stage primaryStage){
        RF1 rf1 = new RF1();
        Scene scene = new Scene(rf1, 1000, 500);
        primaryStage.setScene(scene);
    }

    public void runLoad(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 800, 600);

        LoadScreen lc = new LoadScreen(root);
        root.getChildren().add(lc.iconImage());
        root.getChildren().add(lc.userName());
        root.getChildren().add(lc.password());
        root.getChildren().add(lc.userLabel());
        root.getChildren().add(lc.passLabel());
        Button b = lc.loadButton();
        b.setOnAction(e ->{
            ((Stage)b.getScene().getWindow()).close();
        });

        root.getChildren().add(b);
        
        primaryStage.setScene(scene);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

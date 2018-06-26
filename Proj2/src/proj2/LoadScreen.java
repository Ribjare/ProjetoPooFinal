/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Adriana
 */
public class LoadScreen extends Application{
    private StackPane root;

    public LoadScreen(StackPane root) {
        this.root = root;
    }
    
    public Circle iconImage() {
        Image imagem = new Image("file:indice.png");
        ImageView imageV = new ImageView();
        imageV.setImage(imagem);

        Paint paint = new ImagePattern(imagem);

        Circle circle = new Circle(70);
        circle.setFill(paint);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        circle.setTranslateY(-100);
        circle.setTranslateX(0);

        return circle;
    }

    public TextField userName() {
        TextField tf = new TextField();

        HBox painelTexto = new HBox();
        painelTexto.setPadding(new Insets(10));
        painelTexto.setSpacing(10);

        tf = new TextField();
        tf.setMinSize(12, 10);
        tf.setMaxSize(200, 30);
        tf.setTranslateX(0);
        tf.setTranslateY(40);

        return tf;
    }

    public PasswordField password() {
        PasswordField tf2 = new PasswordField();

        HBox painelTexto = new HBox();
        painelTexto.setPadding(new Insets(10));
        painelTexto.setSpacing(10);

        tf2.setMinSize(12, 10);
        tf2.setMaxSize(200, 30);
        tf2.setTranslateX(0);
        tf2.setTranslateY(110);

        return tf2;
    }

    public Label userLabel() {
        Label l = new Label();
        l.setText("Username:");
        l.setFont(Font.font(20));
        l.setTranslateX(0);
        l.setTranslateY(10);

        return l;
    }

    public Label passLabel() {
        Label l = new Label();
        l.setText("Password:");
        l.setFont(Font.font(20));
        l.setTranslateX(0);
        l.setTranslateY(80);

        return l;
    }
    
    public Button loadButton(){
        Button b = new Button();
        b.setText("Login");
        b.setFont(Font.font(15));
        b.setTranslateX(0);
        b.setTranslateY(160);
                
        return b;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

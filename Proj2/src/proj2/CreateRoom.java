/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Adriana
 */
public class CreateRoom extends Application {

    private Scene scene;
    private Stage stage;

    public CreateRoom(StackPane root) {
        Stage janela = new Stage();
        janela.setTitle("RegisterRoom");
        janela.setScene(new Scene(root, 800, 600));
        janela.show();
    }

    public Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

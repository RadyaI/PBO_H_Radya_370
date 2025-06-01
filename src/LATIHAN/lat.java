package LATIHAN;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class lat extends Application{

    public void start(Stage stage){

        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Coba bisa ga ya");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
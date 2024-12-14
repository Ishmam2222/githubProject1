package oopproject.oopproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;

        // Load the main dashboard view
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DashBoardView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Dashboard - U-NID System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

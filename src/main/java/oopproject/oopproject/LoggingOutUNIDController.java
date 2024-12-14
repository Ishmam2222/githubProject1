package oopproject.oopproject;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class LoggingOutUNIDController {

    @FXML
    public void confirmLogOut() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Successfully logged out.");
    }

    @FXML
    public void cancelLogOut() {
        System.out.println("Log out canceled.");
    }
}

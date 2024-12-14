package oopproject.oopproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class UpdatingUNIDProfile {

    @FXML
    public TextField nameField;

    @FXML
    public TextField addressField;

    @FXML
    public TextField phoneField;

    @FXML
    public void confirmChanges(MouseEvent event) {
        String name = nameField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();

        System.out.println("Updated Profile Details: Name=" + name + ", Address=" + address + ", Phone=" + phone);
        System.out.println("Changes confirmed successfully.");
    }

    @FXML
    public void backToDashboard(MouseEvent event) throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

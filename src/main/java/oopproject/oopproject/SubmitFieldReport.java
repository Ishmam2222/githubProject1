package oopproject.oopproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class SubmitFieldReport {

    @FXML
    private TextArea summaryField;

    @FXML
    public void submitReport() {
        String summary = summaryField.getText();
        if (summary.isEmpty()) {
            System.out.println("Error: Summary cannot be empty.");
        } else {
            System.out.println("Report submitted with summary: " + summary);
        }
    }

    @FXML
    public void backToDashboard() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

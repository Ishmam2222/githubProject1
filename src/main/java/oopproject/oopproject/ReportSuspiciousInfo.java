package oopproject.oopproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ReportSuspiciousInfo {

    @FXML
    private TextArea suspiciousInfoDetails;

    @FXML
    public void submitSuspiciousReport() {
        String details = suspiciousInfoDetails.getText();
        System.out.println("Suspicious report submitted successfully: " + details);
    }

    @FXML
    public void backToDashboard() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

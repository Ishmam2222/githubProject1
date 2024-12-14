package oopproject.oopproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DocumentReview {

    @FXML
    private Label outputLabel;

    @FXML
    public void loadFile(ActionEvent actionEvent) {
        FileInputStream fis = null;
        String outputStr = "";

        try {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                String fileName = selectedFile.getName();
                outputStr = "File loaded: " + fileName + "\n";

                fis = new FileInputStream(selectedFile);
                Scanner sc = new Scanner(fis);
                while (sc.hasNextLine()) {
                    outputStr += sc.nextLine() + "\n";
                }
            } else {
                outputStr = "No file selected.";
            }
        } catch (Exception e) {
            outputStr = "Error occurred while loading the file.";
        }

        outputLabel.setText(outputStr);

        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    @FXML
    public void backToDashboard(ActionEvent actionEvent) throws IOException {
        Parent dashboardView = javafx.fxml.FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

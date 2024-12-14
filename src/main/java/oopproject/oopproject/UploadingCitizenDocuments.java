package oopproject.oopproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UploadingCitizenDocuments {

    @FXML
    private ImageView imageView;


    @FXML
    public void loadImage(ActionEvent actionEvent) {
        FileInputStream fis = null;
        String outputStr = "";

        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select an Image");
            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.bmp"));

            File selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null) {
                String fileName = selectedFile.getName();
                outputStr = "Loaded image: " + fileName;

                fis = new FileInputStream(selectedFile);
                Image image = new Image(fis);
                imageView.setImage(image);
            } else {
                outputStr = "No file selected.";
            }
        } catch (Exception e) {
            outputStr = "Error loading image.";
        }

        System.out.println(outputStr);

        if (fis != null) {
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    @FXML
    public void backToDashboard(ActionEvent actionEvent) throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}
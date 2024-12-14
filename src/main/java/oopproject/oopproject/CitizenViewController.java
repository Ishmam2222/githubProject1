package oopproject.oopproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CitizenViewController {

    @FXML
    private TextField nameField;
    @FXML
    private DatePicker dobField;
    @FXML
    private TextField addressField;

    @FXML
    private TableView<Citizen> citizenTable;
    @FXML
    private TableColumn<Citizen, String> nameColumn;
    @FXML
    private TableColumn<Citizen, LocalDate> dobColumn;
    @FXML
    private TableColumn<Citizen, String> addressColumn;

    // Observable list
    private ObservableList<Citizen> citizenList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        citizenTable.setItems(citizenList);
    }

    @FXML
    public void accumulateCitizenToArrayListButtonMouseOnClicked(MouseEvent event) {
        String name = nameField.getText();
        LocalDate dob = dobField.getValue();
        String address = addressField.getText();

        if (!name.isEmpty() & dob != null & !address.isEmpty()) {
            citizenList.add(new Citizen(name, dob, address));
            nameField.clear();
            dobField.setValue(null);
            addressField.clear();
            System.out.println("Citizen added to the list.");
        } else {
            System.out.println("Error: Please fill out all fields.");
        }
    }

    @FXML
    public void saveArrayListToFileButtonMouseOnClicked(MouseEvent event) {
        FileWriter fw = null;
        try {
            File file = new File("CitizenInfo.txt");
            if (file.exists()) {
                fw = new FileWriter(file, true);
            } else {
                fw = new FileWriter(file);
            }

            for (Citizen citizen : citizenTable.getItems()) {
                fw.write("Name: " + citizen.getName() +
                        ", DOB: " + citizen.getDob().toString() +
                        ", Address: " + citizen.getAddress() + "\n");
            }
            System.out.println("Citizen details saved to file.");
        } catch (Exception e) {
            System.out.println("An error occurred while saving to file.");
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (Exception e) {
                System.out.println("An error occurred while closing the file.");
            }
        }
    }

    @FXML
    public void backToDashboard() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }

    @FXML
    public void startRegistrationAction() {
        System.out.println("Started new registration process.");
    }

    @FXML
    public void captchaSolvedAction() {
        System.out.println("CAPTCHA solved.");
    }
}

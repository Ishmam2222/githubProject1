package oopproject.oopproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FieldVerificationViewController {

    @FXML
    public TextField applicationNumberField;
    @FXML
    public TextField nameField;
    @FXML
    public DatePicker dobPicker;

    @FXML
    public TableView<Applicant> verificationTable;
    @FXML
    public TableColumn<Applicant, String> idColumn;
    @FXML
    public TableColumn<Applicant, String> nameColumn;
    @FXML
    public TableColumn<Applicant, LocalDate> dobColumn;

    public ObservableList<Applicant> applicants = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("applicationNumber"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
        verificationTable.setItems(applicants);
    }

    @FXML
    public void addApplicantDetails() {
        String applicationNumber = applicationNumberField.getText();
        String name = nameField.getText();
        LocalDate dob = dobPicker.getValue();

        if (!applicationNumber.isEmpty() && !name.isEmpty() && dob != null) {
            applicants.add(new Applicant(applicationNumber, name, dob));
            applicationNumberField.clear();
            nameField.clear();
            dobPicker.setValue(null);
        } else {
            System.out.println("Error: Please fill out all fields.");
        }
    }

    @FXML
    public void addToFile() {
        try (FileWriter writer = new FileWriter("Applicants.txt", true)) {
            for (Applicant applicant : applicants) {
                writer.write("Application Number: " + applicant.getApplicationNumber() + ", ");
                writer.write("Name: " + applicant.getName() + ", ");
                writer.write("Date of Birth: " + applicant.getDob() + "\n");
            }
            System.out.println("Applicants saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to save to file.");
        }
    }

    @FXML
    public void submitVerificationReport() {
        System.out.println("Verification report submitted.");
    }

    @FXML
    public void rejectCitizen() {
        System.out.println("Verification rejected.");
    }

    @FXML
    public void backToDashboard() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
    }
}

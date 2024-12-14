package oopproject.oopproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerifyingAddress {

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

        // Bind observable list to TableView
        verificationTable.setItems(applicants);
    }

    @FXML
    public void AddressVerification() {
        try {
            File file = new File("Applicants.txt");
            Scanner scanner = new Scanner(file);

            // Clear existing data in the TableView
            applicants.clear();

            // Define a formatter for parsing dates
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(", "); // Split by comma and space

                // Extract data and create an applicant object
                String applicationNumber = tokens[0].split(": ")[1];
                String name = tokens[1].split(": ")[1];
                LocalDate dob = LocalDate.parse(tokens[2].split(": ")[1], formatter);

                applicants.add(new Applicant(applicationNumber, name, dob));
            }
            scanner.close();
            System.out.println("Address verification details loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error parsing data: " + e.getMessage());
        }
    }

    @FXML
    public void captureEvidence() {
        System.out.println("Capture evidence functionality invoked.");
    }

    @FXML
    public void backToDashboard(MouseEvent event) throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

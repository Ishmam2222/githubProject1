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
import java.util.Scanner;

public class ConfirmingDetailsSubmittingUNID {

    @FXML
    public TableView<Citizen> citizenTable;
    @FXML
    public TableColumn<Citizen, String> nameColumn;
    @FXML
    public TableColumn<Citizen, LocalDate> dobColumn;
    @FXML
    public TableColumn<Citizen, String> addressColumn;

    // ObservableList
    public ObservableList<Citizen> citizenList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobColumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        citizenTable.setItems(citizenList);
    }

    @FXML
    public void loadTableFromFile(MouseEvent event) {
        try {
            File file = new File("CitizenInfo.txt");
            Scanner scanner = new Scanner(file);

            citizenList.clear();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(", ");

                // Parse data and create a Citizen object
                String name = tokens[0].split(": ")[1];
                LocalDate dob = LocalDate.parse(tokens[1].split(": ")[1]);
                String address = tokens[2].split(": ")[1];

                Citizen citizen = new Citizen(name, dob, address);
                citizenList.add(citizen);
            }
            scanner.close();
            System.out.println("Citizen data loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    @FXML
    public void logOut() {
        System.out.println("Logged out successfully.");
    }

    @FXML
    public void backToDashboard() throws IOException {
        Parent dashboardView = FXMLLoader.load(getClass().getResource("DashBoardView.fxml"));
        HelloApplication.getPrimaryStage().setScene(new Scene(dashboardView));
        System.out.println("Navigated back to the dashboard.");
    }
}

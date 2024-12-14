package oopproject.oopproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class DashBoardViewController {

    @FXML
    public void openCitizenView() throws IOException {
        FXMLLoader citizenFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CitizenView.fxml"));
        Scene citizenScene = new Scene(citizenFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(citizenScene);
        myStage.setTitle("Citizen Workflow");
        myStage.show();
    }
    @FXML
    private Label statusLabel;


    @FXML
    public void uploadFileMenuItemOnAction(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Documents", "*.jpg", "*.pdf"));

        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
            statusLabel.setText("Document uploaded successfully");
        }
    }

    @FXML
    public void openFieldVerificationView() throws IOException {
        FXMLLoader fieldFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FieldVerificationView.fxml"));
        Scene fieldScene = new Scene(fieldFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(fieldScene);
        myStage.setTitle("Field Verification Workflow");
        myStage.show();
    }

    @FXML
    public void openUploadingCitizenDocuments() throws IOException {
        FXMLLoader uploadingFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UploadingCitizenDocuments.fxml"));
        Scene uploadingScene = new Scene(uploadingFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(uploadingScene);
        myStage.setTitle("Uploading Citizen Documents");
        myStage.show();
    }

    @FXML
    public void openVerifyingAddress() throws IOException {
        FXMLLoader verifyingAddressFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VerifyingAddress.fxml"));
        Scene verifyingAddressScene = new Scene(verifyingAddressFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(verifyingAddressScene);
        myStage.setTitle("Verifying Address");
        myStage.show();
    }

    @FXML
    public void openConfirmingDetailsSubmittingUNID() throws IOException {
        FXMLLoader confirmingDetailsFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ConfirmingDetailsSubmittingUNID.fxml"));
        Scene confirmingDetailsScene = new Scene(confirmingDetailsFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(confirmingDetailsScene);
        myStage.setTitle("Confirming Details Submitting U-NID");
        myStage.show();
    }

    @FXML
    public void openDocumentReview() throws IOException {
        FXMLLoader documentReviewFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DocumentReview.fxml"));
        Scene documentReviewScene = new Scene(documentReviewFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(documentReviewScene);
        myStage.setTitle("Document Review");
        myStage.show();
    }

    @FXML
    public void openUpdatingUNIDProfile() throws IOException {
        FXMLLoader updatingProfileFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpdatingUNIDProfile.fxml"));
        Scene updatingProfileScene = new Scene(updatingProfileFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(updatingProfileScene);
        myStage.setTitle("Updating U-NID Profile");
        myStage.show();
    }

    @FXML
    public void openSubmitFieldReport() throws IOException {
        FXMLLoader submitFieldReportFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SubmitFieldReport.fxml"));
        Scene submitFieldReportScene = new Scene(submitFieldReportFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(submitFieldReportScene);
        myStage.setTitle("Submit Field Report");
        myStage.show();
    }

    @FXML
    public void openUNIDApplicationStatus() throws IOException {
        FXMLLoader applicationStatusFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UNIDApplicationStatus.fxml"));
        Scene applicationStatusScene = new Scene(applicationStatusFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(applicationStatusScene);
        myStage.setTitle("U-NID Application Status");
        myStage.show();
    }

    @FXML
    public void openVerifyingAdditionalInfo() throws IOException {
        FXMLLoader additionalInfoFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VerifyingAdditionalInfo.fxml"));
        Scene additionalInfoScene = new Scene(additionalInfoFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(additionalInfoScene);
        myStage.setTitle("Verifying Additional Info");
        myStage.show();
    }

    @FXML
    public void openResubmissionAfterError() throws IOException {
        FXMLLoader resubmissionFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ResubmissionAfterError.fxml"));
        Scene resubmissionScene = new Scene(resubmissionFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(resubmissionScene);
        myStage.setTitle("Re-Submission After Error");
        myStage.show();
    }

    @FXML
    public void openReVerification() throws IOException {
        FXMLLoader reVerificationFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ReVerification.fxml"));
        Scene reVerificationScene = new Scene(reVerificationFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(reVerificationScene);
        myStage.setTitle("Re-Verification");
        myStage.show();
    }

    @FXML
    public void openEditingSubmittedUNID() throws IOException {
        FXMLLoader editingFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EditingSubmittedUNID.fxml"));
        Scene editingScene = new Scene(editingFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(editingScene);
        myStage.setTitle("Editing Submitted U-NID");
        myStage.show();
    }

    @FXML
    public void openReportSuspiciousInfo() throws IOException {
        FXMLLoader suspiciousInfoFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ReportSuspiciousInfo.fxml"));
        Scene suspiciousInfoScene = new Scene(suspiciousInfoFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(suspiciousInfoScene);
        myStage.setTitle("Report Suspicious Info");
        myStage.show();
    }

    @FXML
    public void openLoggingOutUNID() throws IOException {
        FXMLLoader loggingOutFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoggingOutUNID.fxml"));
        Scene loggingOutScene = new Scene(loggingOutFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(loggingOutScene);
        myStage.setTitle("Logging Out U-NID");
        myStage.show();
    }

    @FXML
    public void openUpdatingAndVerifying() throws IOException {
        FXMLLoader updatingVerifyingFxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpdatingAndVerifying.fxml"));
        Scene updatingVerifyingScene = new Scene(updatingVerifyingFxmlLoader.load());
        Stage myStage = HelloApplication.getPrimaryStage();
        myStage.setScene(updatingVerifyingScene);
        myStage.setTitle("Updating and Verifying");
        myStage.show();
    }
}

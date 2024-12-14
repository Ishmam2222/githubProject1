module oopproject.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oopproject.oopproject to javafx.fxml;
    exports oopproject.oopproject;
}
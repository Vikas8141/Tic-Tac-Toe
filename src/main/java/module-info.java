module com.example.tictac_toe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictac_toe to javafx.fxml;
    exports com.example.tictac_toe;
}
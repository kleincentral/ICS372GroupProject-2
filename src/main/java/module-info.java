module org.example.ics372groupproject2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ics372groupproject2 to javafx.fxml;
    exports org.example.ics372groupproject2;
}
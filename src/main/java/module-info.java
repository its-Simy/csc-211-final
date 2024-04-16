module org.example.csc211final {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.csc211final to javafx.fxml;
    exports org.example.csc211final;
}
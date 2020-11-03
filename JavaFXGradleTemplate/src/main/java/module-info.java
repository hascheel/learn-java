module javafxGradleTemplate {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.scheel to javafx.fxml;
    exports dev.scheel;
}
module tech.altier.genericposjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens tech.altier.genericposjava to javafx.fxml;
    exports tech.altier.genericposjava;
}
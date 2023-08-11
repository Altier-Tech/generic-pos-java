module tech.altier.posgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens tech.altier.posgui to javafx.fxml;
    exports tech.altier.posgui;
}
module org.crc.projectgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.crc.projectgui to javafx.fxml;
    exports org.crc.projectgui;
}
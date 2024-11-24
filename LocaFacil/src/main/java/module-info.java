module br.com.softwarewranglers.locafacil {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.softwarewranglers.locafacil.view to javafx.fxml;
    exports br.com.softwarewranglers.locafacil;
}
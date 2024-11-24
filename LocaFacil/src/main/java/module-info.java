module br.com.softwarewranglers.locafacil {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens br.com.softwarewranglers.locafacil.view to javafx.fxml;
    exports br.com.softwarewranglers.locafacil;
}
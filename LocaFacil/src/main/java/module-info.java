module br.com.softwarewranglers.locafacil {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    requires com.dlsc.formsfx;
    requires com.jfoenix;

    opens br.com.softwarewranglers.locafacil.view to javafx.fxml;
    exports br.com.softwarewranglers.locafacil;
}
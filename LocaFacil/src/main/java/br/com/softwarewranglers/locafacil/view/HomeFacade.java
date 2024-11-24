package br.com.softwarewranglers.locafacil.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeFacade {
    @FXML
    private Label home;

    @FXML
    protected void onHelloButtonClick() {
        home.setText("Welcome to JavaFX Application!");
    }
}

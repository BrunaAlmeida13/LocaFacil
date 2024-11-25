package br.com.softwarewranglers.locafacil.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HomeFacade {
    @FXML
    private void handleDocGeneratorAction(ActionEvent event) {
        try {
            // Carregar a nova página
            Parent docGeneratorFormPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/br/com/softwarewranglers/locafacil/view/doc-generator-form-view.fxml")));

            // Obter o palco atual
            Scene scene = ((Node) event.getSource()).getScene();

            // Substituir a cena
            scene.setRoot(docGeneratorFormPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleExitAction(ActionEvent event){
        Platform.exit();
    }
}

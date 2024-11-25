package br.com.softwarewranglers.locafacil.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

public class DocGeneratorFacade {
    @FXML
    private void handleReciboFormAction(ActionEvent event){
        try {
            Parent formRecibo = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/br/com/softwarewranglers/locafacil/view/form-recibo-generator-view.fxml")));

            // Obtém a cena atual a partir do botão ou outro componente que disparou o evento
            Node sourceNode = (Node) event.getSource();
            Scene scene = sourceNode.getScene();

            // Define o novo layout como raiz da cena
            scene.setRoot(formRecibo);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Erro ao carregar o arquivo FXML ou obter a cena.");
            e.printStackTrace();
        }
    }
}

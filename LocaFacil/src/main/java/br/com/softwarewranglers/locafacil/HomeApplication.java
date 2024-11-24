package br.com.softwarewranglers.locafacil;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("/br/com/softwarewranglers/locafacil/view/home-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        stage.setMaximized(true);
        stage.setTitle("Loca Fácil - Software Wranglers");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
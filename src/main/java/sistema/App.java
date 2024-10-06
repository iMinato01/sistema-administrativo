package sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static sistema.metodos.Metodos.ventanaPrincipal;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/gui/inicio.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle("Sistema Administrativo");
        ventanaPrincipal = stage;
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
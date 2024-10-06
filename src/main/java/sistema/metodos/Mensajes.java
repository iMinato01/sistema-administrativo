package sistema.metodos;

import javafx.scene.control.Alert;

public class Mensajes {
    public static void error(String titulo, String informacion){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(informacion);
    }
}

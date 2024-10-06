package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sistema.metodos.Configuraciones.agregarIconoBoton;

public class RegistroProveedorController {
    @FXML
    private Button btnRegistrar;
    @FXML
    public void initialize(){
        agregarIconoBoton(btnRegistrar, "mdi2c-content-save", 25);
    }
}

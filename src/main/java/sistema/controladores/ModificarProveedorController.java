package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static sistema.metodos.Configuraciones.agregarIconoBoton;

public class ModificarProveedorController {
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnBuscar;
    @FXML
    public void initialize(){
        agregarIconoBoton(btnModificar, "mdi2c-content-save-edit", 25);
        agregarIconoBoton(btnBuscar, "mdi2a-account-search", 25);
    }
}

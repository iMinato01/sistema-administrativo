package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sistema.metodos.Configuraciones.agregarIconoBoton;

public class DireccionamientosController {
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnSuspender;
    @FXML
    private Button btnReactivar;
    @FXML
    public void initialize(){
        agregarIconoBoton(btnAgregar, "mdi2c-clipboard-plus-outline", 25);
        agregarIconoBoton(btnEditar, "mdi2c-clipboard-edit-outline", 25);
        agregarIconoBoton(btnSuspender, "mdi2c-clipboard-off-outline", 25);
        agregarIconoBoton(btnReactivar, "mdi2c-clipboard-flow-outline", 25);
    }

}

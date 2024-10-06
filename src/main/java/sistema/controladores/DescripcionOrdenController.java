package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import static sistema.metodos.Configuraciones.agregarIconoBoton;
import static sistema.metodos.Configuraciones.setToolTip;

public class DescripcionOrdenController {
    @FXML
    private CheckBox cbPrevisualizar;
    @FXML
    private Button btnGuardar;
    @FXML
    public void initialize(){
        agregarIconoBoton(btnGuardar, "mdi2c-content-save", 25);
        agregarIconoBoton(cbPrevisualizar, "mdi2f-file-eye-outline", 25);
        setToolTip(cbPrevisualizar, "Previsualizar Orden");
    }
}

package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import static sistema.metodos.Configuraciones.agregarIconoBoton;
import static sistema.metodos.Configuraciones.setToolTip;

public class DatosBancariosController {
    @FXML
    private CheckBox cbCie;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnGuardar;
    @FXML
    public void initialize(){
        agregarIconoBoton(btnGuardar, "mdi2c-content-save", 25);
        agregarIconoBoton(btnBuscar, "mdi2a-account-search", 25);
        agregarIconoBoton(cbCie, "mdi2c-compare-vertical", 23);
        setToolTip(cbCie, "Convenio exclusivo de Concentración Inmediata Empresarial");
    }
}

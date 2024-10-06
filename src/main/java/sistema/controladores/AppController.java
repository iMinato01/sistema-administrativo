package sistema.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

import static sistema.metodos.Configuraciones.abrirNuevaVentana;
import static sistema.metodos.Configuraciones.agregarIconoBoton;

public class AppController {
    @FXML
    private Tab tbInicio;
    @FXML
    private Tab tbProveedores;
    @FXML
    private Tab tbMenu;
    @FXML
    private Tab tbOrdenes;
    @FXML
    private Tab tbEvaluaciones;
    @FXML
    private Button btnAgregarProveedor;
    @FXML
    private Button btnModificarProveedor;
    @FXML
    private Button btnDatosBancariosProveedor;
    @FXML
    private Tab tbUsuarios;
    @FXML
    private Button btnAgregarUsuario;
    @FXML
    private Button btnModificarUsuario;
    @FXML
    private Button btnInformacionUsuario;
    @FXML
    private Button btnVerOrden;
    @FXML
    private Button btnFiltrarOrdenes;
    @FXML
    private Button btnDireccionamientos;
    @FXML
    private Button btnBuscarOrden;
    @FXML
    private Button btnGuardarOrden;
    @FXML
    public void initialize(){
        //Menú de inicio
        agregarIconoBoton(tbInicio, "mdi2h-home", 30);
        agregarIconoBoton(tbProveedores, "mdi2a-account-group",30);
        agregarIconoBoton(tbUsuarios, "mdi2a-account-switch", 30);
        //Sub menú de el Menpu 'Inicio'
        agregarIconoBoton(tbMenu, "mdi2h-home-outline", 30);
        agregarIconoBoton(tbOrdenes, "mdi2f-file-document-multiple-outline", 30);
        agregarIconoBoton(tbEvaluaciones, "mdi2e-equalizer-outline", 30);
        //Módulo Proveedores
        agregarIconoBoton(btnAgregarProveedor, "mdi2a-account-plus-outline", 25);
        agregarIconoBoton(btnModificarProveedor, "mdi2a-account-edit-outline", 25);
        agregarIconoBoton(btnDatosBancariosProveedor, "mdi2a-account-cash-outline", 25);
        abrirNuevaVentana(btnAgregarProveedor, "/gui/registrar-proveedor.fxml", "Registrar Proveedor");
        abrirNuevaVentana(btnModificarProveedor, "/gui/modificar-proveedor.fxml", "Modificar Proveedor");
        abrirNuevaVentana(btnDatosBancariosProveedor, "/gui/datos-bancarios.fxml", "Datos Bancarios");
        //Módulo Usuarios
        agregarIconoBoton(btnAgregarUsuario, "mdi2a-account-plus-outline", 25);
        agregarIconoBoton(btnModificarUsuario, "mdi2a-account-edit-outline", 25);
        agregarIconoBoton(btnInformacionUsuario, "mdi2c-clipboard-text-outline", 25);
        abrirNuevaVentana(btnAgregarUsuario, "/gui/registrar-usuario.fxml", "Registrar Usuario");
        abrirNuevaVentana(btnModificarUsuario, "/gui/modificar-usuario.fxml", "Modificar Usuario");
        abrirNuevaVentana(btnDatosBancariosProveedor, "/gui/datos-bancarios.fxml", "Datos Bancarios");

        //Sub menú Lista de Ordenes
        agregarIconoBoton(btnVerOrden, "mdi2f-file-eye-outline", 25);
        agregarIconoBoton(btnFiltrarOrdenes, "mdi2f-filter-menu-outline", 25);
        agregarIconoBoton(btnDireccionamientos, "mdi2t-target-account", 25);
        agregarIconoBoton(btnBuscarOrden, "mdi2d-database-search-outline", 22);
        agregarIconoBoton(btnGuardarOrden, "mdi2c-content-save", 32);
        abrirNuevaVentana(btnGuardarOrden, "/gui/descripcion-orden.fxml","Detalles de Orden");

        //******************
        abrirNuevaVentana(btnDireccionamientos, "/gui/direccionamientos.fxml","Gestionar Direccionamientos");
    }
}
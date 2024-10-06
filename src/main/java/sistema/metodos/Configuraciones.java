package sistema.metodos;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

import static sistema.metodos.Metodos.ventanaSecundaria;

public class Configuraciones {
    //Método estático para la carga del archivo
    public static Parent cargarFXML(String url){
        try {
            return FXMLLoader.load(Configuraciones.class.getResource(url));
        } catch (IOException e){
            Mensajes.error("Interfaz no encontrada", "La ruta de la interfaz gráfica no fue encontrada, contacta al administrador del sistema.");
            e.printStackTrace();
            return null;
        }
    }
    //Configuracion estética de componentes visuales.
    public static void agregarIconoBoton(Object componente, String url, int tam){
        if(componente instanceof Button btn){
            FontIcon icon = new FontIcon(url);
            icon.setIconSize(tam);
            btn.setGraphic(icon);
        } else if(componente instanceof Tab tb){
            FontIcon icono = new FontIcon(url);
            icono.setIconSize(tam);
            tb.setGraphic(icono);
        } else if(componente instanceof CheckBox cb){
            FontIcon icono = new FontIcon(url);
            icono.setIconSize(tam);
            cb.setGraphic(icono);
        }
    }
    public static void setToolTip(Object componente, String texto){
        if(componente instanceof Button btn){
            btn.setTooltip(new Tooltip(texto));
        } else if(componente instanceof Label lbl){
            lbl.setTooltip(new Tooltip(texto));
        } else if(componente instanceof CheckBox cb){
            cb.setTooltip(new Tooltip(texto));
        }
    }
    //Configuración de ventanas
    public static void abrirNuevaVentana(Button btn, String url, String titulo){
        btn.setOnAction(e->{
            if(ventanaSecundaria != null){
                ventanaSecundaria.close();
            }
                Parent root = cargarFXML(url);
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setResizable(false);
                stage.setTitle(titulo);
                ventanaSecundaria = stage;
                stage.show();
        });
    }
}

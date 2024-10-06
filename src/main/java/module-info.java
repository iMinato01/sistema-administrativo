module eyc.sitema {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    exports sistema;
    opens sistema to javafx.fxml;
    exports sistema.controladores;
    opens sistema.controladores to javafx.fxml;
}
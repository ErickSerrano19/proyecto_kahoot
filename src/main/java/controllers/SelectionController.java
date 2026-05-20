package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class SelectionController {

    @FXML
    private void CrearSala(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Crear Sala");
        alert.setHeaderText(null);
        alert.setContentText("Acción Crear Sala seleccionada.");
        alert.showAndWait();
    }

    @FXML
    private void UnirseSala(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Unirse a Sala");
        alert.setHeaderText(null);
        alert.setContentText("Acción Unirse a Sala seleccionada.");
        alert.showAndWait();
    }
}

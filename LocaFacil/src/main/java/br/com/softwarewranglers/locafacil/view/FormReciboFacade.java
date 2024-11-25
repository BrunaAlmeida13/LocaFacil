package br.com.softwarewranglers.locafacil.view;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class FormReciboFacade {
    @FXML
    private JFXTextField nomeClienteField;

    @FXML
    private JFXTextField cpfField;

    @FXML
    private JFXTextField produtoField;

    @FXML
    private JFXTextField valorField;

    @FXML
    private DatePicker dataInicialPicker;

    @FXML
    private DatePicker dataFinalPicker;

    @FXML
    private JFXTextField nomeProprietarioField;

    @FXML
    private JFXTextField cpfProprietarioField;
}

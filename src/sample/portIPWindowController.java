package sample;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;

/**
 * Created by yardengum on 1/15/16.
 */

public class portIPWindowController {
    @FXML
    Button save;
    @FXML
    TextField port;
    @FXML
    TextField ip;
    @FXML
    Label lblPort;
    @FXML
    void initialize(){
        save.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int portTo = Integer.parseInt(port.getText());
                try {
                    conect.setSock(portTo,ip.getText());
                    Stage stage = (Stage) save.getScene().getWindow();
                    stage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                lblPort.requestFocus();
            }
        });
    }


}

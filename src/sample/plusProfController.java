package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by yardengum on 1/15/16.
 */
public class plusProfController {


    @FXML
    Button addBtn;


    @FXML
    TextField type;

    @FXML
    TextField idProfessional;

    @FXML
    TextField age;

    @FXML
    TextField descProf;

    @FXML
    TextField gender;

    @FXML
    TextField profName;



    @FXML
    void initialize() {
        addBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String fromUser = "2"+" "+type.getText() +" "+ idProfessional.getText() +" " + age.getText() +" "+ descProf.getText() +" "+ gender.getText() +" "+ profName.getText();
                //Connect connect = new Connect();
                try {
                    PrintWriter out = new PrintWriter((Connect.getSock()).getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(Connect.getSock().getInputStream()));
                    String fromServer;
                    out.println(fromUser);
                    fromServer = in.readLine();
                    Stage stage = (Stage) type.getScene().getWindow();
                    stage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}


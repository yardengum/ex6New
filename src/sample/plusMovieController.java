package sample;

/**
 * Created by yardengum on 1/15/16.
 */


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


public class plusMovieController {

    @FXML
    Button addBtn;


    @FXML
    TextField id;

    @FXML
    TextField name;

    @FXML
    TextField length;

    @FXML
    TextField year;

    @FXML
    TextField rating;

    @FXML
    TextField description;

    @FXML
    void initialize() {
        addBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String fromUser = "1"+" "+id.getText()+" " + name.getText() +" "+ length.getText() +" "+ year.getText() +" "+ rating.getText() +" "+ description.getText();
                //Connect connect = new Connect();
                try {
                    PrintWriter out = new PrintWriter((Connect.getSock()).getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(Connect.getSock().getInputStream()));
                    String fromServer;
                    out.println(fromUser);
                    fromServer = in.readLine();
                    Stage stage = (Stage) id.getScene().getWindow();
                    stage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}
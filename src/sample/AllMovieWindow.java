package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by demo on 1/17/16.
 */
public class AllMovieWindow {
    String show() throws IOException {

            PrintWriter out = new PrintWriter(Connect.getSock().getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(Connect.getSock().getInputStream()));
            String fromUser = "13";
            out.println(fromUser);
        String str = "";
        String fromServer;
        while ((fromServer = in.readLine()) != null) {
            str = str + fromServer + '\n';
        }
            return str;
        }


}

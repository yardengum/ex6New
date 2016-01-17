package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by yardengum on 1/17/16.
 */
public class MinusProfWindow {
        public void show(String id)  {
            try {
                String fromUser = "11 " + id;
                PrintWriter out = new PrintWriter((Connect.getSock()).getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader((Connect.getSock()).getInputStream()));
                out.println(fromUser);
                in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by yardengum on 1/17/16.
 */
public class MinusProfWindow {
        public void show() throws IOException {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("MinusProfWindow.fxml"));

            Scene scene = new Scene(root, 400, 400);
            //scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

    }
}

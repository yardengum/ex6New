package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class mainController {

    @FXML
    Button All;

    @FXML
    Button photo;

    @FXML
    MenuItem plusMovie;

    @FXML
    MenuItem plusProf;

    @FXML
    MenuItem minusMovie;

    @FXML
    MenuItem minusProf;

    @FXML
    TextField btnTextInput;


    @FXML
    void initialize() {
        photo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                PortIPWindow portIpWindow = new PortIPWindow();
                try {
                    portIpWindow.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });




        plusMovie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlusMovieWindow plusMovieWindow = new PlusMovieWindow();
                try {
                    plusMovieWindow.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



    /*    btnRemove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MinusMovieWindow minusMovieWindow = new MinusMovieWindow();
                try {
                    minusMovieWindow.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });*/




      /*  addBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String msg = id.getText() + name.getText() + length.getText() + year.getText() + rating.getText() + description.getText();
                //PortIPWindow portIpWindow = new PortIPWindow();
              //  try {
             //       portIpWindow.show();
              //  } catch (IOException e) {
              //      e.printStackTrace();
              //  }
            }
        });*/


     /*   addProfBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                addMovieProfessional addProf = new addMovieProfessional();
                String msg = type.getText() + idProfessional.getText() + age.getText() + descProf.getText() + gender.getText() + profName.getText();
                addProf.recMsg(msg);
            }
        });*/



        minusMovie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MinusMovieWindow deleteMovie = new MinusMovieWindow();
                String str="";
                deleteMovie.show(str);

            }
        });


        minusProf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MinusProfWindow deleteProf = new MinusProfWindow();
                String str = "";
                deleteProf.show(str);
            }

        });


        plusProf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlusProfWindow plusProfWindow = new PlusProfWindow();
                try {
                    plusProfWindow.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }


}

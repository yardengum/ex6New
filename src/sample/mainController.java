        package sample;

        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
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
    MenuItem AllMovie;
    @FXML
    MenuItem AllProf;

    @FXML
    Button searchPhoto;
    @FXML
    MenuButton btnMultiChoices;
    @FXML
    MenuItem profByMovie;
    @FXML
    MenuItem movieById;
    @FXML
    MenuItem MovieByProfId;
    @FXML
    TextArea output;
    @FXML
    ScrollPane scrollShow;
    @FXML
    void initialize() {
        output.setEditable(false);
        scrollShow.setContent(output);
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
                deleteMovie.show(btnTextInput.getText());


            }
        });


        minusProf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MinusProfWindow deleteProf = new MinusProfWindow();
                deleteProf.show(btnTextInput.getText());

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
        AllMovie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AllMovieWindow allmovieWin = new AllMovieWindow();
                try {
                    String outputTo = allmovieWin.show();
                    output.setText(outputTo);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        AllProf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AllProfWindow allProfWin = new AllProfWindow();
                try {
                    String outputTo = allProfWin.show();
                    output.setText(outputTo);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        profByMovie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnMultiChoices.setText(profByMovie.getText());
            }
        });
        movieById.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnMultiChoices.setText(movieById.getText());
            }
        });
        MovieByProfId.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnMultiChoices.setText(MovieByProfId.getText());
            }
        });
        searchPhoto.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                String ProfOfMovie = profByMovie.getText();
                String MovieItem = movieById.getText();
                String movieByAProf = MovieByProfId.getText();
                String choice  = btnMultiChoices.getText();
                String str="";
                if(choice == ProfOfMovie)  {
                    ProfOfMovie profMov = new ProfOfMovie();
                    str = profMov.show(choice);
                }
                else if(choice==MovieItem) {
                    MovieByIdWindow aMovie = new MovieByIdWindow();
                    str =aMovie.show(choice);
                }
                else if(choice==movieByAProf) {
                    MoviesByProf profIdMov = new MoviesByProf();
                    str = profIdMov.show(choice);
                }
                btnMultiChoices.setText("Menu Button");
                output.setText(str);
            }

        });

    }


}

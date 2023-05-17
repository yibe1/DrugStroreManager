package com.mycompany.store;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class PrimaryController implements Initializable {

    @FXML
    VBox menu, mainvbox;
    @FXML HBox main;
    @FXML
    Button button_view;
    @FXML Label content_title;

    public PrimaryController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        HBox.setHgrow(mainvbox, Priority.ALWAYS);
        EventHandler<ActionEvent> eventLoadStock = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
                    loader.setController(new StockViewController());
                    HBox newHBox = loader.load();
                    content_title.setText("Current Stock");
                    main.getChildren().setAll(newHBox);
                    HBox.setHgrow(newHBox, Priority.ALWAYS);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        EventHandler<ActionEvent> eventAddDrug = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
                    VBox newVBox = loader.load();
                    main.getChildren().setAll(newVBox);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };

        // when button is pressed
        button_view.setOnAction(eventLoadStock);
    }

}

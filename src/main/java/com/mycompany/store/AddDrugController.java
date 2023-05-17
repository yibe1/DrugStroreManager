/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.store;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Jimma University
 */
public class AddDrugController implements Initializable {

    
    @FXML ComboBox drugs;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ObservableList list = FXCollections.observableArrayList();
        {
            ArrayList all_list = new Bridge().getDrugNames();
            for (int i = 0; i < all_list.size(); i++) {
                list.add(all_list.get(i));
            }
        }
        drugs.setItems(list);
        new AutoCompleteComboBoxListener<>(drugs);
    }    
    
}

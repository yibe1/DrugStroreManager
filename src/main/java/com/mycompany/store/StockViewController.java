package com.mycompany.store;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class StockViewController implements Initializable {

    @FXML
    TableView table;
//    @FXML VBox tableHolder;

    public ObservableList<Available_drugs> drugs = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ArrayList<String> available_drugs = new Bridge().get_stock();
        for (int i = 0; i < available_drugs.size(); i++) {
            int x = i + 1;
            Object[] row = available_drugs.get(i).split("@");
            row[0] = String.valueOf(x);
            drugs.add(new Available_drugs(Integer.parseInt((String) row[0]), (String) row[1], (String) row[2], Double.parseDouble((String) row[3]), (String) row[4], (String) row[5], Integer.parseInt((String) row[6])));
        }
        HBox.setHgrow(table, Priority.ALWAYS);
        TableColumn sn = new TableColumn("S.No");
        TableColumn itemname = new TableColumn("Item Name");
        TableColumn unit = new TableColumn("Unit");
        TableColumn unitprice = new TableColumn("Unit Price");
        TableColumn expirydate = new TableColumn("Expiry Date");
        TableColumn batchnumber = new TableColumn("Batch Number");
        TableColumn qty = new TableColumn("Quantity");

        sn.setCellValueFactory(new PropertyValueFactory<Available_drugs, Integer>("serial_number"));
        itemname.setCellValueFactory(new PropertyValueFactory<Available_drugs, String>("drug_name"));
        unit.setCellValueFactory(new PropertyValueFactory<Available_drugs, String>("unit"));
        unitprice.setCellValueFactory(new PropertyValueFactory<Available_drugs, Double>("unit_price"));
        expirydate.setCellValueFactory(new PropertyValueFactory<Available_drugs, String>("expiry_date"));
        batchnumber.setCellValueFactory(new PropertyValueFactory<Available_drugs, String>("batch_number"));
        qty.setCellValueFactory(new PropertyValueFactory<Available_drugs, Integer>("qty"));

        table.getColumns().clear();
        table.getColumns().addAll(sn, itemname, unit, unitprice, expirydate, batchnumber, qty);
        table.setItems(drugs);

    }
}

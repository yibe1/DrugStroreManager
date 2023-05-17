module com.mycompany.store {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;
    requires java.base;

    opens com.mycompany.store to javafx.fxml;
    exports com.mycompany.store;
}

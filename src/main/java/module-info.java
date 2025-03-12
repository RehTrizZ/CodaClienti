module net.clpo.codaclienti {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.clpo.codaclienti to javafx.fxml;
    exports net.clpo.codaclienti;
}
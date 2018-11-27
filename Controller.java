package edu.insightr.gildedrose;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private static Inventory inventory=new Inventory();

    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, String> name;
    @FXML private TableColumn<Item, String> sellIn;
    @FXML private TableColumn<Item, String> quality;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        sellIn.setCellValueFactory(new PropertyValueFactory<Item, String>("sellIn"));
        quality.setCellValueFactory(new PropertyValueFactory<Item, String>("quality"));

        tableView.getItems().setAll(inventory.getItems());
    }

    @FXML
    protected void update(ActionEvent event) {

        inventory.updateQuality();
        tableView.refresh();
    }

    @FXML
    protected void add(ActionEvent event) {

        //TODO Modifier la fonction add

        tableView.refresh();//Laisser cette foonction ici
    }



}

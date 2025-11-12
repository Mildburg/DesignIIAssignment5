package alexgessner.designiiassignment5;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CRUDController implements Initializable{
    @FXML
    private ComboBox<String> CharSelect;
    private TextField NameField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        CharSelect.getItems().addAll("Vampire", "Werewolf", "Zombie");

    }


}
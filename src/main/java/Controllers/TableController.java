package Controllers;

import alexgessner.designiiassignment5.AppState;
import alexgessner.designiiassignment5.HorrorCharacter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class TableController {
    @FXML private ListView<HorrorCharacter> CharList;
    @FXML private Button sceneSwitcher;
    @FXML private Button SaveCSV;

    @FXML
    public void initialize(){
        CharList.getItems().addAll(AppState.characterList);
    }

    @FXML
    public void charCreationSwitcher(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
        AppState.switchToCreateChar(stage);
    }

    @FXML
    public void saveSightings(ActionEvent e) throws IOException{
        AppState.saveToCSV(AppState.characterList, "MonsterSightings.csv");
    }
}

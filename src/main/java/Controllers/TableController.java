package Controllers;

import alexgessner.designiiassignment5.AppState;
import alexgessner.designiiassignment5.HorrorCharacter;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TableController {
    @FXML private ListView<HorrorCharacter> CharList;

    @FXML
    public void initialize(){
        CharList.getItems().addAll(AppState.characterList);
    }
}

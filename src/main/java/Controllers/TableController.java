package Controllers;

import alexgessner.designiiassignment5.AppState;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

public class TableController {
    @FXML private ListView CharList;

    public void populateListView(){
        CharList.getItems().addAll(AppState.characterList);
    }



}

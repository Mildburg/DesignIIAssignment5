package Controllers;

import alexgessner.designiiassignment5.AppState;
import alexgessner.designiiassignment5.HorrorCharacter;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;


public class TableController implements Initializable {
    //Table View
    @FXML private TableView<HorrorCharacter> CharList;
    @FXML private TableColumn<HorrorCharacter, String> NameClm;
    @FXML private TableColumn<HorrorCharacter, String> TypeClm;
    @FXML private TableColumn<HorrorCharacter, String> DateClm;
    //Button to switch scenes/delete characters
    @FXML private Button sceneSwitcher;
    @FXML private Button deleteButton;

    @FXML
    public void charCreationSwitcher(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
        AppState.switchToCreateChar(stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        //setting up the columns and using reflection to get information
        NameClm.setCellValueFactory(new PropertyValueFactory<HorrorCharacter, String>("name"));
        TypeClm.setCellValueFactory(new PropertyValueFactory<HorrorCharacter, String>("type"));
        DateClm.setCellValueFactory(new PropertyValueFactory<HorrorCharacter, String>("dateLastSighted"));

        //sets the table view to be editable
        CharList.setEditable(true);
        NameClm.setCellFactory(TextFieldTableCell.forTableColumn());
        TypeClm.setCellFactory(TextFieldTableCell.forTableColumn());
        DateClm.setCellFactory(TextFieldTableCell.forTableColumn());

        //sets the selection mode to allow multiple selections
        CharList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //gets data from fake backend
        CharList.setItems(AppState.characterList);


    }

    @FXML
    public void deleteChar(ActionEvent e){
        ObservableList<HorrorCharacter> allChars = CharList.getItems();
        ObservableList<HorrorCharacter> selectedChars = CharList.getSelectionModel().getSelectedItems();

        for (HorrorCharacter h : selectedChars){
            allChars.remove(h);
        }
    }

    @FXML
    public void nameChanged(TableColumn.CellEditEvent editedName){
        HorrorCharacter selectedChar = CharList.getSelectionModel().getSelectedItem();
        selectedChar.setName(editedName.getNewValue().toString());

        CharList.refresh();
    }

    @FXML
    public void typeChanged(TableColumn.CellEditEvent editedName){
        HorrorCharacter selectedChar = CharList.getSelectionModel().getSelectedItem();
        selectedChar.setType(editedName.getNewValue().toString());

        CharList.refresh();
    }

    @FXML
    public void dateChanged(TableColumn.CellEditEvent editedName){
        HorrorCharacter selectedChar = CharList.getSelectionModel().getSelectedItem();
        selectedChar.setDateLastSighted(editedName.getNewValue().toString());

        CharList.refresh();
    }
}

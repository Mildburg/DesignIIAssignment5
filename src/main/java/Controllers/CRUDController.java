package Controllers;

import alexgessner.designiiassignment5.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Stack;

/**
 * Controller for the Create a Character Scene
 */
public class CRUDController{
    @FXML private TextField NameField;
    @FXML private TextField HealthField;
    @FXML private RadioButton VampireButton;
    @FXML private RadioButton WerewolfButton;
    @FXML private RadioButton ZombieButton;
    @FXML private Button SubmitButton;
    @FXML private DatePicker datePicked;
    @FXML private Button ViewSwitcher;

    /**
     * Submits the character and populates it in the "backend"
     * @param e - clicking the button.
     */
    @FXML
    private void submitChar(ActionEvent e){
        String charName = NameField.getText();
        int charHealth = (int) Integer.parseInt(HealthField.getText());
        if(VampireButton.isSelected()) {
            VampireDTO vampire = new VampireDTO(new Vampire(charName, charHealth, datePicked.getValue().format(
                    DateTimeFormatter.ofPattern("MM/dd/yyyy")
            )));
            AppState.characterList.add(vampire);
        }
        else if(WerewolfButton.isSelected()){
            WerewolfDTO werewolf = new WerewolfDTO(new Werewolf(charName, charHealth, datePicked.getValue().format(
                    DateTimeFormatter.ofPattern("MM/dd/yyyy")
            )));
            AppState.characterList.add(werewolf);
        }
        else {
            ZombieDTO zombie = new ZombieDTO(new Zombie(charName, charHealth, datePicked.getValue().format(
                    DateTimeFormatter.ofPattern("MM/dd/yyyy")
            )));
            AppState.characterList.add(zombie);
        }
    }

    /**
     * Method that switches to the tableView scene. Connected to the button in this scene.
     * @param e - clicking the button.
     * @throws IOException - throws the exception.
     */
    @FXML
    private void switchToSecondary(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
        AppState.switchToTableViewScene(stage);
    }
}
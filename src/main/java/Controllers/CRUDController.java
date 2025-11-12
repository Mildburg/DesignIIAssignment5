package Controllers;

import alexgessner.designiiassignment5.AppState;
import alexgessner.designiiassignment5.Vampire;
import alexgessner.designiiassignment5.Werewolf;
import alexgessner.designiiassignment5.Zombie;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;

import javafx.event.ActionEvent;


public class CRUDController{
    @FXML private TextField NameField;
    @FXML private TextField HealthField;
    @FXML private RadioButton VampireButton;
    @FXML private RadioButton WerewolfButton;
    @FXML private RadioButton ZombieButton;
    @FXML private Button SubmitButton;

    @FXML
    private void submitChar(ActionEvent e){
        String charName = NameField.getText();
        int charHealth = (int) Integer.parseInt(HealthField.getText());
        if(VampireButton.isSelected()) {
            Vampire vampire = new Vampire(charName, charHealth);
            AppState.characterList.add(vampire);
        }
        else if(WerewolfButton.isSelected()){
            Werewolf werewolf = new Werewolf(charName, charHealth);
            AppState.characterList.add(werewolf);
        }
        else {
            Zombie zombie = new Zombie(charName, charHealth);
            AppState.characterList.add(zombie);
        }
    }

    private void switchToSecondary(){

    }
}
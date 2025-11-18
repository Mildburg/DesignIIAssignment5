package alexgessner.designiiassignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * AppState class for data transfer and for switching scenes.
 */

public class AppState {

    /**
     * Observable list for the TableView. Fake backend
     */
    public static ObservableList<HorrorCharacter> characterList = FXCollections.observableArrayList(
            new VampireDTO(new Vampire("Dio", 300, "1/18/1989")),
            new ZombieDTO(new Zombie("Jason", 250, "2/13/2009")),
            new WerewolfDTO(new Werewolf("Lupin", 175, "5/2/1998")));

    /**
     * Switcher to the TableView Scene
     * @param stage - same stage as the main to switch the scenes on.
     * @throws IOException - throws exceptions
     */
    public static void switchToTableViewScene(Stage stage) throws IOException {
        Scene scene = new Scene(App.loadFXML("TableView"), 640, 480);
        stage.setTitle("Monster Sighting Catalog");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Switcher to the Create a Character Scene
     * @param stage - same stage as the main to switch the scenes on.
     * @throws IOException - throws exceptions
     */
    public static void switchToCreateChar(Stage stage) throws IOException{
        Scene scene = new Scene(App.loadFXML("CRUDView"), 640, 480);
        stage.setTitle("Create new Character");
        stage.setScene(scene);
        stage.show();
    }




}

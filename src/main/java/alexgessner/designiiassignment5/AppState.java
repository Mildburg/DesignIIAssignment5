package alexgessner.designiiassignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AppState {
    public static ArrayList<HorrorCharacter> characterList = new ArrayList<>(List.of(
            new Vampire("Dio", 300, "1/18/1989"),
            new Zombie("Jason", 250, "2/13/2009"),
            new Werewolf("Lupin", 175, "5/2/1998")));

    public static void switchSecondScene(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("TableView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Monster Sighting Catalog");
        stage.setScene(scene);
        stage.show();
    }



}

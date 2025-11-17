package alexgessner.designiiassignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AppState {
    public static ArrayList<HorrorCharacter> characterList = new ArrayList<>(List.of(
            new VampireDTO(new Vampire("Dio", 300, "1/18/1989")),
            new ZombieDTO(new Zombie("Jason", 250, "2/13/2009")),
            new WerewolfDTO(new Werewolf("Lupin", 175, "5/2/1998"))));

    public static void switchToListViewScene(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("TableView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Monster Sighting Catalog");
        stage.setScene(scene);
        stage.show();
    }

    public static void switchToCreateChar(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("CRUDView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Create new Character");
        stage.setScene(scene);
        stage.show();
    }

    public static void saveToCSV(ArrayList<HorrorCharacter> savedList, String filename){
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)))){
            for(HorrorCharacter h : savedList){
                out.write(h.CSVFormat());
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

    }



}

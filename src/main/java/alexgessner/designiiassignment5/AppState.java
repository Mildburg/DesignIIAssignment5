package alexgessner.designiiassignment5;

import java.util.ArrayList;
import java.util.List;

public class AppState {
    public static ArrayList<HorrorCharacter> characterList = new ArrayList<>();

    public AppState(){
        boolean add = characterList.addAll(List.of(
                new Vampire("Dio", 300),
                new Zombie("Jason", 250),
                new Werewolf("Lupin", 175))
                );
    }



}

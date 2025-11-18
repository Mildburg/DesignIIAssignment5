package alexgessner.designiiassignment5;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class WerewolfDTO extends HorrorCharacter{

    private SimpleStringProperty name;
    private SimpleStringProperty dateLastSighted;
    private SimpleIntegerProperty health;
    private SimpleStringProperty type;

    public WerewolfDTO(Werewolf w){
        this.name = new SimpleStringProperty(w.getName());
        this.dateLastSighted = new SimpleStringProperty(w.getDateLastSighted());
        this.health = new SimpleIntegerProperty(w.getHealth());
        this.type = new SimpleStringProperty("Werewolf");
    }


    @Override
    public String getName() {
        return name.get();
    }

    @Override
    public void setName(String name) {
        if(!name.isEmpty())
            this.name.set(name);
    }

    @Override
    public String getDateLastSighted() {
        return dateLastSighted.get();
    }

    public void setDateLastSighted(String date) {
        if(!date.isEmpty())
            this.dateLastSighted.set(date);
    }

    @Override
    public int getHealth() {
        return health.get();
    }

    @Override
    public void setHealth(int health) {
        if(health > 0)
            this.health.set(health);
    }

    @Override
    public String getType(){
        return this.type.get();
    }

    @Override
    public void setType(String type){
        if(!type.isEmpty())
           this.type.set(type);
    }

    @Override
    public String toString() {
        String info ="";
        info += "Name: " + getName() + " Type: Werewolf Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities() +
                " Last Sighted Date: " + getDateLastSighted();
        return info;
    }

    public SimpleStringProperty nameProperty(){
        return name;
    }

    public SimpleStringProperty typeProperty(){
        return type;
    }

    public SimpleStringProperty dateProperty(){
        return dateLastSighted;
    }
}

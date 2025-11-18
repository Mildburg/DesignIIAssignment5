package alexgessner.designiiassignment5;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ZombieDTO extends HorrorCharacter {

    private SimpleStringProperty name;
    private SimpleStringProperty dateLastSighted;
    private SimpleIntegerProperty health;


    public ZombieDTO(Zombie z){
        this.name = new SimpleStringProperty(z.getName());
        this.dateLastSighted = new SimpleStringProperty(z.getDateLastSighted());
        this.health = new SimpleIntegerProperty(z.getHealth());
    }

    @Override
    public String getName() {
        return this.name.get();
    }

    @Override
    public void setName(String name) {
        if(!name.isEmpty())
            this.name.set(name);
    }

    @Override
    public String getDateLastSighted() {
        return this.dateLastSighted.get();
    }

    @Override
    public void setDateLastSighted(String date) {
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
        return "Zombie";
    }

    @Override
    public String toString() {
        String info ="";
        info += "Name: " + getName() + " Type: Zombie Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities() +
                " Last Sighted Date: " + getDateLastSighted();
        return info;
    }
}

package alexgessner.designiiassignment5;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class VampireDTO extends HorrorCharacter {

    private SimpleStringProperty name;
    private SimpleIntegerProperty health;
    private SimpleStringProperty dateLastSighted;
    private boolean transformed;

    public VampireDTO(Vampire vampire){
        this.name = new SimpleStringProperty(vampire.getName());
        this.health = new SimpleIntegerProperty(vampire.getHealth());
        this.dateLastSighted = new SimpleStringProperty(vampire.getDateLastSighted());
        this.transformed = false;
    }

    @Override
    public String getName(){
        return this.name.get();
    }

    @Override
    public void setName(String name){
        if(!name.isEmpty())
            this.name.set(name);
    }

    @Override
    public int getHealth(){
        return this.health.get();
    }

    @Override
    public void setHealth(int health){
        if(health > 0)
            this.health.set(health);
    }

    @Override
    public String getDateLastSighted(){
        return this.dateLastSighted.get();
    }

    @Override
    public void setDateLastSighted(String date){
        if(!date.isEmpty())
            this.dateLastSighted.set(date);
    }


    public boolean isTransformed() {
        return transformed;
    }

    public void setTransformed(boolean transformed) {
        this.transformed = transformed;
    }

    @Override
    public String getType(){
        return "Vampire";
    }
    @Override
    public String toString() {
        String info ="";
        info += "Name: " + getName() + " Type: Vampire Health: " + getHealth() + " Vulnerabilities: " + getVulnerabilities() +
                " Last Sighted Date: " + getDateLastSighted();
        return info;
    }
}

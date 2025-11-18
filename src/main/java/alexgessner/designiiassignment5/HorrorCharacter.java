package alexgessner.designiiassignment5;

import java.util.ArrayList;

/**
 * Abstract HorrorCharacter Class.
 */
public abstract class HorrorCharacter {
    /**
     * Vulnerability array to store the character's vulnerabilities from the Enumeration.
     * Standard String and int for name and health variables.
     */
    public ArrayList<Vulnerability> vulnerabilities = new ArrayList<>();
    private String name;
    private int health;
    private String dateLastSighted;

    /**
     * Abstract attack method. Each character will have their own attack methods.
     * @param victim - receives another HorrorCharacter Object as a victim to use in the text displayed.
     */
    void attack(HorrorCharacter victim){}

    /**
     * Abstract flee method. Each character will flee in different ways.
     */
    void flee(){}

    /**
     * Getter for the vulnerabilities array.
     * @return - returns the Vulnerabilities array.
     */
    public ArrayList<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Getter for the name of the character.
     * @return - returns the name String.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name. Ensures new name is not an empty string.
     * @param name - receives new name to set.
     */
    public void setName(String name) {
        if(!(name.isEmpty()))
            this.name = name;
    }

    /**
     * Getter for the health.
     * @return - returns the health integer.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter for the health. Ensures new health is not 0 or a negative.
     * @param health - receives new health integer.
     */
    public void setHealth(int health) {
        if(health > 0)
            this.health = health;
    }

    public String getDateLastSighted() {
        return dateLastSighted;
    }

    public void setDateLastSighted(String dateLastSighted) {
        if(!dateLastSighted.isEmpty())
            this.dateLastSighted = dateLastSighted;
    }

    public String CSVFormat(){
        return vulnerabilities + "," + name + "," + health + "," + dateLastSighted;
    }

    public String getType(){
        return "";
    }

    public void setType(String type){}
}//end class

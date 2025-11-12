package alexgessner.designiiassignment5;

/**
 * Werewolf class. Extends HorrorCharacter, implements transformable.
 */

public class Werewolf extends HorrorCharacter implements Transformable {
    private boolean transformed;

    /**
     * Constructor for the werewolf class.
     * Adds vulnerabilities to the vulnerabilities array, sets name and health.
     * New Werewolves are never transformed already.
     */
    public Werewolf(){
        vulnerabilities.add(Vulnerability.SILVER);
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        setName("Remus Lupin");
        setHealth(100);
        transformed = false;
    }

    public Werewolf(String name, int health){
        vulnerabilities.add(Vulnerability.SILVER);
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        transformed = false;
        setName(name);
        setHealth(health);
    }

    /**
     * Getter for the transformation boolean.
     * @return - returns the value of the transform variable.
     */
    public boolean getTransformed() {
        return transformed;
    }

    /**
     * Setter for transformation boolean.
     * @param transformed - receives a boolean and sets the transformed variable to that boolean value.
     */
    public void setTransformed(boolean transformed) {
        this.transformed = transformed;
    }

    /**
     * Overridden attack() method from HorrorCharacter.
     * Different messages for if the Werewolf is transformed or not.
     * @param victim - receives another HorrorCharacter object and displays the victim's name
     *               in the text.
     */
    @Override
    public void attack(HorrorCharacter victim){
        if(transformed){
            System.out.println(getName() + " lunges and bites at " + victim.getName() + "!");
        }
        else{
            System.out.println(getName() + " pulls out his wand and casts a spell throwing " + victim.getName());
        }
    }

    /**
     * Overridden transform() method from Transformable interface.
     * Displays a message, then changes the boolean value of transformed.
     */
    @Override
    public void transform(){
        System.out.println(getName() + " turns into a large werewolf!");
        transformed = true;
    }

    /**
     * Overridden flee() method from HorrorCharacter.
     * Displays different messages depending on if the Werewolf is transformed.
     */
    @Override
    public void flee(){
        if(transformed)
            System.out.println(getName() + " howls and sprints back into the dense forest!");
        else
            System.out.println(getName() + " panics and runs back into the darkness.");
    }
}//end class

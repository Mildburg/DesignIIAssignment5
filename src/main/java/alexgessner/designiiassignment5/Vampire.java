package alexgessner.designiiassignment5;

/**
 * Vampire class. Extends HorrorCharacter, implements transformable.
 */
public class Vampire extends HorrorCharacter implements Transformable{
    private boolean transformed;

    /**
     * Constructor for the Vampire class.
     * Adds vulnerabilities to the vulnerabilities array, sets name and health.
     * New Vampires are never transformed already.
     */
    public Vampire(){
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        vulnerabilities.add(Vulnerability.HOLY_WATER);
        setName("Dio");
        setHealth(200);
        transformed = false;
    }
    public Vampire(String name, int health, String date){
        vulnerabilities.add(Vulnerability.SUNLIGHT);
        vulnerabilities.add(Vulnerability.HOLY_WATER);
        transformed = false;
        setName(name);
        setHealth(health);
        setDate(date);
    }

    /**
     * Overridden attack() method from HorrorCharacter.
     * Different messages for if the Vampire is transformed or not.
     * @param victim - receives another HorrorCharacter object and displays the victim's name
     *               in the text.
     */
    @Override
    public void attack(HorrorCharacter victim){
        if (transformed){
            System.out.println(getName() + " throws knives at " + victim.getName() + "!");
        }
        else {
            System.out.println(getName() + " bites " + victim.getName() + "!");
        }
    }

    /**
     * Overridden transform() method from Transformable interface.
     * Displays a message, then changes the boolean value of transformed.
     */
    @Override
    public void transform(){
        System.out.println(getName() + " calls out his stand!");
        transformed = true;
    }

    /**
     * Overridden flee() method from HorrorCharacter.
     * Displays different messages depending on if the Vampire is transformed.
     */
    @Override
    public void flee(){
        if(transformed){
            System.out.println(getName() + " uses time stop to teleport away!");
        }
        else{
            System.out.println(getName() + " uses his speed to run away!");
        }

    }

    /**
     * Getter for Transform variable.
     * @return - returns the value of the transform boolean.
     */
    public boolean getTransformed() {
        return transformed;
    }

    /**
     * Setter for Transform variable.
     * @param transformed - receives a boolean value, then assigns the value to the transformed variable.
     */
    public void setTransformed(boolean transformed) {
        this.transformed = transformed;
    }
}//end class

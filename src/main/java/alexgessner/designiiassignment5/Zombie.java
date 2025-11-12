package alexgessner.designiiassignment5;

/**
 * Zombie class. Extends HorrorCharacter, implements transformable.
 */

public class Zombie extends HorrorCharacter{

    /**
     * Constructor for the Zombie class.
     * Adds vulnerabilities to the vulnerabilities array, sets name and health.
     */
    public Zombie(){
        vulnerabilities.add(Vulnerability.FIRE);
        vulnerabilities.add(Vulnerability.HOLY_WATER);
        setName("Jason Voorhees");
        setHealth(150);
    }

    /**
     * Overridden attack() method from HorrorCharacter.
     * @param victim - receives another HorrorCharacter object and displays the victim's name
     *               in the text.
     */
    @Override
    public void attack(HorrorCharacter victim){
        System.out.println(getName() + " swipes at " + victim.getName() + " with incredible speed and force!");
    }

    /**
     * Overridden flee() method from HorrorCharacter.
     */
    @Override
    public void flee(){
        System.out.println(getName() + " slowly sinks back into the lake from whence he came.");
    }


}//end class

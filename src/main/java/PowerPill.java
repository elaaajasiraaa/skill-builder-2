
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    public static int DEFAULT_POWER = 10;

    // instance variables
    int power;

    String name;

    // constructors

    public PowerPill (String name){
        this.name = name;
        power = DEFAULT_POWER;
    }

    public PowerPill (String name, int power){
        this.name = name;
        this.power = power;
    }


    // accessor methods
    public int getPower()
    {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // mutator methods

    @Override
    public String toString() {
        return "PowerPill " + name + " = " + power;
        // PowerPill <name> = <power>
    }


    // toString method

    // TODO - replace this line with instruction from step 8

}
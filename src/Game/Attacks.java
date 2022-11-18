package Game;

/**
 * Attacks class file
 * @author: Angel Lin
 * 
 */

public class Attacks {
    
    //Instance variables
    private String strAttackType = "stabs";
    private int intAttackDamage = 5;

    /**
     * Returns the AttackType of an Attacks object
     * 
     * @return String getAttackType which represents the type of attack for the hostile entity
     */
    public String getAttackType(){
        return strAttackType;
    }

    /**
     * Returns the AttackDamage of an Attacks object
     * 
     * @return int getAttackDamage which represents the attack damage of the hostile entity
     */
    public int getAttackDamage(){
        return intAttackDamage;
    }

    /**
     * Return the toString of an Attacks object
     * 
     * @return String toString which returns a message of the entity attacking the player
     */
    public String toString(){
        return Entity.getEntityName() + " attacks you by " + strAttackType + " for " + intAttackDamage;
    }

    /**
     * 
     * Constructor - creates new instance of Attacks object
     * 
     * Has no parameters
     * 
     */
    public Attacks(){
    }

}

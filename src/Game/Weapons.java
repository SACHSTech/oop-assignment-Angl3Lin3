package Game;

/**
 * Weapons class file
 * @author Angel Lin
 * 
 */

public class Weapons extends Items{
    
    //Instance variables
    private String strWeaponType;
    private int intWeaponDamage;

    /**
     * Return type of Weapons object
     * 
     * @return String strWeaponType which represents the type of weapon
     */
    public String getWeaponType(){
        return strWeaponType;
    }

    /**
     * Return the dmaage of Weapons object
     * 
     * @return int intWeaponDamage which represents the damage that a weapon does
     */
    public int getWeaponDamage(){
        return intWeaponDamage;
    }

    /**
     * Returns the reaction when you hit something
     * 
     * @return text that represents the weapon damaging something
     */
    public String toString(){
        return "You hit something.";
    }

    /**
     * Constructor - creates a new instance of Weapons object
     * 
     * @param itemName - name of weapon
     * @param use - if weapon can be used
     * @param weaponType - weapon type
     * @param weaponDamage - weapon damage
     */
    public Weapons(String itemName, boolean use, String weaponType, int weaponDamage){
        super(itemName, use);
        strWeaponType = weaponType;
        intWeaponDamage = weaponDamage;
    }

}

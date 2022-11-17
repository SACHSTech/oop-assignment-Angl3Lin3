public class Weapons extends Items{
    
    private String strWeaponType;
    private int intWeaponDamage;

    public String getWeaponType(){
        return strWeaponType;
    }

    public int getWeaponDamage(){
        return intWeaponDamage;
    }

    public String toString(){
        return "You hit someone.";
    }

    public Weapons(String itemName, boolean use, String weaponType, int weaponDamage){
        super(itemName, use);
        strWeaponType = weaponType;
        intWeaponDamage = weaponDamage;
    }

}

public class Attacks {
    
    private String strAttackType = "stabs";
    private int intAttackDamage = 5;

    public String getAttackType(){
        return strAttackType;
    }

    public int getAttackDamage(){
        return intAttackDamage;
    }

    public String toString(){
        return strAttackType + " for " + intAttackDamage;
    }

}

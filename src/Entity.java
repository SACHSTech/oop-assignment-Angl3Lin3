public class Entity {
    
    private int intHealth = 20;
    private String strName;
    private int intWalkSpeed;
    private boolean isEntityDead = false;
    private String strNoise;

    public int getEntityHealth(){
        return intHealth;
    }

    public String getEntityName(){
        return strName;
    }

    public int getWalkSpeed(){
        return intWalkSpeed;
    }

    public boolean getDead(){
        return isEntityDead;
    }



}

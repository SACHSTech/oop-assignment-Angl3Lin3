package Game;
public class Entity {
    
    private static int intEntityHealth = 20;
    private static String strEntityName;
    private int intWalkSpeed;
    private boolean isEntityDead = false;
    private String strNoise;

    public static int getEntityHealth(){
        return intEntityHealth;
    }

    public static String getEntityName(){
        return strEntityName;
    }

    public int getWalkSpeed(){
        return intWalkSpeed;
    }

    public boolean getDead(){
        return isEntityDead;
    }

    public String getNoise(){
        return strNoise;
    }

    public static void setEntityHP(){
        intEntityHealth = 20;
    }

    public static void setEntityHealth(int damage){
        intEntityHealth = intEntityHealth - damage;
    }

    public void setEntityDead(){
        isEntityDead = true;
    }

    public Entity(String entityName, String entityNoise){
        strEntityName = entityName;
        strNoise = entityNoise;
    }

    public String toString(){
        return "You have created " + strEntityName + " and makes the sound: " + strNoise;
    }

}

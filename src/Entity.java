public class Entity {
    
    private int intEntityHealth = 20;
    private String strEntityName;
    private int intWalkSpeed;
    private boolean isEntityDead = false;
    private String strNoise;

    public int getEntityHealth(){
        return intEntityHealth;
    }

    public String getEntityName(){
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

    public void setEntityHealth(int damage){
        intEntityHealth = intEntityHealth - damage;
    }

    public void setEntityDead(){
        isEntityDead = true;
    }

    public Entity(String entityName, String entityNoise){
        strEntityName = entityName;
        strNoise = entityNoise;
    }



}

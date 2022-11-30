package Game;

/**
 * Entity class file
 * @author Angel Lin
 * 
 */

public class Entity {
    
    //Instance variable
    private static int intEntityHealth = 20;
    private static String strEntityName;
    private int intWalkSpeed;
    private boolean isEntityDead = false;
    private String strNoise;

    /**
     * Returns the health of an entity for an Entity object
     * 
     * @return int intEntityHealth which represents the health of an entity
     */
    public static int getEntityHealth(){
        return intEntityHealth;
    }

    /**
     * Returns the name of an entity for an Entity object
     * 
     * @return String strEntityName which represents the name of an entity
     */
    public static String getEntityName(){
        return strEntityName;
    }

    /**
     * Returns the walking speed of an entity for an Entity object
     * 
     * @return int intWalkSpeed which represnts the speed of walking for an entity
     */
    public int getWalkSpeed(){
        return intWalkSpeed;
    }

    /**
     * Returns the status of death of an entity for an Entity object
     * 
     * @return boolean isEntityDead which represents the death status of an entity
     */
    public boolean getDead(){
        return isEntityDead;
    }

    /**
     * Returns the noise of an entity for an Entity object
     * 
     * @return String strNoise which represents the noise of an entity
     */
    public String getNoise(){
        return strNoise;
    }

    /**
     * Sets the health of an entity for an Entity object
     * 
     */
    public static void setEntityHP(){
        intEntityHealth = 20;
    }

    /**
     * Sets the health of an entity when damage is taken for an Entity object
     * 
     * @param damage - the damage something else will deal onto the entity
     */
    public static void setEntityHealth(int damage){
        intEntityHealth = intEntityHealth - damage;
    }

    /**
     * Sets if an entity is dead for an Entity object
     * 
     */
    public void setEntityDead(){
        isEntityDead = true;
    }

    /**
     * Constructor - creates new instance of an Entity object
     * 
     * @param entityName - name of the entity
     * @param entityNoise - noise that the entity makes
     */
    public Entity(String entityName, String entityNoise){
        strEntityName = entityName;
        strNoise = entityNoise;
    }

    /**
     * Returns the representation of an entity
     * 
     * @return text when an entity is created
     */
    public String toString(){
        return "You have created " + strEntityName + " and makes the sound: " + strNoise;
    }

}

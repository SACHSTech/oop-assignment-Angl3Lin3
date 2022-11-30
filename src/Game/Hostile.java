package Game;

/**
 * Hostile class file
 * @author Angel Lin
 * 
 */
public class Hostile extends Entity{
    
    //Instance variables
    private int intDetectionRange = 5;
    private int intWalkSpeed = 10;

    /**
     * Returns the detection range for a Hostile object
     * 
     * @return int intDetectionRange which represents the detection range for a hostile
     */
    public int getDetectionRange(){
        return intDetectionRange;
    }

    /**
     * Returns the stats of the entity
     * 
     * @return text that shows the status of range and speed for a hostile
     */
    public String toString(){
        return getEntityName() + " detects you from " + intDetectionRange + " blocks and is walking " + intWalkSpeed + " m/s towards you, what do you do? ";
    }

    /**
     * Constructor - creates new instance of a Hostile object
     * 
     * @param strName - name of the hostile
     * @param strNoise - noise that the hostile makes
     */
    public Hostile(String strName, String strNoise){
       super(strName, strNoise);
    }

}

package Game;

/**
 * Passive class file
 * @author Angel Lin
 * 
 */

public class Passive extends Entity{
    
    //Instance variables
    private boolean isAttacked = false;

    /**
     * Sets attack to true if passive gets attacked
     * 
     */
    public void setAttacked(){
        isAttacked = true;
    }

    /**
     * Return the status of the attack for Passive object
     * 
     * @return boolean isAttacked which represents if the passive got attacked or not
     */
    public boolean getAttacked(){
        return isAttacked;
    }

    /**
     * Constructor - creates a new instance for Passive object
     * 
     * @param strName - passive name
     * @param strNoise - passive noise
     */
    public Passive(String strName, String strNoise){
        super(strName, strNoise);
    }

    /**
     * Returns result if passive is hit
     * 
     * @return text that shows if passive entity is hit
     */
    public String toString(){
        return "Ahh you hit me :( ";
    }

}

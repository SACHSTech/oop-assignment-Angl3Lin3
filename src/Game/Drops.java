package Game;

/**
 * Drops class file
 * @author Angel Lin
 * 
 */

public class Drops {
    
    //Instance variables
    private String strDropName;
    private String strDropType;
    private int intDropNum;

    /**
     * returns the name of a Drop objet
     * 
     * @return String strDropName which represents the name of a drop
     */
    public String getDropName(){
        return strDropName;
    }

    /**
     * returns the type of a Drop object
     * 
     * @return String strDropType which represents the type of a drop
     */
    public String getDropType(){
        return strDropType;
    }

    /**
     * returns the number of Drop object
     * 
     * @return int intDropNum which represents the number of drops in the Drop object
     */
    public int getDropNum(){
        return intDropNum;
    }

    /**
     * returns the text of a Drop object
     * 
     * @return text that represents the drop that the user created
     */
    public String toString(){
        return "You've got " + intDropNum + " of " + strDropName + strDropType;
    }

}

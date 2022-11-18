package Game;

/**
 * Blocks class file
 * @author Angel Lin
 * 
 */

public class Blocks extends Items{

    //Instance variables
    private int intBlockNum;
    private String strColour;

    /**
     * Returns the number of blocks for a Blocks object
     * 
     * @return int intBlockNum, which represents the number of blocks
     */
    public int getBlockNum(){
        return intBlockNum;
    }

    /**
     * Returns the colour of a block for a Blocks object
     * 
     * @return String strColour, which represents the colour of a block
     */
    public String getColour(){
        return strColour;
    }

    /**
     * Returns the toString of Blocks class
     * 
     * @return text that shows the creation of a block object
     */
    public String toString(){
        return "You made " + intBlockNum + " blocks called " + getItemName() + " which are " + strColour;
    }
    
    /**
     * Constructor - creates new instance of a block object
     * 
     * @param itemName - name of the block object
     * @param use - if block object can be used
     * @param blockNum - block number
     * @param colour - block colour
     */
    public Blocks(String itemName, boolean use, int blockNum, String colour){
        super(itemName, use);
        intBlockNum = blockNum;
        strColour = colour;
    }

}

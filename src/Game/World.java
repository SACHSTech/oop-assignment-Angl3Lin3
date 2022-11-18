package Game;

/**
 * World class file
 * @author Angel Lin
 * 
 */

public class World {
    
    //Instance variables
    private int intEntityNum;
    private int intItemNum;

    /**
     * Return number of entity in World object
     * 
     * @return int intEntityNum which represents the amount of entity in the world
     */
    public int getEntityNum(){
        return intEntityNum;
    }

    /**
     * Return number of items in World object
     * 
     * @return int intItemNum which represents the amount of items in the world
     */
    public int getItemNum(){
        return intItemNum;
    }

    /**
     * Constructor - creates new instance of a World object
     * 
     * @param entityNum - number of entities
     * @param itemNum - number of items
     */
    public World(int entityNum, int itemNum){
        intEntityNum = entityNum;
        intItemNum = itemNum;
    }

    /**
     * Return the indication that number of entity and number of items are linked to World object
     * 
     * @return tect which represents the number of entity and items
     */
    public String toString(){
        return "There are " + intEntityNum + " entities and " + intItemNum + " items";
    }

}

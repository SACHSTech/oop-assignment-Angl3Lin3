package Game;

/**
 * Items class file
 * @author Angel Lin
 * 
 */
public class Items {

    //Instance variables
    private String strItemName;
    private boolean canUse;

    /**
     * Return the name of the Items object
     * 
     * @return String strItemName which represents the name of the item
     */
    public String getItemName(){
        return strItemName;
    }

    /**
     * Return the use status of the Items object
     * 
     * @return boolean canUse which represnts if the item is usable or not
     */
    public boolean getUse(){
        return canUse;
    }

    /**
     * Constructor - creates new instance of an Items object
     * 
     * @param itemName - item name
     * @param use - if item can be used
     */
    public Items(String itemName, boolean use){
        strItemName = itemName;
        canUse = use;
    }

    /**
     * Return status of the Item object
     * 
     * @return text that represents the creation of an item
     */
    public String toString(){
        return "You have created " + strItemName + " and usage: " + canUse;
    }

}
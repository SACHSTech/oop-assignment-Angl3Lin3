package Game;

/**
 * Food object class
 * @author Angel Lin
 * 
 */

public class Food extends Items{
    
    //Instance variables
    private int intHeal;
    private int intFoodNum;

    /**
     * Returns the amount of healing for a Food object
     * 
     * @return int intHeal, which represnts the amount of health food can do
     */
    public int getHeal(){
        return intHeal;
    }

    /**
     * Returns the amount of food for a Food object
     * 
     * @return int intFoodNum, which represents the amount of food
     */
    public int getFoodNum(){
        return intFoodNum;
    }

    /**
     * Returns the result of eating the food
     * 
     * @return text that represents eating food
     */
    public String toString(){
        return "You ate something.";
    }

    /**
     * Construct - creates a new instance of a Food object
     * 
     * @param itemName - name of food
     * @param use - if the food can be used
     * @param heal - how much the food heals for
     * @param foodNum - the amount of food
     */
    public Food(String itemName, boolean use, int heal, int foodNum){
        super(itemName, use);
        intHeal = heal;
        intFoodNum = foodNum;
    }

}

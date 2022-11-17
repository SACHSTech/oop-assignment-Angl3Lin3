public class Food extends Items{
    
    private int intHeal;
    private int intFoodNum;

    public int getHeal(){
        return intHeal;
    }

    public int getFoodNum(){
        return intFoodNum;
    }

    public String toString(){
        return "You ate something.";
    }

    public Food(String itemName, boolean use, int heal, int foodNum){
        super(itemName, use);
        intHeal = heal;
        intFoodNum = foodNum;
    }

}

public class Blocks extends Items{
    
    private int intBlockNum;
    private String strColour;

    public int getBlockNum(){
        return intBlockNum;
    }

    public String getColour(){
        return strColour;
    }

    public String toString(){
        return "You made " + intBlockNum + " blocks called " + getItemName() + " which are " + strColour;
    }
    
    public Blocks(String itemName, boolean use, int blockNum, String colour){
        super(itemName, use);
        intBlockNum = blockNum;
        strColour = colour;
    }

}

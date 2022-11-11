public class Items {

    private String strItemName;
    private boolean canUse;

    public String getItemName(){
        return strItemName;
    }

    public boolean getUse(){
        return canUse;
    }

    public Items(String itemName, boolean use){
        strItemName = itemName;
        canUse = use;
    }

    public String toString(){
        return "You have created " + strItemName + " and usage: " + canUse;
    }

}
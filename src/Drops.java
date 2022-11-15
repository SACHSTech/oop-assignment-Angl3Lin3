public class Drops {
    
    private String strDropName;
    private String strDropType;
    private int intDropNum;

    public String getDropName(){
        return strDropName;
    }

    public String getDropType(){
        return strDropType;
    }

    public int getDropNum(){
        return intDropNum;
    }

    public String toString(){
        return "You've got " + intDropNum + " of " + strDropName + strDropType;
    }

}

public class World {
    
    private int intEntityNum;
    private int intItemNum;

    public int getEntityNum(){
        return intEntityNum;
    }

    public int getItemNum(){
        return intItemNum;
    }

    public World(int entityNum, int itemNum){
        intEntityNum = entityNum;
        intItemNum = itemNum;
    }


}

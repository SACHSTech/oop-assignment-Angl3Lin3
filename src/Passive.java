public class Passive extends Entity{
    
    private boolean isAttacked = false;

    public void setAttacked(){
        isAttacked = true;
    }

    public boolean getAttacked(){
        return isAttacked;
    }

    public Passive(String strName, String strNoise){
        super(strName, strNoise);
    }

    public String toString(){
        return "Ahh you hit me :(";
    }

}

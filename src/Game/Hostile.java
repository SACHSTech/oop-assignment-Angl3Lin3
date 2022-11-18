package Game;
public class Hostile extends Entity{
    
    private int intDetectionRange = 5;
    int intWalkSpeed = 10;

    public int getDetectionRange(){
        return intDetectionRange;
    }

    public String toString(){
        return getEntityName() + " detects you from " + intDetectionRange + " blocks and is walking " + intWalkSpeed + " m/s towards you, what do you do? ";
    }

    public Hostile(String strName, String strNoise){
       super(strName, strNoise);
    }

}

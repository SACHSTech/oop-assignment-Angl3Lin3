public class Hostile extends Entity{
    
    private int intDetectionRange = 5;
    int intWalkSpeed = 10;

    public int getDetectionRange(){
        return intDetectionRange;
    }

    public String toString(){
        return getEntityName() + " detects you from " + intDetectionRange + " walking " + intWalkSpeed + " m/s, what do you do? ";
    }

}

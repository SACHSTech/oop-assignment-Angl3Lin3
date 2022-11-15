public class Player {
    
    private int intPlayerHealth = 20;
    private String strPlayerName;
    private boolean isPlayerDead = false;

    public int getPlayerHealth(){
        return intPlayerHealth;
    }

    public void setPlayerHealth(int damage){
        intPlayerHealth = intPlayerHealth - damage;
    }

    public String getPlayerName(){
        return strPlayerName;
    }

    public boolean setPlayerDead(){
        return true;
    }

    public boolean getPlayerDead(){
        return isPlayerDead;
    }

    public Player(String playerName){
        strPlayerName = playerName;
    }

}

public class Player {
    
    int intPlayerHealth = 20;
    String strPlayerName;
    boolean isPlayerDead = false;

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

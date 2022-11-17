public class Player {
    
    private int intPlayerHealth = 20;
    private String strPlayerName;
    private boolean isPlayerDead = false;

    public int getPlayerHealth(){
        return intPlayerHealth;
    }

    public void setPlayerDamage(int damage){
        intPlayerHealth = intPlayerHealth - damage;
    }

    public void setPlayerHealth(int health){
        intPlayerHealth = intPlayerHealth + health;
    }

    public String getPlayerName(){
        return strPlayerName;
    }

    public void setPlayerDead(){
        isPlayerDead = true;
    }

    public boolean getPlayerDead(){
        return isPlayerDead;
    }

    public Player(String playerName){
        strPlayerName = playerName;
    }

}

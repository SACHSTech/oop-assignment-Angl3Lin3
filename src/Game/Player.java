package Game;

/**
 * Player class file
 * @author Angel Lin
 * 
 */

public class Player {
    
    //Instance variables
    private int intPlayerHealth = 20;
    private String strPlayerName;
    private boolean isPlayerDead = false;

    /**
     * Return health of a Player object
     * 
     * @return int intPlayerHealth which represents the health of a player
     */
    public int getPlayerHealth(){
        return intPlayerHealth;
    }

    /**
     * Sets the player health by subtracting damage
     * 
     * @param damage - damage from entities
     */
    public void setPlayerDamage(int damage){
        intPlayerHealth = intPlayerHealth - damage;
    }

    /**
     * Sets the player health by adding health
     * 
     * @param health - health from food
     */
    public void setPlayerHealth(int health){
        intPlayerHealth = intPlayerHealth + health;
    }

    /**
     * Return the name of Player object
     * 
     * @return String strPlayerName which represents the name of the player
     */
    public String getPlayerName(){
        return strPlayerName;
    }

    /**
     * Sets the death status of the player
     * 
     */
    public void setPlayerDead(){
        isPlayerDead = true;
    }

    /**
     * Return the status of death of a Player object
     * 
     * @return boolean isPlayerDead which represents whether a player is dead or not
     */
    public boolean getPlayerDead(){
        return isPlayerDead;
    }

    /**
     * Constructor - creates new instance for Player object
     * 
     * @param playerName - name of player
     */
    public Player(String playerName){
        strPlayerName = playerName;
    }

}

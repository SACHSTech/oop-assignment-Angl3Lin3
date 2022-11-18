package Game;

/**
 * Main class file
 * @author Angel Lin
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        addLine();
        //Initialize
        boolean blattacks = false;

        //Create scanner
        Scanner scan = new Scanner(System.in);

        //Asks for user input for player name
        System.out.print("Enter player name: ");
        String playerName = scan.nextLine();
        Player mainPlayer = new Player(playerName);

        addLine();

        //Asks for user input for number of entities and items
        System.out.print("Enter number of entities: ");
        int intEntityNum = scan.nextInt();
        System.out.print("Enter number of items: ");
        int intItemNum = scan.nextInt();

        World start = new World(intEntityNum, intItemNum);

        //Prings out number of entities and items
        addLine();
        System.out.println(start);
        addLine();

        //Create arrays for entities
        ArrayList<String> entityInfoName = new ArrayList<String>();
        ArrayList<String> entityInfoNoise = new ArrayList<String>();

        //For loop to ask for each entities name and noise
        for(int i = 0; i < intEntityNum; i++){
            System.out.print("Enter entity name: ");
            String entityName = scan.next();
            System.out.print("Enter entity noise: ");
            String entityNoise = scan.next();
            addLine();

            Entity create = new Entity(entityName, entityNoise);
            System.out.println(create);
            entityInfoName.add(entityName);
            entityInfoNoise.add(entityNoise);
            addLine();
        }

        //Create arrays for items
        ArrayList<String> itemInfoName = new ArrayList<String>();
        ArrayList<Boolean> itemInfoUse = new ArrayList<Boolean>();

        //For loop to ask for each items name and if can use
        for(int i = 0; i < intItemNum; i++){
            System.out.print("Enter item name: ");
            String itemName = scan.next();
            System.out.print("Enter true: if you can use the item, false: if you can not: ");
            boolean itemUse = scan.nextBoolean();
            addLine();

            Items create = new Items(itemName, itemUse);
            System.out.println(create);
            itemInfoName.add(itemName);
            itemInfoUse.add(itemUse);
            addLine();
        }

        //Asks for user input for hostile number of entities
        System.out.print("Of the " + intEntityNum + " how many of them do you want to be hostile?: ");
        int intHostileNum = scan.nextInt();
        addLine();

        //For loop for each hostile entity in order to fight them
        for (int i = 0; i < intHostileNum; i++){
            if (mainPlayer.getPlayerHealth() < 1){
                mainPlayer.setPlayerDead();
            }
            //Asks user input for which entity they want to fight
            System.out.print("Which one do you want to fight? (Enter a number corresponding to the order you made them): ");
            int intHostileOrder = scan.nextInt();
            addLine();
            Hostile attacks = new Hostile(entityInfoName.get(intHostileOrder - 1), entityInfoNoise.get(intHostileOrder - 1));
            System.out.println(attacks);
            addLine();
            Thread.sleep(2000);
            System.out.println("Too late... you are fighting now!");
            addLine();
            Thread.sleep(2000);
            System.out.println("---------------------------------------------------------------------------------------");
            addLine();
            Thread.sleep(2000);
            Entity.setEntityHP();
            //While loop in order for players to use items
            while(mainPlayer.getPlayerHealth() > 1 && Entity.getEntityHealth() > 1){
                System.out.print("Which item do you choose to use? (Enter a number corresponding to the order you made them): ");
                int intItemOrder = scan.nextInt();
                addLine();
                System.out.print("What do you choose to use? weapon, block, or food? (lowercase): ");
                String decision = scan.next();
                addLine();
                //if condition for weapon options
                if (decision.equals("weapon")){
                    System.out.print("What type of weapon is it?: ");
                    String weaponType = scan.next();
                    addLine();
                    System.out.print("How much damage does it do?: ");
                    int weaponDamage = scan.nextInt();
                    addLine();
                    Weapons newWeapon = new Weapons(itemInfoName.get(intItemOrder - 1), itemInfoUse.get(intItemOrder - 1), weaponType, weaponDamage);
                    //if weapon can be used, follow this
                    if (newWeapon.getUse() == true){
                        System.out.print("Hit the hostile entity, yes or no?: ");
                        String choice = scan.next();
                        addLine();
                            //if user attacks, follow this
                            if(choice.equals("yes")){
                                Entity.setEntityHealth(weaponDamage);
                                System.out.println(newWeapon);
                                System.out.println("The entity is now " + Entity.getEntityHealth() + " HP.");
                                //if entity health is less than 1, break the loops
                                if (Entity.getEntityHealth() < 1){
                                    break;
                                }
                                addLine();
                            //if user does not attack, print this
                            }else{
                                System.out.println("Okay???");
                            }
                    //if weapon can not be used, print this
                    } else {
                        System.out.println("Why would you make something that you don't use?");
                    }
                //if condition for block options
                } else if (decision.equals("block")){
                    System.out.print("How many blocks do you want?: ");
                    int blockNum = scan.nextInt();
                    addLine();
                    System.out.print("What colour is it?: ");
                    String colour = scan.next();
                    addLine();
                    Blocks newBlock = new Blocks(itemInfoName.get(intItemOrder - 1), itemInfoUse.get(intItemOrder - 1), blockNum, colour);
                    System.out.println(newBlock);
                    System.out.println("Congradualations you wasted your time!");
                //if condition for food options
                } else if (decision.equals("food")){
                    System.out.print("How much food do you want?: ");
                    int foodNum = scan.nextInt();
                    addLine();
                    System.out.print("How much does this food heal you for?: ");
                    int foodHeal = scan.nextInt();
                    Food newFood = new Food(itemInfoName.get(intItemOrder - 1), itemInfoUse.get(intItemOrder - 1), foodHeal, foodNum);
                    addLine();
                    //if food can be used, follow this
                    if (newFood.getUse() == true){
                        System.out.print("Eat the food to heal? yes or no?: ");
                        String choice = scan.next();
                        addLine();
                        //if user agrees to use the food, heal
                        if (choice.equals("yes")){
                            mainPlayer.setPlayerHealth(foodHeal);
                            System.out.println("Your health is now: " + mainPlayer.getPlayerHealth() + "HP.");
                        //if user does not agree, print this
                        } else {
                            System.out.println("Why???");
                        }
                    //if food can not be used, print this
                    } else {
                        System.out.println("Why would you make something that you don't use?");
                    }
                } else {
                    System.out.println("Congradualations you have messed up your turn!");
                }
                //Attack the player after each turn
                addLine();
                Attacks newAttack = new Attacks();
                System.out.println(newAttack);
                mainPlayer.setPlayerDamage(newAttack.getAttackDamage());
                addLine();
                //if player health is less than 1, set the player as dead
                if (mainPlayer.getPlayerHealth() < 1){
                    mainPlayer.setPlayerDead();
                    break;
                }     
            }
        }
        addLine();

        //if player health is less than 1, set the player as dead
        if (mainPlayer.getPlayerHealth() < 1){
            mainPlayer.setPlayerDead();
        }     

        //if player is not dead, follow this
        if (mainPlayer.getPlayerDead() == false){
            System.out.println("Congradulations! You did not die!");
            Thread.sleep(2000);
            System.out.println("Heres your gift for you!");
            Thread.sleep(2000);
            addLine();
            System.out.print("Of the " + intEntityNum + " how many of them do you want to be passive?: ");
            int intPassive = scan.nextInt();
            addLine();
            //for loop the amount of passive entities user chose
            for (int i = 0; i < intPassive; i++){
                System.out.print("Which passive do you choose to use? (Enter a number corresponding to the order you made them): ");
                int intPassiveOrder = scan.nextInt();
                Passive newPassive = new Passive(entityInfoName.get(intPassiveOrder - 1), entityInfoNoise.get(intPassiveOrder - 1));
                addLine();
                System.out.println("Now you will have to attack them!");
                Thread.sleep(2000);
                addLine();
                System.out.println(newPassive);
                Thread.sleep(2000);
                newPassive.setAttacked();
                addLine();
                //if passive did get attacked, do this
                if (newPassive.getAttacked() == true){
                    blattacks = true;
                //if passive did not get attacked, do this
                } else {
                    blattacks = false;
                }
            }
        //if player is dead, follow this
        } else if (mainPlayer.getPlayerDead() == true){
            System.out.println("Wow you died. :(");
        }
        //if passive gets attacked, print this
        if (blattacks == true){
            System.out.println("You won but at what cost.");
        //if passive does not get attacked, print this
        } else if (blattacks == false){
            System.out.println("You lost.");
        }

        scan.close();

        addLine();

    }

    /**
     * Prints out a new blank line
     */
    public static void addLine(){
        System.out.println(" ");
    }

}

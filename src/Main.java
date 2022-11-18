import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        addLine();
        boolean attacks = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String playerName = scan.nextLine();
        Player mainPlayer = new Player(playerName);

        addLine();

        System.out.print("Enter number of entities: ");
        int intEntityNum = scan.nextInt();
        System.out.print("Enter number of items: ");
        int intItemNum = scan.nextInt();

        World start = new World(intEntityNum, intItemNum);

        addLine();
        System.out.println(start);
        addLine();

        ArrayList<String> entityInfoName = new ArrayList<String>();
        ArrayList<String> entityInfoNoise = new ArrayList<String>();

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

        ArrayList<String> itemInfoName = new ArrayList<String>();
        ArrayList<Boolean> itemInfoUse = new ArrayList<Boolean>();

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

        System.out.print("Of the " + intEntityNum + " how many of them do you want to be hostile?: ");
        int intHostileNum = scan.nextInt();
        addLine();
        while(mainPlayer.getPlayerHealth() > 1 && Entity.getEntityHealth() > 1){
        for(int i = 0; i < intHostileNum; i++){
            System.out.print("Which one do you want to fight? (Enter a number corresponding to the order you made them): ");
            int intHostileOrder = scan.nextInt();
            addLine();

            Hostile attacks = new Hostile(entityInfoName.get(intHostileOrder - 1), entityInfoNoise.get(intHostileOrder - 1));
            System.out.println(attacks);
            addLine();
            Thread.sleep(3000);
            System.out.println("Too late... you are fighting now!");
            addLine();
            Thread.sleep(2000);
            System.out.println("---------------------------------------------------------------------------------------");
            addLine();
            Thread.sleep(2000);
            for (int j = 0; j < intItemNum; j++){
                System.out.print("Which item do you choose to use? (Enter a number corresponding to the order you made them): ");
                int intItemOrder = scan.nextInt();
                addLine();
                System.out.print("What do you choose to use? weapon, block, or food? (lowercase): ");
                String decision = scan.next();
                addLine();
                if (decision.equals("weapon")){
                    System.out.print("What type of weapon is it?: ");
                    String weaponType = scan.next();
                    addLine();
                    System.out.print("How much damage does it do?: ");
                    int weaponDamage = scan.nextInt();
                    addLine();
                    Weapons newWeapon = new Weapons(itemInfoName.get(intItemOrder - 1), itemInfoUse.get(intItemOrder - 1), weaponType, weaponDamage);
                    if (newWeapon.getUse() == true){
                        System.out.print("Hit the hostile entity, yes or no?: ");
                        String choice = scan.next();
                        addLine();
                            if(choice.equals("yes")){
                                Entity.setEntityHealth(weaponDamage);
                                System.out.println("The entity is now " + Entity.getEntityHealth() + " HP.");
                            }else{
                                System.out.println("Okay???");
                            }
                    } else {
                        System.out.println("Why would you make something that you don't use?");
                    }
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
                } else if (decision.equals("food")){
                    System.out.print("How much food do you want?: ");
                    int foodNum = scan.nextInt();
                    addLine();
                    System.out.print("How much does this food heal you for?: ");
                    int foodHeal = scan.nextInt();
                    Food newFood = new Food(itemInfoName.get(intItemOrder - 1), itemInfoUse.get(intItemOrder - 1), foodHeal, foodNum);
                    addLine();
                    if (newFood.getUse() == true){
                        System.out.print("Eat the food to heal? yes or no?: ");
                        String choice = scan.next();
                        addLine();
                        if (choice.equals("yes")){
                            mainPlayer.setPlayerHealth(foodHeal);
                            System.out.println("Your health is now: " + mainPlayer.getPlayerHealth() + "HP.");
                        } else {
                            System.out.println("Why???");
                        }
                    } else {
                        System.out.println("Why would you make something that you don't use?");
                    }
                } else {
                    System.out.println("Congradualations you have messed up your turn!");
                }
                addLine();
                Attacks newAttack = new Attacks();
                System.out.println(newAttack);
                mainPlayer.setPlayerDamage(newAttack.getAttackDamage());
                addLine();
                if (mainPlayer.getPlayerHealth() < 1){
                    mainPlayer.setPlayerDead();
                }
            }
        }
        addLine();
        }   

        if (mainPlayer.getPlayerDead() == true){
            System.out.println("Congradulations! You did not die!");
            Thread.sleep(2000);
            System.out.println("Heres your gift for you!");
            Thread.sleep(2000);
            System.out.print("Of the " + intEntityNum + " how many of them do you want to be passive?: ");
            int intPassive = scan.nextInt();
            addLine();
            for (int i = 0; i < intPassive; i++){
                System.out.print("Which passive do you choose to use? (Enter a number corresponding to the order you made them): ");
                int intPassiveOrder = scan.nextInt();
                Passive newPassive = new Passive(entityInfoName.get(intPassiveOrder - 1), entityInfoNoise.get(intPassiveOrder - 1));
                addLine();
                System.out.println("Now you will have to attack them!");
                addLine();
                System.out.println(newPassive);
                newPassive.setAttacked();
                addLine();
                if (newPassive.getAttacked() == true){
                    attacks = true;
                } else {
                    attacks = false;
                }
            }
        } else if (mainPlayer.getPlayerDead() == false){
            System.out.println("Wow you died. :(");
        }
        if (attacks == true){
            System.out.println("You won but at what cost.");
        } else if (attacks == false){
            System.out.println("You lost.");
        }

        scan.close();

        addLine();

    }

    public static void addLine(){
        System.out.println(" ");
    }

}

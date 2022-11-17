import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        addLine();

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

            System.out.println("---------------------------------------------------------------------------------------");
            addLine();

            for(int j = 0; j < intItemNum; j++){
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
                    if(newWeapon.getUse() == true){
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

                } else {
                    System.out.println("Congradualations you have messed up your turn!");
                }
            }

            
        }

        scan.close();

        addLine();

    }

    public static void addLine(){
        System.out.println(" ");
    }

}

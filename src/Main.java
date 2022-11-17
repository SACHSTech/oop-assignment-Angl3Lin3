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
            System.out.print("What do you choose to use? Weapon, blocks, or food?: ");
            String decision = scan.nextLine();

        }

        scan.close();

        addLine();

    }

    public static void addLine(){
        System.out.println(" ");
    }

}

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        addLine();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of entities: ");
        int intEntityNum = scan.nextInt();
        System.out.print("Enter number of items: ");
        int intItemNum = scan.nextInt();

        World start = new World(intEntityNum, intItemNum);

        addLine();
        System.out.println(start);
        addLine();

        HashMap<String, Boolean> itemInfo = new HashMap<String, Boolean>();

        for(int i = 0; i < intItemNum; i++){
            System.out.print("Enter item name: ");
            String itemName = scan.next();
            System.out.print("Enter true: if you can use the item, false: if you can not: ");
            boolean itemUse = scan.nextBoolean();
            addLine();

            Items create = new Items(itemName, itemUse);
            System.out.println(create);
            itemInfo.put(itemName, itemUse);
            addLine();
        }

        scan.close();

        addLine();

    }

    public static void addLine(){
        System.out.println(" ");
    }

}

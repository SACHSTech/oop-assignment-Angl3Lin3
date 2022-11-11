import java.util.Scanner;

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

        scan.close();

        addLine();

    }

    public static void addLine(){
        System.out.println(" ");
    }

}

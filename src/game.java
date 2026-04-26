import java.util.Scanner;
public class game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your adjective1 :");
        String adjective1 =  scanner.nextLine();
        System.out.print("enter your noun :");
        String noun = scanner.nextLine();
        System.out.print("enter your adjective2 : ");
        String adjective2 = scanner.nextLine();
        System.out.print("enter your verb :");
        String verb = scanner.nextLine();
        System.out.print("enter your adjective3 :");
        String adjective3 = scanner.nextLine();
        System.out.println("\n today i went to a "+ adjective1 + " zoo");
        System.out.println("in an exhibit , i saw a " + noun + ".");
        System.out.println(noun + " was "+ adjective2+ " and " + verb + "!");
        System.out.println("i was "+ adjective3 + "!");


    }
}

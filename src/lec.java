import java.util.Scanner;
public class lec {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age");
        int age = scanner.nextInt();
        scanner.nextLine(); // THE REASON FOR ADDING THIS LINE

        System.out.print("enter yur favrouite colour");
        String colour = scanner.nextLine();
        scanner.close();
        //JAB HUM AGE (18) LIKH KE ENTER PRESS KARTE HE
        //TO nextInt 18 to leleta par enter key ko clear nhi karta
        //TO String.next line ke pass ENTER key aati he aur WO ENTER
        // KEY KO AS A BLANK LEKR PROCESS
        // HOJATA HE AUR BINA COLOUR LIYE PROCESS HOJATA
        /*
        nextInt();   // takes 18
        nextLine();  // sees Enter → takes empty

         */
        //BUT scanner.nextLine(); ISS ENTER KEY KO CLEAR KARDETRA
        //HE TO STRING ME HUME TYPE KAR SAKTE HE
        /*
        nextInt();
        nextLine();  // removes Enter
        nextLine();  // now waits for your colour

         */
    }
}

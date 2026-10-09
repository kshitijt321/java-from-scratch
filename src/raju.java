//scaner ek asa object he jo user input ko allow karta he java me
//scaner use karne ke liye hame use import karna padega called utilities
import java.util.Scanner;
public class raju {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.print(" hello "+ name);
        System.out.print(" your age = ");
        int age = scanner.nextInt();
        System.out.println("your age is " + age);
        System.out.print("what is your gpa = ");
        double gpa = scanner.nextDouble();
        System.out.print(" you are a student ");
        boolean isStudent = scanner.nextBoolean();
        System.out.print("your name is " + name + " your age  is "+ age + " what is your gpa " + gpa);
        //ye sab hamne user input ke liye kiya ki user bhi ek input de paye
        // to sabse phele hamne first line me Scanner (class) aur scanner (object) ko banaya
        //fir system.out me hame jiss cheez me input dawana he wo ... jese abhi input ek characters he to
        // ( enter you name ) to next line me hamne string ka user input banaya aur
        // output me hum enter your name me apna name likh paye
        //next hame your age me input daalna tha to hamne ek integer ka user input banaya ( enter your age)
        //aur output me ham apne age enter kar paye
        //hame phele kis cheezx me input dena wo banana fir jis data type ka hoga uss hissab se hame
        // user input banana
        if(isStudent){
            System.out.print("you are a student "+ isStudent);{



            }

        }
        else{
            System.out.print(" you are not a student ");
        };
        scanner.close();

    }
}

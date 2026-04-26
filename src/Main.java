public class Main {
    public static void main(String[] args) {
        //variable = it is a reusable container for a value and
        // a variable behaves as if it was the value it contains
        // different data types hote he
        //two types of variable hote he
        //primitive  = simple value stored directly in memory (stack) mtlb ye variable directly memory me store hote
        // ex mene 10 rupe diye to wo directly hath me dediye
        //Refernce variable = memory addres (stack) that points to the (heap) mtlb refernce variable me ek memory addres
        // create hota he (stack ) joki heap ki taraf point karta he
        //primitive = int , doublke , char , boolean
        //refrence = string array object  these are data types
        //steps to create a variable
        // decleration = phele value ya data type declare karo jese int age 20
        //then assgnment  = mtlb system.out wala
        //agr me print ln me ("age") ase likhunga to age print hoga naki integer
        //for 20 use println("20")
        int age = 20;
        int year = 2004;
        int number = 60;
        //double data type is a number but it can contain decimal unlike int
        double indianruppes = 66.66;
        double inflation = 99.99;
        char grade = 'A';
        char symbol = '!';


        //hum double me integer ki value ko daal sakte par integer me double ki value ko nahi
        //bollen variabels are either true or false
        boolean Isstudent = false;
        //agr do words ka use kar rahe jese is student then is ka i should be small
        // and student ka s should be capital not necceseary
        //boolean internaly zada use hote he jese if else statement me
        boolean How = false;

        System.out.println(age+" of males were born in year " + year+ " are now aged " + number +
                " and the price of indian ruppes is " + indianruppes + " the inflation is increased by " +
                inflation + " percent ");
        System.out.println("i got a "+ grade + " in my test " + symbol);
        System.out.println("kshitij is a very good student "+ Isstudent);
        if(Isstudent){
            System.out.println("you are a student ");


        }
        else{
            System.out.print("you are not a student");
            //mtlb if isstudent is true to print you are a student but
            // if it is false then print you are not a student
            String name = "kshitij";
            String email = "kshitij497@gamil.com";
            //string me hum bhot sare characters use kar sakte he unlike
            //char usme single character hi use kar sakte he
            // string me double quotes use karne hote he
            System.out.println("your name  is " + name + "and his "+ email+ "is");
//string me numner bhi use kar sakte he
        }

    }
}

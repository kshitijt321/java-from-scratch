//calculate are of rectangle
import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your length :" );
        double length = scanner.nextDouble();

        System.out.print("enter your breath :" );
        double breath = scanner.nextDouble();
        double area = length* breath;
        System.out.print("your area of rectangle :" + area + " cm^2" );



    }
}

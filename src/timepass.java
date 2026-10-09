import java.util.Scanner;
public class timepass {
    public static void main (String[] args){
        Scanner pagu = new Scanner(System.in );
        System.out.println("area of rectsngle");
        System.out.println("enter the lenght in cm ");
        double lenght = pagu.nextDouble();
        pagu.nextLine();
        System.out.println("enter the breath in cm ");
        double breath = pagu.nextDouble();
        double area = breath * lenght ;
        System.out.println("your area is "+ area +"cm ");
    }
}
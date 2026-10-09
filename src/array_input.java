



import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];// integer type ke 5 data ko store karega
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++){
            System.out.println("enter the value of array for index "+ i);
            arr[i] = sc.nextInt();
            System.out.println("your " + (i+1)+ " value of array is "+ arr[i]);
        }

        for (int val : arr){

            System.out.println("seeing elelments by for each method ");
            System.out.println(val);// ase bhi dekh sakte value ko
        }
    }



    }



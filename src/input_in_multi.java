import java.util.Scanner;

public class input_in_multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int row =0 ; row<arr.length;row++){
            for(int col=0 ; col < arr[row].length;col++){
                System.out.println("give value for "+row+ "and for "+col);
                arr[row][col] = sc.nextInt();
            }

        }
        for(int rowIndex = 0; rowIndex <arr.length; rowIndex++){
            for(int colIndex = 0; colIndex <arr[rowIndex].length; colIndex++){
                System.out.print(arr[rowIndex][colIndex]);
            }
            System.out.println();
        }

    }
}

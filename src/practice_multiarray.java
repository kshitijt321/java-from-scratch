

public class practice_multiarray {
    public static void main(String[] args) {
        int numbers [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum =0 ;
        for(int row =0 ; row<numbers.length;row++){
            for(int col=0 ; col < numbers[row].length;col++){
               int val = numbers[row][col];// row aur col me 0 ,0 aur o ,1 ase value aake rakha
               //rahi he
               sum = sum + val;


            }

        }
        System.out.println(sum);

        int multi = 1 ;

        for(int row =0 ; row<numbers.length;row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                int val = numbers[row][col];
                multi = multi* val;

            }
        }
        System.out.println(multi);

    }


}

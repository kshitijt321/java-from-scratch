public class multiarray2 {
    public static void main(String[] args) {
        int numbers [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //acsessing elements of  multi array
        int number_of_rows = numbers.length;
        int number_of_col_in_that_row = numbers[0].length;

        for(int rowIndex = 0; rowIndex <number_of_rows; rowIndex++){
            for(int colIndex = 0; colIndex <number_of_col_in_that_row; colIndex++){
                System.out.print(numbers[rowIndex][colIndex]);
            }
            System.out.println();
        }

        //now a method that works even when the row and coloum numbers are diffrent



        int arr [][] = {
                {1,2},
                {3,4,5,6,},
                {7,9,8}




        };
        //so row number to utna hi he
        int rowLength = arr.length;

        for(int rowIndex = 0 ; rowIndex<rowLength; rowIndex++){
            //jaise hi hum kisi new row me aayenge to
            // to atte hi hum uss row ka coloum length find out katlenge kyuki col lenght hi change kar rahi thi
            //current row -> arr[row index]

            // uss row me kitne coloums he -> arr[row index ].length

            for( int colIdex = 0 ; colIdex<arr[rowIndex].length; colIdex++){
                // col ki length changwe ho rahi thi so
                // hum har row me kitne col he uski lenght nikal rahe
                System.out.print(arr[rowIndex][colIdex]);
            }
            System.out.println();
        }
    }
}

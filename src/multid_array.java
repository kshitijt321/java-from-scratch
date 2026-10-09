

public class multid_array {
    //A multidimensional array is an array that contains other arrays.
    //To create a two-dimensional array, write each row inside its own curly braces:
    //int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };

    //Here, myNumbers has two arrays (two rows):
    //
    //First row: {1, 4, 2}
    //Second row: {3, 6, 8}
    public static void main(String[] args) {

        int [][] arr = new int[3][4];
        //initializaton ...arr has 3 row and 4 coloums


        int[][] nums = {{1, 23, 34}, {45, 56, 67}};

        //To access an element of a two-dimensional array, you need two indexes:
        // the first for the row, and the second for the column.
        //
        //Remember: Array indexes start at 0. That means row 0 is the first row, and column 0 is the first column.
        // (So row index 1 is the second row, and column index 2 is the third column.)
        //
        //This statement accesses the element in the second row (index 1) and third column (index 2) of the myNumbers array:
        System.out.println(nums [1][2]);
        //You can overwrite an existing element using the same two-index notation (row, then column):
        nums[1][2] = 66;
        System.out.println(nums[1][2]);

        //Rows and Columns (Lengths)
        //You can use length to get the number of rows, and myNumbers[row].length for the number of columns in a given row:

        System.out.println(nums.length); // gives number of rows
        System.out.println("coloum in row 0 "+ nums[0].length);// works only when each row has same ammount of coloum
        System.out.println("coloum in row 1 "+ nums[1].length);

    }
}

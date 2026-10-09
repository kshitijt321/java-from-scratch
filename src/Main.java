//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declaration
        int arr [] ;

        // allocation ; giving space to array
        arr = new int [6];

        // initialization
        int []brr = {10, 20, 34};

        //To change the value of a specific element, refer to the index number:

        brr[1] = 12;



        //acessing elements of array
      //  brr == aray name ,[2 ] its index number ... as at index 0 .. 10 is located at 1 -- 20 is , at 2 -- 34 is located
        System.out.println("value at index 0 -- "+brr[0]);
        System.out.println("value at index 1 -- "+brr[1]);
        System.out.println("value at index 2 --"+brr[2]);



        int n = brr.length;
        // used for finding length of array
        // THIS WILL GIVE ANS 3 ... YE 1 SE COUNT KARTA HE 0 SE NAHI
        System.out.println(n);

        // by for loop we can acsess each elements of array

        for(int index = 0 ; index<=n-1; index++){// yaha n -1 lena padega kyuki index 0 se start hota he
            System.out.println(brr[index]);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // acsessing elements of array with for each loop

        for(int value : brr){
            System.out.println(value);

            // this means that for every integer value inside brr ( array ) we are going
            // to print that value
        }
//this will print 10 , 20 ,30

        }
    }

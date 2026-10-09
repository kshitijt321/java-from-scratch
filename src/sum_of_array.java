public class sum_of_array {
    public static void main(String[] args) {
        int [] arr = {12,343,54,76,67};


        System.out.println(arr.length);

        int sum = 0;
        for(int i = 0;  i < arr.length; i ++ ){
            sum = sum + arr[i];

        }
        System.out.println(sum);

        System.out.println(" seat number for friends ");

        String  friendsName [] = {"rahul ", "mehul", "sehul ", "raando ", "chinra"};
        for(int i =0 ; i<friendsName.length;i++){
            System.out.println(friendsName[i]+"  will be seated at seat number "+ (i+1));//bracekt ke andar coz bracket ke bhar
            // java 0 + 1 ko as a string display kari thi
        }

    }
}

public class skip_negative {
    public static void main(String[] args) {

        //Create a program that keeps track of the highest and lowest values in an array:
        int arr []= {1,-2, -5 , 6 ,7 ,-9 ,0,11,14,-15 };
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]<0){
                continue;
            }
            else if (arr[i]==0) {
                break;

            }
            System.out.println(arr[i]);
        }
    }
}

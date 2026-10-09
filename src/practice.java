public class practice {
    public static void main(String[] args) {
        int arr[] = {12,32,26,76,87};
        // array ke elements ko multil=ply karna aur ans print karna
        int multi = 1;
        for (int i =0 ; i < arr.length; i++){
            multi = multi * arr[i] ;
        }
        System.out.println(multi);

    }
}

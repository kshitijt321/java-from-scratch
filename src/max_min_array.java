public class max_min_array {
    public static void main(String[] args) {
        int arr[] = {10,20,25,30,35 , 12 ,9};
        int maxELement = arr[0];
         for(int i = 0 ; i<arr.length; i++){
            if(maxELement<arr[i]){
                maxELement = arr[i];// 10 se bada milne pe update karwana
            }
             System.out.println(maxELement); // loop ke andar chalaya coz its good for uderstaing dry run
        }

         int minimumElement = arr[0];
         for(int i = 0 ; i < arr.length; i++){
             if(minimumElement>arr[i]){ // arr[0] yani 10 se chota millene pe update karwana
                 minimumElement= arr[i];

             }
             System.out.println(minimumElement);
         }
    }
}

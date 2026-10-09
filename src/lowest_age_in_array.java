public class lowest_age_in_array {
    public static void main(String[] args) {
        int ages [] = {12, 34,32,14,56,11,9, 76};
        int lowestAge = ages[0];//man liya 0 index pe lowest age he
        for(int age : ages ){
            if(lowestAge>age ) { // agr lowest age se choti koi age mill jaye to
                // usse lowest age me update kardo
                lowestAge = age;
            }



        }
        System.out.println(lowestAge);
    }
}

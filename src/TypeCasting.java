public class TypeCasting {
    public static void main(String[] args) {
                 //TYPE CASTING
        //Type casting means converting one data type into another. For example,
        // turning an int into a double.
            // Widening Casting = chote se bade data type me
        int num = 67;
        double byu = num ;
        System.out.println(num);
        System.out.println(byu);
            //Narrowing Casting = bade se chote
        double numm = 56.89;
        int bum = (int)numm;
        System.out.println(numm);
        System.out.println(bum);//data loss

        double i  = 0.687;
        int n = (int)i;
        double  j = i-n; // isse double me store kiya coz 66.66 - 66 = 0.66 ek double he
        if(j==0){
            System.out.println(" an integer "+j);
        }
        else{
            System.out.println("not an integer ");
        }


    }
}

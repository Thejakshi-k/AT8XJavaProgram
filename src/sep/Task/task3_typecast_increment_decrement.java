package sep.Task;

public class task3_typecast_increment_decrement {
    public static void main(String[] args) {

        // 1. Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
        // Ans : widening
        byte a = 5;
        int b=a; // Implicit
        int c= (int)a;

        // Ans : Narrowing
        int gold_price= 500;
        double tax=10.5;
        double totallbill= gold_price + tax; // Implicit
        double totalbill= gold_price + (int)tax;//explicit loss of data


        //2.int a = 10;
        //System.out.println(  --a + a --  + a-); System.out.println(a);
        //Ans: 26,7


        //3.int a = 10;
        //System.out.println(  --a + a++ + a—); System.out.println(a);
        //Ans: 28,9

        //4.int a = 10;
        //System.out.println(  a- - + a --  + a --); System.out.println(a);
        //Ans: 27,7







    }
}

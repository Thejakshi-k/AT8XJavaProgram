
//By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
package sep.Task;
import java.lang.Math;

public class task4_ternary_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c= 45;
       // int max1= (a > b)? a : b;
       // int max2=  (max1 > c)? max1 : c;
        int max= ((a>b ? a:b))>c ? ((a>b ? a:b)) : c ;
        System.out.println(max);

    }
}

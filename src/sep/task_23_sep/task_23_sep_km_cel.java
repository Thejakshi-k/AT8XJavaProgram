package sep.task_23_sep;
import java.util.Scanner;

public class task_23_sep_km_cel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option(1 for km to m and 2 C to F)");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Enter the km");
                double km=sc.nextDouble();
                double output1=km * 0.621371;
                System.out.println("Km to miles is"+output1);
                break;
            case 2:
                System.out.println("Enter the Celsius");
                double cel=sc.nextDouble();
                double output2=((cel*9/5)+32);
                System.out.println("Celsius to Fahrenheit is"+output2);
                break;
            default:
                System.out.println("None");
                break;

        }
    }
}

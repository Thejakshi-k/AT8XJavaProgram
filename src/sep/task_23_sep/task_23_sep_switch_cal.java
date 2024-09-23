package sep.task_23_sep;
import java.util.Scanner;

public class task_23_sep_switch_cal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number one");
        double num1 = sc.nextDouble();
        System.out.println("Enter the number two");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator you want to perform");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+': double add= num1+num2;
                     System.out.println("Output is"+add);
                     break;
            case '-': double sub= num1-num2;
                System.out.println("Output is"+sub);
                break;
            case '*': double mul= num1*num2;
                System.out.println("Output is"+mul);
                break;
            case '/': double div= num1/num2;
                System.out.println("Output is"+div);
                break;
            case '%': double mod= num1%num2;
                System.out.println("Output is"+mod);
                break;
            default: System.out.println("Undefined");
                break;
        }


    }
}

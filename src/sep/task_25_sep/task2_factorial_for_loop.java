package sep.task_25_sep;
import java.util.Scanner;
public class task2_factorial_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        long f=1;
        for(int i=1;i<=num;i++){
            f=f*i;

        }
        System.out.println("Factorial of\t"+num+"\tis\t"+f);

    }
}

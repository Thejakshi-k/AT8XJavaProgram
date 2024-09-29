package sep.task_25_sep;
import java.util.Scanner;
public class task1_for_loop_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table you want to print");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
          //  System.out.printf("%d * %d = %d \n",num,i,num*i);
            System.out.println(num+"*"+i+"="+num*i);
        }

    }
}

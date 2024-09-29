package sep.task_27_sep;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        System.out.println("First 5 even number is");
      int i=0;
      int j=0;
        do {
           j=i+2;
           System.out.println(j);
           i=j;
        } while (i < 10);


    }
}

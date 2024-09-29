package sep.task_25_sep;
import java.util.Scanner;
public class task3_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int vcount=0;
        int ccount=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ){
                vcount++;
            } else {
                ccount++;
            }
        }
            System.out.println("Vovewls count :"+vcount);
            System.out.println("Conconent count :"+ccount);



    }
}

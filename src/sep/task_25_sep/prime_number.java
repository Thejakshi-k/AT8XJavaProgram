package sep.task_25_sep;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Prime numbers");
        int i=2;
        for(i=2;i<=100;i++){
            if((i%1==0) && (i%i==0)){
                System.out.println(i);
            }

        }
    }
}

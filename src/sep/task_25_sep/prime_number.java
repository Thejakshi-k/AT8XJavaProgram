package sep.task_25_sep;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Prime numbers");
        int i=2;
        int j;

        for(i=2;i<=100;i++){
            int count = 0;
            for(j=1; j<=i ;j++)
            {
              if((i%j==0)) {
                count++;
              }

            }
            if (count==2){
                System.out.println(i);
            }
        }
    }
}

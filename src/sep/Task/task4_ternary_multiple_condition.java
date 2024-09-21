package sep.Task;

public class task4_ternary_multiple_condition {
    public static void main(String[] args) {
        int score=85;
        if (score>=90){
            System.out.println("A");
        }
        else if(score>=80 && score<=89){
            System.out.println("B");
        }
        else if(score>=70 && score<=79){
            System.out.println("C");
        }
    }
}

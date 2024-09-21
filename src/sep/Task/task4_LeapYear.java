package sep.Task;

public class task4_LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        if ((year % 400 == 0)) {
            System.out.println("Leap year");
        } else if ((year % 100 == 0)) {
            System.out.println("Not a Leap year");
        }
        else if ((year % 4 == 0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}

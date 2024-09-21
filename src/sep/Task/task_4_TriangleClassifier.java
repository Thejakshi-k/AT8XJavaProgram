package sep.Task;

public class task_4_TriangleClassifier {
    public static void main(String[] args) {
        int sidea=5;
        int sideb=5;
        int sidec=3;
        if((sidea==sideb) && (sideb==sidec) && (sidec==sidea)) {
            System.out.println("Equilatral Triangle");
        }
            else if((sidea==sideb) || (sideb==sidec) || (sidec==sidea)){
            System.out.println("Isosceles Triangle(two sides are equal) ");
            }
        else if((sidea!=sideb) && (sideb!=sidec) && (sidec!=sidea)){
            System.out.println("scalene (sides not equal) ");
        }

    }
}

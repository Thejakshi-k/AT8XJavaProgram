package oct.task_02_oct;

public class task_3_ceate_object {
    public static void main(String[] args) {
        //3.Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
        task_3_create_class.ATBStudent std1= new task_3_create_class.ATBStudent();
        std1.stdId=111;
        std1.name="AAA";
        std1.course="ABC";

        task_3_create_class.ATBStudent std2= new task_3_create_class.ATBStudent();
        std2.stdId=222;
        std2.name="BBB";
        std2.course="ABCD";

        task_3_create_class.ATBStudent std3= new task_3_create_class.ATBStudent();
        std3.stdId=333;
        std3.name="CCC";
        std3.course="ABCDE";

        task_3_create_class.ATBStudent std4= new task_3_create_class.ATBStudent();
        std4.stdId=444;
        std4.name="DDD";
        std4.course="ABCDEF";

        task_3_create_class.ATBStudent std5= new task_3_create_class.ATBStudent();
        std5.stdId=111;
        std5.name="EEE";
        std5.course="ABC";

        std1.displayDetails();
        std2.displayDetails();
        std3.displayDetails();
        std4.displayDetails();
        std5.displayDetails();
    }
}

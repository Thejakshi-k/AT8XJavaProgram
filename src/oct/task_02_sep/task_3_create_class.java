package oct.task_02_sep;

public class task_3_create_class {
    public static class ATBStudent{
        int stdId;
        String name;
        String course;

        public void displayDetails(){
            System.out.println("Student ID:"+stdId);
            System.out.println("Student name:"+name);
            System.out.println("Course:"+course);
        }
    }
}

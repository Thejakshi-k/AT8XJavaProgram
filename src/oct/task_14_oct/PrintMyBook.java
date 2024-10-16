package oct.task_14_oct;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override


     public void getDetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Author name:"+author);
        System.out.println("Price:"+price);

    }

}

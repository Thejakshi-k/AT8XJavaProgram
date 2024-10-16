package oct.task_11_oct;

public class BaseTestApi {
    private  String name;
    private  int id;

    BaseTestApi(){
        System.out.println("DC - BaseClass");
    }

    BaseTestApi(String name){
        System.out.println("PC - BaseClass");
    }

    public String performGET() {
        return name;
    }

    public void performPOST(){
        System.out.println("Post created");

    }

    public void performPOST(int id){
        System.out.println("Post created with id" +id);

    }

    public void performPATCH(int id,boolean isAuth)
    {
        if(isAuth){
            this.id=id;
            System.out.println("Id updated"+id);
        }else {
            System.out.println("Not allowed");
        }

    }

    public void performPUT(int id)
    {

        System.out.println(id+":Updated");

    }


    public void performDELETE(int id)
    {

            System.out.println(id+":Deleted");

    }



}

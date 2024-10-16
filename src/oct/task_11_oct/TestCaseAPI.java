package oct.task_11_oct;

public class TestCaseAPI extends BaseTestApi {

    TestCaseAPI(){
        super();

    }

    @Override
    public void performPATCH(int id, boolean isAuth) {
        System.out.println("This is method overloading id is:"+id);
    }
}

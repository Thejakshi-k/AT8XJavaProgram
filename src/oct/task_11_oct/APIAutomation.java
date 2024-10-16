package oct.task_11_oct;

public class APIAutomation {
    public static void main(String[] args) {
    BaseTestApi b1=new BaseTestApi();
    b1.performPATCH(111,true);
    TestCaseAPI tc=new TestCaseAPI();
    tc.performPATCH(222,true);
    BaseTestApi b2= new TestCaseAPI();
    b2.performPUT(123);

    }

}

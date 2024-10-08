package oct.task_04_oct;
import oct.task_04_oct.task_1_constructor_DC_PC.Person;
public class task_1_object_create {
    public static void main(String[] args) {
        //default constuctor
        Person mePerson=new Person();
        //call methods using object
        mePerson.notPerson();

        //parameterized
        Person myAttribute=new Person("theju",2,2,20,50,60);
        System.out.println(myAttribute.name);
        System.out.println(myAttribute.hands);
        System.out.println(myAttribute.legs);
        System.out.println(myAttribute.age);
        System.out.println(myAttribute.height);
        System.out.println(myAttribute.weight);
        //call methods using object
        String skinColor=myAttribute.personColor("white");
        System.out.println(skinColor);

        Person myName=new Person("theju");
        System.out.println(myAttribute.name);


        Person myHandLeg=new Person("theju",2,2);
        System.out.println(myAttribute.name);
        System.out.println(myAttribute.hands);
        System.out.println(myAttribute.legs);


        Person myAge=new Person("theju",20);
        System.out.println(myAttribute.name);
        System.out.println(myAttribute.age);
        //call methods using object
        int age=myAge.personAge();
        System.out.println("age is"+age);





//        Person myName=new Person("theju");
//        System.out.println("Person name is"+myName.name);


    }
}

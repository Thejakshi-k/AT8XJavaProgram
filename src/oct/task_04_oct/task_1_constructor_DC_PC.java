package oct.task_04_oct;

public class task_1_constructor_DC_PC {
    public static class Person {
        String name;
        int age;
        int legs;
        int hands;
        int height;
        int weight;
        String skinColor;
        String eyeColor;
        String hairColor;
        long aadhaar_no;

        // Default constructor
        Person() {
            System.out.println("Im a person");
        }

        //Parameterized Constructor
        Person(String name,int legs,int hands,int age,int height,int weight) {
            System.out.println("Im a person with all atributes");
            this.name=name;
            this.legs=legs;
            this.hands=hands;
            this.age=age;
            this.height=height;
            this.height=height;

        }

        // parameterized constructor only name
        Person(String name){
            System.out.println("Person with Name");
            this.name=name;

        }

        // parameterized constructor name, legs , hands
        Person(String name,int legs, int hands) {
            System.out.println("Im a person with legs and hands");
            this.legs=legs;
            this.hands=hands;

        }
        Person(String name,int age) {
            System.out.println("Im a person with age");
//            this.legs=legs;
//            this.hands=hands;
            this.age=age;

        }

        // No return type, no arguements


        void notPerson(){
            System.out.println("Im not a person");
        }
        // with return type, no arguements
        int personAge(){
            System.out.println("Im a 20 year old person");
            return 20;
        }

        // with return type and arguement
        String personColor(String skinColor){
            this.skinColor=skinColor;
            return "Iam"+ skinColor +" person";
        }

    }
}

package P10;

public class Human {
    String name;
    int age;
    //constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        // INSTANCE object
        Human Earn = new Human("thidatip", 20);

//        Human Earn = new Human();
//        Earn.name = "thidatip";
//        Earn.age = 20;

        System.out.println("Human name is "+ Earn.name);
        System.out.println("Human age is "+ Earn.age);
    }

}

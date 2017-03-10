package JA_11_OOP.static_non_static;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class Person {
    private String name;
    private  int age;
    private static int count;


    {
        System.out.println("Load non static block!");
        count++;
    }

    static {
        System.out.println("static block load");
        count = 0;
    }

    static void printInfoAboutClass(){
        System.out.println("Class person;");
        System.out.println("fields: name, age;");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor load!");
        //calls once before every constructor
    }
    public Person(){
        this("no name", 12); //this(...) - constructor of my class
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

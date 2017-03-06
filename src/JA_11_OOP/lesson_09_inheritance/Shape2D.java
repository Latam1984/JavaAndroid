package JA_11_OOP.lesson_09_inheritance;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Shape2D extends Shape {
    private String name;

    public Shape2D(String name, String color){
        super(color);//проинициализировать поле color
                    //- вызов конструктора Shape(color)
        this.name = name;

    }

//    public Shape2D(){
//        super("no color");
//        this.name = "no name";
//    }

    public Shape2D(){
        this("no name", "no color");
    }

    public String getName() {
        return name;
    }
}

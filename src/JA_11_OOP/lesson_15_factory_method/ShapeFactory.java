package JA_11_OOP.lesson_15_factory_method;

import JA_11_OOP.lesson_09_inheritance.Circle;
import JA_11_OOP.lesson_09_inheritance.les_09_inheritance.Triangle;

/**
 * Created by Aleksey on 17.03.2017.
 */
public class ShapeFactory {
    static Circle getShape(int...a){
        int len = a.length;
        if(len == 1)return new Circle("", a[0]);

       // if(len == 3)return new Triangle("", a[0], a[1], a[2]);

        return null;
    }

}

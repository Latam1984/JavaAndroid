package JA_11_OOP.lesson_14_enum;

/**
 * Created by Aleksey on 16.03.2017.
 */
public enum Season {
    //public static final Season*/ WINTER, /*= new Season("WINTER");*/
    WINTER, SPRING, SUMMER, AUTUMN;


    @Override
    public String toString() {
        //return super.toString();
        return "(" + this.name()+")";
    }
}

package JA_11_OOP.scope_modificators.other_pack;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        //new A().defaultField
        //no access from other package
    //    new A().protectedMethod;
        new D().protectedMethod();
        //ok. class D has protected method
        //
    }
}

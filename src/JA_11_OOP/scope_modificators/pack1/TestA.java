package JA_11_OOP.scope_modificators.pack1;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class TestA {
    public static void main(String[] args) {

    }
    void m (){
        System.out.println(new A().defaultField);

        new A().protectedMethod();
    }


}

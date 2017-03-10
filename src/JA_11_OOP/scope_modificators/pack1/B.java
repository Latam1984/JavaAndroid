package JA_11_OOP.scope_modificators.pack1;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class B extends A{
    void m (){
        System.out.println(this.defaultField);
        //extended class the same package
        this.protectedMethod();
    }
}

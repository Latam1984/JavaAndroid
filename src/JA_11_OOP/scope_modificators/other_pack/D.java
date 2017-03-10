package JA_11_OOP.scope_modificators.other_pack;

import JA_11_OOP.scope_modificators.pack1.A;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class D extends A {

    void m(){
       // this.defaultField;
        //do not have access to other package

    }
    void m2 (){
        this.protectedMethod();
        //other package, BUT D extends A! - ok
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}

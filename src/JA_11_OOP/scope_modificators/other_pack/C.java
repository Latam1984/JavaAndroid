package JA_11_OOP.scope_modificators.other_pack;

import JA_11_OOP.scope_modificators.pack1.A;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class C extends A {
    void m() {
        //  this.defaultField;
        // no access from other package
    }
}


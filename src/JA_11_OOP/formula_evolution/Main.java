package JA_11_OOP.formula_evolution;

/**
 * Created by Aleksey on 17.03.2017.
 */
//grathic x*x on interval -10..10
public class Main {
    public static void main(String[] args) {
//        int x1 = -10;
//        int x2 = 10;
//        for (int i = x1; i < x2; i++) {
//            System.out.println(i * i);
//        }


        //buildGraph(-10, 10);
        Graph graph = new Graph(-10, 10);
        graph.build(new Formula());

        //graph x*x*x version1
        graph.build(new Formula());

        //=======================================
        //graph x*x*x version2
        Formula f3 = new Formula() {//anonymous class extends formula
            @Override
            public int calculate(int x) {
                return x * x * x;
            }
        };
        graph.build(f3);


        //========================================
        //graph x*x*x version3
        //anonymous class implements IFormula
        IFormula f4 = new IFormula() {
            @Override
            public int calculate(int x) {
                return x * x * x;
            }
        };
        graph.build(f4);


        //========================================
        //graph x*x*x*x version4
        //pure lambda(but it is backed by IFormula!!!)

        graph.build(x -> x * x * x * x);

    }

//    static void buildGraph(int x1, int x2) {
//        for (int i = x1; i < x2; i++) {
//            System.out.println(i * i + " ");
//        }
//    }

}

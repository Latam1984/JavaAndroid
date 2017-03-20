package JA_11_OOP.formula_evolution;

/**
 * Created by Aleksey on 17.03.2017.
 */
public class Graph {
    private int x1;
    private int x2;

    public void build(Formula f) {
        for (int i = x1; i < x2; i++) {
            int y = f.calculate(i);
            System.out.println(y + " ");
        }
        System.out.println();
    }

    public void build(IFormula f) {
        for (int i = x1; i < x2; i++) {
            int y = f.calculate(i);
            System.out.println(y + " ");
        }
        System.out.println();
    }

    public Graph(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}

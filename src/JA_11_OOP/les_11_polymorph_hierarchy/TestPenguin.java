package JA_11_OOP.les_11_polymorph_hierarchy;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class TestPenguin {
    public static void main(String[] args) {
        Bird[] birds = new Bird[2];
        birds[0] = new Duck("King", 2, 1, true);
        birds[1] = new Penguin("Duffy", 5, 1, 2);
        makeAllFly(birds);

        Swim [] swimmers = new Swim[2];
        swimmers[0] = (Penguin)birds[1];
        swimmers[1] = (Swim) new Shark("Target", 6, true,1001);

   // makeAllSwims(swimmers);
    }

    public static void makeAllFly(Bird[] birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }

    public static void makeAllFly(Swim[] swimmers) {
        for (Swim swimmer : swimmers) {
            swimmer.swim();
        }
    }
}

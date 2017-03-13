package JA_11_OOP.les_11_polymorph_hierarchy;

public class TestAnimal {
    public static void main(String[] args) {
        Fish[] fishs = new Fish[2];
        Bird[] birds = new Bird[2];
        Animal[] animals = new Animal[4];
        //polymorphism 1
        fishs[0] = new Shark("Tiger",50,false,1000);
        fishs[1] = new Pike("Scshuka",10,true,true);

        birds[0] = new Duck("Duffy",5,1,true);
        birds[1] = new Eagle("White",20,6,true);
        //polymorphism 2
        animals[0] = fishs[0];
        animals[1] = fishs[1];
        animals[2] = birds[0];
        animals[3] = birds[1];
        makeAllSwim(fishs);
        makeAllSwim(animals);
    }
    //var 1
    static void makeAllSwim(Animal [] animals){
        for (Animal animal : animals) {
            if (animal instanceof Fish){
                ((Fish) animal).swim();
            }
        }
    }
    static void makeAllSwim(Fish [] fishs){  //var 2 - ok!
        for (Fish fish : fishs) {
            fish.swim();
        }
    }
}

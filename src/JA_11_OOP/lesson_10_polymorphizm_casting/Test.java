package JA_11_OOP.lesson_10_polymorphizm_casting;

import java.util.Arrays;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        Worker [] workers = new Worker[5];
        workers [0] = new Worker("Alex", 3200);
        workers [1] = new Manager("Andrey", 2200, 1200);
        workers [2] = new Manager("Anton", 6200, 1500);
        workers [3] = new Manager("Sergey", 4200, 1000);
        workers [3] = new Manager("Sasha", 5200, 6000);

       // System.out.println(Arrays.toString(workers));
        System.out.println("Bonus = " + averageBonus(workers));
        System.out.println("Salary = " + averageSalary(workers));


    }
    static double averageSalary (Worker [] workers){
        int sum = 0;
        for (Worker worker : workers) {
             sum += worker.getSalary();
        }
        return sum/workers.length;
    }


    static double averageBonus (Worker [] workers){
        double sum = 0;
        int count = 0;
        for (Worker worker : workers) {
            //sum += ((Manager)worker).getBonus();

            if (worker instanceof Manager) { //"является"
                Manager tmp = (Manager) worker;//downcasting
                sum += tmp.getBonus();
                count++;
            }
        }
        return sum/count;
    }
}

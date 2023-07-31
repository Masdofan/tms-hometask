package HT1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Petya", "G", 2);

        Worker worker1 = new Worker("Zhenya", "A.", 3);

        Worker worker2 = new Worker("Gleb", "U.", 1);

        Director director = new Director("Vanya", "C.", 5);

        System.out.println(worker.toString());

        System.out.println(worker1.toString());

        System.out.println(worker2.toString());

        System.out.println(director.toString());

        director.addEmployee(worker);

        director.addEmployee(worker1);

        System.out.println(director.toString());

        Director director1 = new Director("Egor", "V.", 10);

        director1.addEmployee(worker2);

        director.addEmployee(director1);

        System.out.println(director.toString());

        FindWorkerService findWorkerService = new FindWorkerService();

        System.out.println(findWorkerService.findWorker(director, "Gleb"));


    }

}

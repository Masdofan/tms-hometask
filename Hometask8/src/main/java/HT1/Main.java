package HT1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Петя", "Г.", 2);

        Worker worker1 = new Worker("Вася", "А.", 3);

        Worker worker2 = new Worker("Глеб", "Ю.", 1);

        Director director = new Director("Ваня", "Ц.", 5);

        System.out.println(worker.toString());

        System.out.println(worker1.toString());

        System.out.println(worker2.toString());

        System.out.println(director.toString());

        director.addEmployee(worker);

        director.addEmployee(worker2);

        System.out.println(director.toString());

        Director director1 = new Director("Егор", "В.", 10);

        director1.addEmployee(worker2);

        director.addEmployee(director1);

        System.out.println(director.toString());


    }

}

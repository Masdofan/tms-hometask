package HT1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Worker("Петя", "А.", 10, Post.Worker);

        Employee employee = new Director("Ваня", "Г.", 5, Post.Director);

        Director director = new Director("Ваня", "Г.", 5, Post.Director);

        director.addEmployee(employee1);

        director.employeesList();



    }

}

package HT2;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        director.printPost();

        Worker worker = new Worker();

        worker.printPost();

        accountant accountant = new accountant();

        accountant.printPost();
    }
}

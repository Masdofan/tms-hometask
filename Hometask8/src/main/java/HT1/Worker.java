package HT1;

public class Worker extends Employee{

    public Worker(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    @Override
    public Post getPost() {
        return Post.Worker;
    }
}

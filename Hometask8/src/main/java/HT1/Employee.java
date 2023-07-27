package HT1;

public abstract class Employee {

    String name;
    String secondName;
    int experience;

    int baseBet = 1000;

    public Employee(String name, String secondName, int experience) {
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
    }



    private int salary() {
        return baseBet * post.getRatio() * experience;
    }



}

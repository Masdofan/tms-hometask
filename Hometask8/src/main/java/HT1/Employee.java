package HT1;

public abstract class Employee {

    String name;
    String secondName;
    int experience;

    int baseBet = 1000;

    public abstract Post getPost();

    public Employee(String name, String secondName, int experience) {
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
    }



    public int getSalary() {
        return baseBet * getPost().getRatio() * experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public String getName() {
        return name;
    }
}

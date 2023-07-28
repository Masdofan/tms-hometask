package HT1;

import java.util.Arrays;

public class Director extends Employee {

    @Override
    public Post getPost() {
        return Post.Director;
    }

    public Director(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    Employee[] employees = new Employee[5];

    public String getEmployeesList() {
        String employessListTxt = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employessListTxt = employessListTxt + " " + employees[i].toString();

            }
        } return employessListTxt;
    }

    public void addEmployee(Worker worker) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = worker;
                break;
            }
        }
    }

    public void addEmployee(Director director) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = director;
                break;

            }
        }

    }

    @Override
    public int getSalary() {
        int countOfEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countOfEmployee++;
            }
        } return countOfEmployee;
        return super.getSalary() + (100 * getCountOfEmployee);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", employeeList=" + "[" + getEmployeesList() + "]" +
                '}';
    }

    public int getCountOfEmployee() {
        int countOfEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countOfEmployee++;
            }
        } return countOfEmployee;
    }

}




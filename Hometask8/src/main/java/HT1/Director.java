package HT1;

import java.util.Arrays;

public class Director extends Employee {

    public Director(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    Employee[] employees = new Employee[20];

    public void employeesList() {
        System.out.println(Arrays.toString(employees));
    }

    public void addEmployee(Employee employee) {

        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employee == null) {
                employees[i] = employee;
                break;
            }
        }

//    private int salary() {
//        return baseBet * post.getRatio() * experience * 2;
//    }

    }
}

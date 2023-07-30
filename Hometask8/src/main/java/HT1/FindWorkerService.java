package HT1;

public class FindWorkerService {

    public boolean findWorker(Director director, String workerName) {
        for (Employee employee : director.employees) {
                if (employee != null) {
                    if (employee.getName().equals(workerName)) {
                        return true;

                    }
                }
        }

        for (Employee employee : director.employees) {
            if ( employee != null) {
                    Post post = employee.getPost();
                    if (post == Post.Director) {
                        return findWorker((Director) employee, workerName);
                    }

            }
        }
        return false;
    }


}

import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Jan", 4500, 1);
        Worker worker2 = new Worker("Alicja", 4700, 2);
        Worker worker3 = new Worker("Bartosz", 4600, 3);
        Worker worker4 = new Worker("Diana", 5000, 4);

        Manager manager = new Manager("Ewa", 8000, 5);
        
        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + "'s salary is: " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + "'s salary is: " + manager.getSalary());
        manager.work();
    }
}

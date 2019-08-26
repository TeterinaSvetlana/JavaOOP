package BankWorkers;

public class Worker extends Human {

    public Worker() {}

    public Worker(String fio, int age, int salary) {
        super(fio, age);
        this.salary = salary;
    }

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Salary:"+salary);
    }

    @Override
    public String toString() {
        return super.toString() + " Salary" + salary;
    }
}

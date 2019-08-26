package BankWorkers.Bookkeeping;

import BankWorkers.Worker;

public class Accountant extends Worker {

    public Accountant() {}

    public Accountant(String fio, int age, int salary, int computer) {
        super(fio, age, salary);
        this.computer = computer;
    }

    private int computer;

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return super.toString() + " Computer №"+computer;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Computer:" + computer);
    }
}

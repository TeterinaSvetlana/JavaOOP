package BankWorkers.Heads;

import BankWorkers.Worker;

public class Director extends Worker {

    public Director() {}

    public Director(String fio, int age, int salary, String car) {
        super(fio, age, salary);
        this.car = car;
    }

    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Car:" + car);
    }

    @Override
    public String toString() {
        return super.toString() + " Car:" + car;
    }
}

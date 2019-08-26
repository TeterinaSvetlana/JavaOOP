package BankWorkers.Bookkeeping;

import java.util.ArrayList;
import java.util.List;

public class HeadAccountant extends Accountant {

    private List<Accountant> subordinates;

    public HeadAccountant() {}

    public HeadAccountant(String fio, int age, int salary, int computer) {
        super(fio, age, salary, computer);
        subordinates = new ArrayList<Accountant>();
    }

    public List<Accountant> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Accountant> subordinates) {
        this.subordinates = subordinates;
    }

    public boolean AddSubordinates(Accountant accountant)
    {
        return subordinates.add(accountant);
    }

    public boolean RemoveSubordinates(Accountant accountant)
    {
        return subordinates.remove(accountant);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void print() {
        super.print();
    }
}

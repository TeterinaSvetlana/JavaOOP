package BankWorkers;

public class Client extends Human {

    protected Client() {}

    protected Client(String fio, int age, boolean isRegular) {
        super(fio, age);
        this.isRegular = isRegular;
    }

    private boolean isRegular;

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Regular:" + isRegular);
    }

    @Override
    public String toString() {
        return super.toString() + " Regular:" + isRegular;
    }
}

package BankWorkers;

public abstract class Human implements Printable {
    private String FIO;
    private int age;

    public Human()
    {

    }

    protected Human(String fio, int age) {
        FIO = fio;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public void print() {
        String str = getFIO()+" Age:"+getAge();
        System.out.print(str);
    }

    @Override
    public String toString() {
        return getFIO()+" Age:"+getAge();
    }
}

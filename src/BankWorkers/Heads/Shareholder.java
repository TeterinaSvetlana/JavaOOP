package BankWorkers.Heads;

import BankWorkers.Human;

public class Shareholder extends Human {

   public Shareholder(String fio, int age, int shares)
   {
       super(fio, age);
       this.shares = shares;
   }

   private int shares;

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Shares:" + shares);
    }

    @Override
    public String toString() {
        return super.toString() + " Shares:" + shares;
    }
}

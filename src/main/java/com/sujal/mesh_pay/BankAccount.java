package com.sujal.mesh_pay;

public class BankAccount {
    String accountHolder;
    double balance;
    public BankAccount(String name, double money){
        this.accountHolder = name;
        this.balance = money;
    }

    public void credit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " credited.");
            System.out.println("Account Balance: Rs " + balance);
        }
    }

    public void debit(double amount){
        if(balance < amount){
            System.out.println("Insufficient funds.");
        }
        else{
            balance -= amount;
            System.out.println("Rs " + amount + " debited.");
            System.out.println("Account Balance: Rs " + balance);
        }
    }

    public void displayBalance(){
        System.out.println("Account Balance: Rs " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sujal", 25000.0);

        acc.debit(30000);
        acc.credit(2000);
        acc.debit(10000);
        acc.displayBalance();
    }
}

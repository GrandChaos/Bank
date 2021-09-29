package bank.domain;

import java.util.Date;

public class BankAccount {

    private int number;
    private Date date;
    private int balance;

    private Client client;


    public BankAccount() {
    }

    public BankAccount(int number, Date date, int balance, Client client) {
        this.number = number;
        this.date = date;
        this.balance = balance;
        this.client = client;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

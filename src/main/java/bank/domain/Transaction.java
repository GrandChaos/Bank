package bank.domain;

import java.util.Date;

public class Transaction {

    private int id;
    private int amount;
    private Date date;

    private BankAccount debitingAccount;
    private BankAccount creditingAccount;


    public Transaction() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BankAccount getDebitingAccount() {
        return debitingAccount;
    }

    public void setDebitingAccount(BankAccount debitingAccount) {
        this.debitingAccount = debitingAccount;
    }

    public BankAccount getCreditingAccount() {
        return creditingAccount;
    }

    public void setCreditingAccount(BankAccount creditingAccount) {
        this.creditingAccount = creditingAccount;
    }
}

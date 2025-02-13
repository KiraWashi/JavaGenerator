package generate;

import java.util.*;

public class Account implements generate.IOperations {

    private int id;
    private int overdraft;
    private int balance;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getOverdraft() {
        return overdraft;
    }
    
    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void whitdraw(int val) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deposit(int val) {
        // TODO Auto-generated method stub
    }
}

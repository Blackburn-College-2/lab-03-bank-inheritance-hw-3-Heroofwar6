/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.ArrayList;

/**
 *
 * @author cameron.shinall
 */
public class Account {
    Money balance;
    ArrayList<Money> history = new ArrayList<>();
    
    public Account(Money balance){
        this.balance = balance;
        history.add(balance);
    }
    public void withdraw(Money m){
        history.add(balance.subtract(m));
    }
    public void deposit(Money m){
        balance.add(m);
    }
    public Money getBalance(){
        return balance;
    }
}
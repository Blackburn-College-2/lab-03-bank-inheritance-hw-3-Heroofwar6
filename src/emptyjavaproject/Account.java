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
        history.add(m);
        Money money = new Money(m.getCurrency(), -1 * m.getAmount());
        balance.subtract(money);
        
    }
    public void deposit(Money m){
        history.add(m);
        balance.add(m);
    }
    public Money getBalance(){
        return balance;
    }
    
    @Override
    public String toString(){
        return balance.toString();
    }
    public String printHistory(){
        String print = "";
        for (int i = 0; i < history.size(); i++) {
           Money moneyCurrent =  history.get(i);
           if(moneyCurrent.getAmount()<0){
               print += "Withdraw amount " 
                       + history.get(i).toString() + "\n";
           }else if(moneyCurrent.getAmount()>0){
               print += "Deposit amount " + history.get(i).toString() + "\n";
           }
        }
        return print;
    }
}
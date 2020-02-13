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
public abstract class Account {

    Money balance;
    double initialBalance;
    ArrayList<Money> history = new ArrayList<>();

    /**
     *
     * @param balance the money used in the account
     */
    public Account(Money balance) {
        this.balance = balance;
        history.add(balance);
        this.initialBalance = this.balance.getAmount();
    }

    /**
     *
     * @param m the money withdrawn from the account
     */
    public void withdraw(Money m) {
        history.add(m);
        Money money = new Money(m.getCurrency(), -1 * m.getAmount());
        balance.subtract(money);
    }

    /**
     *
     * @param m the money deposited to the account
     */
    public void deposit(Money m) {
        history.add(m);
        balance.add(m);
    }

    /**
     *
     * @return the balance in the account
     */
    public Money getBalance() {
        return balance;
    }

    /**
     *
     * @return the string value of the balance
     */
    @Override
    public String toString() {
        return balance.toString();
    }

    /**
     *
     * @return the entire history of changes to the account
     */
    public String printHistory() {
        String print = "";
        double change = initialBalance;
        for (int i = 1; i < history.size(); i++) {
            Money moneyCurrent = history.get(i);
            if (moneyCurrent.getAmount() > 2 || moneyCurrent.getAmount() < -2) {
                change += moneyCurrent.getAmount();
            }
            if (moneyCurrent.getAmount() < 2 && moneyCurrent.getAmount() > -2) {
                print += moneyCurrent.getAmount() + "% intrest \n";
                change += history.get(i + 1).getAmount();
                print += "Balance " + balance.getCurrency().getSymbol()
                        + change + "\n";
                i++;
            } else if (moneyCurrent.getAmount() < 0) {
                print += "Withdraw amount "
                        + history.get(i).toString() + "\n"
                        + "Balance " + balance.getCurrency().getSymbol()
                        + change + "\n";
            } else if (moneyCurrent.getAmount() > 0) {
                print += "Deposit amount " + history.get(i).toString() + "\n"
                        + "Balance " + balance.getCurrency().getSymbol()
                        + change + "\n";
            }
        }
        return print;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author krigsdator
 */
public class SavingsAccount extends Account {

    Money addedAmount = new Money(this.balance.getCurrency(), 0.0);
    Money intrestRate;

    /**
     *
     * @param m the money used in the account
     * @param intrestRate the interest rate for the account
     */
    public SavingsAccount(Money m, Money intrestRate) {
        super(m);
        this.intrestRate = intrestRate;
        this.amountAdded();
    }

    /**
     *
     * @return returns the interest rate amount
     */
    public double getIntrestRate() {
        return this.intrestRate.getAmount();
    }

    /**
     *
     * @param interestRate to change the interest rate
     */
    public void setIntrestRate(Money interestRate) {
        this.intrestRate = interestRate;
    }

    /**
     * this method declares the amount of money added with interest
     */
    public void amountAdded() {
        history.add(intrestRate);
        addedAmount.multiply(intrestRate, balance);
        history.add(addedAmount);
    }

    /**
     * anytime there is a withdraw to the account this will effect the balance
     */
    public void accrue() {
        history.add(intrestRate);
        history.add(addedAmount);
        balance.add(addedAmount);
    }

    /**
     *
     * @param m money withdrawn from the account
     */
    @Override
    public void withdraw(Money m) {
        history.add(m);
        Money money = new Money(m.getCurrency(), -1 * m.getAmount());
        balance.subtract(money);
        this.accrue();
    }

    /**
     *
     * @param m money deposited into the account
     */
    @Override
    public void deposit(Money m) {
        history.add(m);
        balance.add(m);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author cameron.shinall
 */
public class Money {

    private Currency currency;
    private double amount;

    /**
     *
     * @return the amount of moneys
     */
    public double getAmount() {
        return amount;
    }

    /**
     *
     * @param currency to check the type of currency
     * @param amount the amount of money
     */
    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    /**
     *
     * @param input the initial balance
     * @param output the interest rate
     * @return the amount of money added to the balance as interest
     */
    public Money multiply(Money balance, Money input) {
        this.amount = Math.round(input.amount * balance.amount);
        return input;
    }

    /**
     *
     * @return to return the symbol of currency for the given money
     */
    public String getAmountString() {
        return currency.getSymbol();
    }

    /**
     *
     * @param input the given money to add to the amount
     * @return the change in money
     */
    public Money add(Money input) {
        if (this.currency.equals(input.getCurrency())) {
            this.amount = this.amount + input.amount;
            return this;
        } else {
            return null;
        }
    }

    /**
     *
     * @return the type of currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     *
     * @param input the money used to subtract from the amount
     * @return the new amount
     */
    public Money subtract(Money input) {
        if (this.currency.equals(input.getCurrency())) {
            this.amount = this.amount - input.amount;
            return this;
        } else {
            return null;
        }
    }

    /**
     *
     * @return to return strings such as $100.0
     */
    @Override
    public String toString() {
        return this.currency.getSymbol() + this.amount;
    }
}

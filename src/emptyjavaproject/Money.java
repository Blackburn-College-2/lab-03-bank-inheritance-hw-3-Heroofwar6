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

    Currency currency;
    double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getAmountString() {
        return currency.symbol;
    }

    public Money add(Money input) {
        return null;
    }

    public Money subtract(Money input) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

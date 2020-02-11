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

    public double getAmount() {
        return amount;
    }

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getAmountString() {
        return currency.getSymbol();
    }

    public Money add(Money input) {
        if(this.currency.equals(input.getCurrency())){
            this.amount = this.amount + input.amount;
            return this;
        }else {
            return null;
        }
    }
    public Currency getCurrency(){
        return currency;
    }
    public Money subtract(Money input) {
        if(this.currency.equals(input.getCurrency())){
            this.amount = this.amount - input.amount;
            return this;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.amount + this.currency.getSymbol();
    }
}

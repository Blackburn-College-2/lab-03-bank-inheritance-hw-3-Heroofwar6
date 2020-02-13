/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Currency currency = new Currency("Dollars", "$");
        Money money = new Money(currency, 1000.00);
        Money interestRate = new Money(currency, 0.25);
        SavingsAccount sAccount = new SavingsAccount(money, interestRate);
        System.out.println("Initial Balance " + sAccount.balance.getAmount());
        Money m = new Money(currency, 20.00);
        sAccount.deposit(m);
        Money w = new Money(currency, -50.00);
        sAccount.withdraw(w);
        Money p = new Money(currency, 10.00);
        sAccount.deposit(p);
        Money n = new Money(currency, -70.00);
        sAccount.withdraw(n);
        Money q = new Money(currency, 90.00);
        sAccount.deposit(q);
        Money r = new Money(currency, -100.00);
        sAccount.withdraw(r);
        System.out.println(sAccount.printHistory());
        Money pauline = new Money(currency, 1000.00);
        CheckingAccount account = new CheckingAccount(pauline);
        System.out.println("Initial Balance " + account.balance.getAmount());
        Money deposit = new Money(currency, 50.00);
        account.deposit(deposit);
        Money yeyeye = new Money(currency, -20.00);
        account.withdraw(yeyeye);
        Money hehehe = new Money(currency, 100.00);
        account.deposit(hehehe);
        Money lol = new Money(currency, -90.00);
        account.withdraw(lol);
        Money why = new Money(currency, -45.00);
        account.withdraw(why);
        System.out.println(account.printHistory());
    }

}

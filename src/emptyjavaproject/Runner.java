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
        Account account = new Account(money);
        Money deposit = new Money(currency, 50.00);
        account.deposit(deposit);
        Money yeyeye = new Money(currency, -50.00);
        account.withdraw(yeyeye);
        Money hehehe = new Money(currency, 100.00);
        account.deposit(hehehe);
        Money lol = new Money(currency, -90.00);
        account.withdraw(lol);
        System.out.println(account.printHistory());
    }

}

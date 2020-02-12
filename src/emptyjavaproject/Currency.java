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
public class Currency {

    private String name;
    private String symbol;
    /**
     * 
     * @return the symbol for the currency
     */
    public String getSymbol() {
        return symbol;
    }
    /**
     * 
     * @param name the name of the currency
     * @param symbol the symbol of the currency
     */
    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    /**
     * 
     * @param object used to see if an object is used in the same Currency
     * @return if the two values are the same currency
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Currency)) {
            return false;
        }
        return ((Currency) object).name.equalsIgnoreCase(this.name);
    }
    /**
     * 
     * @return the name of the currency
     */
    public String getName(){
        return name;
    }
    
}

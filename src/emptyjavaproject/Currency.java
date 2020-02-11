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

    public String getSymbol() {
        return symbol;
    }

    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Currency)) {
            return false;
        }
        return ((Currency) object).name.equalsIgnoreCase(this.name);
    }
    public String getName(){
        return name;
    }
    
}

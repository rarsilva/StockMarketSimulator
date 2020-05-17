/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator.command;

/**
 *
 * @author Renan
 */
public class TradingDay {
    
    private int amount;
	
	public TradingDay(int tradingDay) {
            this.amount=tradingDay;
	}
	
	public int getAmount() {
            return this.amount;
	}
}



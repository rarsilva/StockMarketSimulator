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
public interface TransactionLink {
    
    void setNextLink(TransactionLink nextLink);
    void runSimulation(TradingDay transaction);
    
}


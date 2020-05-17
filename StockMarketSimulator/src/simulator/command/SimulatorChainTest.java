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
public class SimulatorChainTest {

public SimulatorChainTest() {
    	
        // initialize the chain
    	TransactionLink t1 = new ShareRuleTransaction();
        

        // set the chain of responsibility
       // t1.setNextLink(t2);
       // t2.setNextLink(t3);
        
        while (true) {
    		
    		int amount = 0;
    		
    		System.out.println("Enter amount to dispense");
    		
   
    		
            
    		if (amount % 10 != 0) {
            	
                System.out.println("Amount should be in multiple of 10s.");
                break;
            
            }
            
            // process the request
            t1.runSimulation(new TradingDay(amount));
            
        }
        
    }
}
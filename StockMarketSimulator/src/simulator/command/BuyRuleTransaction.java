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
public class BuyRuleTransaction implements TransactionLink {

    private TransactionLink nextLink;

    @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void runSimulation(TradingDay tr) {
        if (tr.getAmount() >= 1) {

            int notes = tr.getAmount() / 1;
            System.out.println("Dispensing " + notes + " notes of 50 Euro");

            int remainder = tr.getAmount() % 1;

            if (remainder != 0) {
                nextLink.runSimulation(new TradingDay(remainder));
            }

        } else {

            nextLink.runSimulation(tr);

        }
    }
}


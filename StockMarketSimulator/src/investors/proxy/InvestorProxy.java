/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investors.proxy;

import companies.decorator.BasicCompany;
import companies.decorator.Company;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renan
 */
public class InvestorProxy extends RealInvestor{
   
    private Investor investor = new RealInvestor();
    private Company company = new BasicCompany();
    // private static List<Integer> transaction;
   
    
    static{
        //transaction = new ArrayList<Double>();
        //transaction.add(10.0);
        
        
    }
    public void transaction(String action) throws Exception {
       /* System.out.println("Investor:" +toString() + "Transation " + action);
        if (!transactionRules.contains(action)){
            investor.getBudget();
        }
        else{
            throw new Exception("");
        }*/
    }
    
    
}

 /**
  * 
    If a company sells 10 shares, the share price should double up.
o If any 10 shares are sold (from any company), and a company hasn’t sold any, the
price must reduce in 2%.
o Investors can do as many transactions as they like, but must buy only one share per
transaction. Investors must try to buy shares in as many companies as possible to
guarantee the safety of their investment.
o The simulator should stop when all shares have been sold, or all investors have spent
all their money.
*/
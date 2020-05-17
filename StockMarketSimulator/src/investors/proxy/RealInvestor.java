/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investors.proxy;

/**
 *
 * @author Renan
 */
public class RealInvestor implements Investor {
    int id;
    double budget;
   
    
    @Override
    public int getId() {
         return id;
    }

     @Override
    public void setId(int id) {
         this.id = id;
    }
    
    @Override
    public double getBudget() {
         return budget;
    }
    
    @Override
    public void setBudget(double budget) {
         this.budget = budget;
    }

    @Override
    public String toString() {
        return "RealInvestor{" + "id=" + id + ", budget=" + budget + '}';
    }
    
    
   
}

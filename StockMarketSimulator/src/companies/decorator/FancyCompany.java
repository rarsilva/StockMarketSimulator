/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companies.decorator;

/**
 *
 * @author Renan
 */
 public class FancyCompany extends CompanyDecorator {
    
    String description;
    
    public FancyCompany(Company company) {
        super(company);

    }
    
    @Override
    public void settingUp() {
	super.settingUp();
	System.out.println("--Adding super FANCY company" + toString());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FancyCompany{" + "description=" + description + '}';
    }
    
     
}

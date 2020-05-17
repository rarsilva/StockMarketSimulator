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
public class CompanyDecorator implements Company {
    
    int id;
    int share;
    double price;
    
    Company company;
   
    public CompanyDecorator(Company company) {
	this.company = company;
       
    }

    @Override
    public void settingUp() {
         System.out.println("This is your decorator company info"+toString());
    }
    @Override
    public int getId() {
         return id;
    }

    @Override
    public void setId(int id) {
         this.id = id;
    }
    
    @Override
    public int getShare() {
         return share;
    }
    @Override
    public void setShare(int share) {
        this.share = share;
    }

    @Override
    public double getPrice() {
         return price;
    }

    @Override
    public void setPrice(double price) {
         this.price = price;
    }

    @Override
    public String toString() {
        return "BasicCompany{" + "id=" + id + ", share=" + share + ", price=" + price + '}';
    }

}

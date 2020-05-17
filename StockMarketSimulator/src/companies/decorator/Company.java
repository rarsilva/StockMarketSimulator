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
public interface Company {
   public int getId();
   public void setId(int id);
   public int getShare();
   public void setShare(int share);
   public double getPrice();
   public void setPrice(double price);
   public void settingUp();
}

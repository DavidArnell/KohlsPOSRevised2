/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohls.pos.revised;

/**
 *
 * @author David
 */
public interface DiscountStrategy {
    
    
    //private double itemCost;
    
    public double getDiscount(double itemCost);
    
}

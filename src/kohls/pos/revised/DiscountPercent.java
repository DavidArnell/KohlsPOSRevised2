/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohls.pos.revised;

/**
 *
 * @author darnell
 */
public class DiscountPercent implements DiscountStrategy{
    
    // variables used by the methods within this class
    private double PercentDiscount;
    private double discountedPrice;
    private double itemCost;
    
    // Get the rest of the needed variables in the method
    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        discountedPrice = itemCost - itemCost*PercentDiscount;
        return discountedPrice;
    }

    public double getPercentDiscount() {
        return PercentDiscount;
    }

    public void setPercentDiscount(double PercentDiscount) {
        this.PercentDiscount = PercentDiscount;
    }
    
    
    
}

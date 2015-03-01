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
public class DiscountFlatRate implements DiscountStrategy{

    double flatRateDiscount;
    double discountedPrice;
    double itemCost;
    
    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        discountedPrice = itemCost - flatRateDiscount;
        return discountedPrice;
    }
    
    public double getFlatRateDiscount() {
        return flatRateDiscount;
    }

    public void setFlatRateDiscount(double flatRateDiscount) {
        this.flatRateDiscount = flatRateDiscount;
    }
    
   
    
    
    
}

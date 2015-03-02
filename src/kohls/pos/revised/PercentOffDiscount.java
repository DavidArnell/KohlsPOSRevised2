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
public class PercentOffDiscount implements DiscountStrategy{
    
    // variables used by the methods within this class
    private double percentDiscount;
    private double discountedPrice;
    private double itemCost;

//    PercentOffDiscount(double d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    // Constructor used to set percent discount rate
    public PercentOffDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }
    
    //public void PercentOffDiscount(){}
    
    // Get the rest of the needed variables in the method
    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        discountedPrice = itemCost - itemCost*percentDiscount;
        return discountedPrice;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(double PercentDiscount) {
        this.percentDiscount = PercentDiscount;
    }
    
    
    
}

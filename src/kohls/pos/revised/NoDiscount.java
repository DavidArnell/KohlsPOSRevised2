/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohls.pos.revised;

/**
 *
 * @author Owner
 */
public class NoDiscount implements DiscountStrategy {
    
    // Create private double for itemCost for method to return
    private double itemCost;

    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        // return itemCost without modification
        return itemCost;
    }
    
}

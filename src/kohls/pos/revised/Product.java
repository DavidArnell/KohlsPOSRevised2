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

// This class was abstract originally but threw a lot of errors
// Making it simply a products class removed errors though I'm sure this isn't right
//public abstract class Product {
    public class Product{
    
    // Creating a variable of type "DiscountStrategy" to pass objects
    // through the DiscountStrategy interface
    DiscountStrategy discountStrategy;
    
    // Data associated with products
    // Every product will have these attributes though not every discount will need them
    private String productId;
    private String productName;
    private double itemCost;

    // Constructor used to set variable values
    public Product(String productID, String productName, double itemCost, DiscountStrategy discount) {
        // set values passed from constructor into this class
        this.productId = productID;
        this.productName = productName;
        this.itemCost = itemCost;
        this.discountStrategy = discount;
    }
    
   
    
    
    
}

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
public interface ReceiptDataAccessStrategy {
    
    // create method to retrieve customer number
    public Customer findCustomer(final String custId);
    
    // create method to retrieve product information
    public Product findProduct(final String prodId);
    
}

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

// For now, nothing extends from customer
// Does not need to be an interface or abstract class
public class Customer {
    
    private String custID;
    private String custName;
    
    // Use a constructor to get the customer information
    public Customer(String custID, String custName){
        this.custID = custID;
        this.custName = custName;
    }
    
    
    // Getters and setters
    // I'm hoping to not have to manually code in setting and retrieving this info

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    
       
    
}

package kohls.pos.revised;

public class DiscountQuantity implements DiscountStrategy{
    
    

    private double quantityPurchased =5;
    private double quantityDiscount =2;
    private double percentDiscount = 0.5;
    private double discountedPrice;
    private double itemCost = 250;
    private int discountsApplied;
    
    
    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        
        if (quantityPurchased/quantityDiscount >= 1){
            discountsApplied = (int) (quantityPurchased/quantityDiscount);
            itemCost = itemCost - discountsApplied*percentDiscount*(itemCost/quantityPurchased);            
            return itemCost;
        }   
        else {
            return itemCost;
        }
    }
    
    
//        public static void main(String[] args) {
//           
//    }
    
}

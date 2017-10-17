/**
 *
 * @author HP
 */
public class QtyFlatAmtDiscount implements Discount{   

    private double flatAmount;
    private int minimumQty;

    public QtyFlatAmtDiscount(double qtyDiscount, int minimumQty) {     
        setQtyDiscount(qtyDiscount);
        setMinimumQty(minimumQty);
    }        
    
    public final int getMinimumQty() {
        return minimumQty;
    }

    public final void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }  
    
    public final double getQtyDiscount() {
        return flatAmount;
    }

    public final void setQtyDiscount(double flatAmount) {
         if(this.flatAmount < 0){
          throw new IllegalArgumentException("Sorry Discount amount has to be greater than 0.");

        }
        this.flatAmount = this.flatAmount;
    }

    @Override
    public double getDiscount(double unitCost, int qty) {
        
        return flatAmount;
    }

    
    
   
}

/**
 *
 * @author HP
 */
public class NoDiscount implements Discount {
    private final double DISCOUNT = 0.00;

    @Override
    public double getDiscount(double unitCost, int qty) {
        return DISCOUNT;
    }
    
    
}

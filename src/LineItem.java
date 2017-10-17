/**
 *
 * @author HP
 */
public class LineItem {

    private int qty;
    private Product product;

    public LineItem(int qty, Product product) {
        this.setQty(qty);
        this.setProduct(product);
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        if (qty < 0) {
            throw new IllegalArgumentException("Error: Quantity cannot be less than 0, Please enter a another quantity.");
        }
        this.qty = qty;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }
    
    public final double getSubTotal(){
        return product.getUnitPrice() * qty;
    }
    
    public final double getLineItemDiscount(){
        return product.getDiscount().getDiscount(product.getUnitPrice(), qty );
    }
    
    public final double getTotal(){
        return getSubTotal() - getLineItemDiscount();
    }
}

/**
 *
 * @author HP
 */
public class Product {

    private String ProdId;
    private String description;
    private Discount discount;
    private double unitPrice;

    public Product(String ProdId, String description, double unitPrice, Discount discount) {
        setProdId(ProdId);
        setDescription(description);
        setUnitPrice(unitPrice);
        setDiscount(discount);
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final String getProdId() {
        return ProdId;
    }

    public final void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}

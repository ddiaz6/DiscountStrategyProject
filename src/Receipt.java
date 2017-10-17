/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(Customer customer) {
        setCustomer(customer);
    }  
    
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[tempItems.length-1] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    
    public final void AddLineItem(String id, int qty, ReceiptDataAccessStrategy db ){
        Product product = db.findProduct(id);
        this.addToArray(new LineItem(qty, product));        
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public final double getSubTotal(){
        double subTtl = 0;
        for(LineItem lineItem : lineItems){
            subTtl += lineItem.getSubTotal();
        }
        return subTtl;
    }
    
    public final double getTotalDiscount(){
        double ttlDiscount = 0;
        for(LineItem lineItem : lineItems){
            ttlDiscount += lineItem.getLineItemDiscount();
        }return ttlDiscount;
    } 
    
    public final double getGrandTotal(){
        return getSubTotal() - getTotalDiscount();
    } 
    
    public final int getTotalItems(){
        int itemSold = 0;
        for(LineItem lineItem : lineItems){
            itemSold += lineItem.getQty();
        } return itemSold;
    }
    
}

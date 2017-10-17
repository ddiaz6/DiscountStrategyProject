/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class QtyPercentDiscount implements Discount {

    private double percentageOff;
    private int minimumQty;
    private final double NONE = 0.00;

    public QtyPercentDiscount(double percentageOff, int minimumQty) {
        setPercentageOff(percentageOff);
        setMinimumQty(minimumQty);
    }        
            
    public final double getPercentageOff() {
        return percentageOff;
    }

    public final int getMinimumQty() {
        return minimumQty;
    }

    public final void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }   
    
    public final void setPercentageOff(double percentageOff) {
        if (percentageOff < 0 || percentageOff > 99) {
            throw new IllegalArgumentException("Sorry percent off cannot be lower than 0 or greater than 99");
        }
        this.percentageOff = percentageOff;
    }

    @Override
    public double getDiscount(double unitCost, int qty) {
        if (qty >= minimumQty) {
            double discount = (unitCost * qty * percentageOff);
            return discount;
        }
        return NONE;
    }

}

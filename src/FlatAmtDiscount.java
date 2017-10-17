/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class FlatAmtDiscount implements Discount{
    private double flatAmt;    

    public FlatAmtDiscount(double flatAmt) {
        setFlatAmt(flatAmt);
    }

    public final double getFlatAmt() {
        return flatAmt;
    }

    public final void setFlatAmt(double flatAmt) {       
        this.flatAmt = flatAmt;
    }

    @Override
    public double getDiscount(double unitCost, int qty) {
        return flatAmt;
    }
    
    
}

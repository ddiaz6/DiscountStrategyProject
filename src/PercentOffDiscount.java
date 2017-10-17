/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PercentOffDiscount implements Discount{
     private double percentOff;

    public PercentOffDiscount(double percentOff) {
        this.percentOff = percentOff;
    }
 

    public final double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        if(percentOff <.0 || percentOff > .99){
       throw new IllegalArgumentException("Sorry Discount amount cannot be less than 0% or greater than 99%.");

    }
        this.percentOff = percentOff;
    }
    

    @Override
    public double getDiscount(double unitCost, int qty) {
        return unitCost * qty * percentOff;
    }
  
    public static void main(String[] args) {
        PercentOffDiscount percentDiscount = new PercentOffDiscount(.20);      
        
        
        System.out.println(percentDiscount.getDiscount(60,1));
    }
}

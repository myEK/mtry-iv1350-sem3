package mtry.se.iv1350.sem3.model;

/**
 *
 * @author mtrys
 */
public class Pay {
    private double paying;
    private double getBack;
    private double costOfSale;

    /**
     * Save and user getBack.
     * 
     * @param costOfSale
     * @param paying
     * @return
     */
    public Pay(double costOfSale, double paying) {
        this.paying = paying;
        this.costOfSale = costOfSale;
        this.getBack = paying - costOfSale;
    }

    public double getBack() {
        return this.getBack;
    }
    
    public double getPaying() {
        return this.paying;
    }
}

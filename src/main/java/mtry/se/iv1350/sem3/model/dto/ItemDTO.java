package mtry.se.iv1350.sem3.model.dto;

/**
 * Grupps all item related to a produkt.
 * 
 * @author mtrys
 */
public class ItemDTO {
    private final String barCode;
    private String deskripen;
    private double texRate;
    private double prise;
    private double counts;

    /**
     * Creates a new instancen with the barCode
     * 
     * @param barCode The newly created barCode number
     */
    public ItemDTO(String barCode) {
        this.barCode = barCode;
        this.counts = 1;
    }
    
    public ItemDTO(String barCode, String deskripen, double texRate, double prise, double counts){
        this.barCode = barCode;
        this.deskripen = deskripen;
        this.texRate = texRate;
        this.prise = prise;
        this.counts = counts;
    }
    
    /**
     * Uppdate info for the item
     * @param deskripen
     * @param texRate
     * @param prise
     * @param counts
     */
    public void updateInfo(String deskripen, double texRate, double prise, double counts){
        this.deskripen = deskripen;
        this.texRate = texRate;
        this.prise = prise;
        this.counts = counts;
    }

    /**
     * Adding counts to the sale.
     * 
     * @param counts
     */
    public void adduppdatCounts(double counts) {
        this.counts = this.counts + counts;
    }

    /**
     * 
     * @return the item barCode number,
     */
    public String getBarCode() {
        return this.barCode;
    }

    /**
     * 
     * @return the counts of the item.
     */
    public double getCounts() {
        return this.counts;
    }
    
    /**
     * 
     * @return texRate
     */
    public double getTexRate() {
        return this.texRate;
    }

    /**
     * 
     * @return Deskripen of Item
     */
    public String getDeskripen() {
        return this.deskripen;
    }

    /**
     * 
     * @return the pris of the Items whid tax,
     */
    public double getPrise() {
        return this.prise;
    }
    
    public double getPriseBrutto(){
        return (this.prise * (1 + (this.texRate/100))) * this.counts;
    }
}

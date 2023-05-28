package mtry.se.iv1350.sem3.model.dto;

/**
 * Strukturen för returnmedelande vid adda vara
 * 
 * @author mtrys
 */
public class SaleReturnDTO {
    private ItemDTO itemDTO;
    private double price;

    /**
     * Save info to sale
     * 
     * @param itemDTO
     * @param price
     */
    public SaleReturnDTO(ItemDTO itemDTO, double price) {
        this.itemDTO = itemDTO;
        this.price = price;
    }

    /**
     * 
     * @return Get item
     */
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }

    /**
     * 
     * @return sale pris all
     */
    public double price() {
        return this.price;
    }

}

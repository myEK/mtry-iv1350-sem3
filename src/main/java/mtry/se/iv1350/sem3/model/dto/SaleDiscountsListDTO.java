package mtry.se.iv1350.sem3.model.dto;

import java.util.List;
import mtry.se.iv1350.sem3.model.SaleItemList;

/**
 *
 * @author mtrys
 */
public class SaleDiscountsListDTO {
    private double price;
    private SaleItemList itemList;
    private List<DiscountsDTO> listDiscounts;

    /**
     * Save the info to sale.
     * 
     * @param price
     * @param itemList
     * @param listDiscounts
     */
    public SaleDiscountsListDTO(double price, SaleItemList itemList, List<DiscountsDTO> listDiscounts) {
        this.price = price;
        this.itemList = itemList;
        this.listDiscounts = listDiscounts;
    }

    /**
     * 
     * @return price
     */
    public double getPrise() {
        return this.price;
    }

    /**
     * 
     * @return itemList
     */
    public SaleItemList getitemList() {
        return this.itemList;
    }

    /**
     * 
     * @return getListDiscounts
     */
    public List<DiscountsDTO> getListDiscounts() {
        return this.listDiscounts;
    }

}

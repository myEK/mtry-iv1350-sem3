package mtry.se.iv1350.sem3.model;

import mtry.se.iv1350.sem3.model.dto.DiscountsDTO;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;
import mtry.se.iv1350.sem3.model.dto.SaleDiscountsListDTO;
import mtry.se.iv1350.sem3.model.dto.SaleInfoDTO;
import mtry.se.iv1350.sem3.model.dto.SaleReturnDTO;
import java.util.List;

/**
 * Övergipande lista att spara information om köpet
 * 
 * @author mtrys
 */
public class Sale {
    private SaleItemList itemList;
    private SailDiscountsList discountsList;
    private SaleInfoDTO saleInfo;

    /**
     * Cerat the ander story for the sale.
     */
    public Sale() {
        itemList = new SaleItemList();
    }

    /**
     * add item to the sale
     * 
     * @param itemDTO
     * @return
     */
    public SaleReturnDTO addItem(ItemDTO itemDTO) {
        return itemList.additem(itemDTO);
    }
    
    /**
     * Get the list,
     * @param itemDTO
     * @return 
     */
     public SaleItemList getItem() {
        return itemList;
    }
     
     public SaleInfoDTO getInfo(){
         return saleInfo;
     }

    public void endSale() {
        this.saleInfo = new SaleInfoDTO();
    }

    /**
     * add Discounts to the sale
     * 
     * @param discounts
     * @return
     */
    public SaleDiscountsListDTO addDiscounts(List<DiscountsDTO> discounts) {
        discountsList = new SailDiscountsList(itemList, discounts);
        return discountsList.SeekDiscounts();
    }

    /**
     * Get the prise to pay
     * 
     * @return
     */
    public double getPrce() {
        if (discountsList != null) {
            return discountsList.getPrise();
        }

        if (itemList != null) {
            return itemList.getPriseBrutto();
        }

        return 0;
    }
    
    /**
     * 
     * @return 
     */
    public double getMoms() {
        if (itemList != null) {
            return (itemList.getPriseBrutto() - itemList.getPrise());
        }

        return 0;
    }

}

package mtry.se.iv1350.sem3.model;

import java.util.ArrayList;
import java.util.List;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;
import mtry.se.iv1350.sem3.model.dto.SaleReturnDTO;

/**
 * Save the atem the the user wont to buy.
 * 
 * @author mtrys
 */
public class SaleItemList {
    private double prise;
    private double priseBrutto; 
    private List<ItemDTO> saleitemDB = new ArrayList<>();

    /**
     * Cerat item list
     */
    public SaleItemList() {
        this.prise = 0.0;
        this.priseBrutto = 0.0;
        
    };

    /**
     * Add a item to the list
     * 
     * @param itemDTO
     * @return SaleItemReturnDTO strukturen för svarsmedelande vid addad vara.
     */
    public SaleReturnDTO additem(ItemDTO itemDTO) {
        uppdatPrice(itemDTO);
        return new SaleReturnDTO(seekItemList(itemDTO), this.priseBrutto);
    }

    /**
     * 
     * @return the tottal netto prise;
     */
    public double getPrise() {
        return this.prise;
    }
    
     /**
     * 
     * @return the tottal Brutto prise;
     */
    public double getPriseBrutto() {
        return this.priseBrutto;
    }

    public List<ItemDTO> getItemDTO() {
        return this.saleitemDB;
    }

    /**
     * Uppdat price whid new item.
     * 
     * @param itemDTO
     */
    private void uppdatPrice(ItemDTO itemDTO) {
        this.prise += itemDTO.getPrise();
        this.priseBrutto += itemDTO.getPriseBrutto(); 
    }

    /**
     * Sek if the item are in the list, end uppdat ells add item
     * 
     * @param itemDTO
     * @return itemDTO of all registrasen of the same Barcode.
     */
    private ItemDTO seekItemList(ItemDTO itemDTO) {
        if(!saleitemDB.isEmpty()){
            int i = saleitemDB.size() -1;
        
            while (i != -1) {
                if (saleitemDB.get(i).getBarCode() == itemDTO.getBarCode()) {
                    saleitemDB.get(i).adduppdatCounts(itemDTO.getCounts());
                    return saleitemDB.get(i);
                }
                i--;
            }
        }
        saleitemDB.add(itemDTO);
        return itemDTO;
    }
}

package mtry.se.iv1350.sem3.model;

import java.util.ArrayList;
import java.util.List;
import mtry.se.iv1350.sem3.model.dto.DiscountsDTO;
import mtry.se.iv1350.sem3.model.dto.SaleDiscountsListDTO;

/**
 *
 * Save and storry list of discounts
 * 
 * @author mtrys
 */
public class SailDiscountsList {
    private SaleItemList itemList;
    private List<DiscountsDTO> listDiscounts = new ArrayList<>();
    private List<DiscountsDTO> discountsSave = new ArrayList<>();
    private double pricetotal;

    /**
     * cehing of Discounts and return a list of all sale
     * 
     * @param itemList
     * @param listDiscount
     */
    public SailDiscountsList(SaleItemList itemList, List<DiscountsDTO> listDiscount) {
        this.itemList = itemList;
        this.pricetotal = itemList.getPrise();
        this.listDiscounts = listDiscount;
    }

    public SaleDiscountsListDTO SeekDiscounts() {
        checkDiscounts();
        return new SaleDiscountsListDTO(pricetotal, itemList, discountsSave);
    }

    /**
     * Loppar varige möjlig rabbat
     */
    private void checkDiscounts() {
        int s = listDiscounts.size();

        while (s > -1) {
            checkItemBarCode(listDiscounts.get(s));
            s--;
        }
    }

    /**
     * Kollar om koderna fungerar med varan
     * 
     * @param discountsNr
     */
    private void checkItemBarCode(DiscountsDTO discountsNr) {
        int i = itemList.getItemDTO().size();

        while (i > -1) {
            if (itemList.getItemDTO().get(i).getBarCode() == discountsNr.getItemDTO().getBarCode()) {
                checkItemCont(i, discountsNr);
                break;
            }
            i--;
        }
    }

    /**
     * Om antal köpta varor är uppnår, om så addera rabbaten.
     * 
     * @param i
     * @param discountsNr
     */
    private void checkItemCont(int i, DiscountsDTO discountsNr) {
        if (itemList.getItemDTO().get(i).getCounts() >= discountsNr.getNumberOfItem()) {
            this.pricetotal = -discountsNr.getSaleDiscounts();
            discountsSave.add(discountsNr);
        }
    }

    /**
     * Price
     * 
     * @return
     */
    public double getPrise() {
        return this.pricetotal;
    }
}

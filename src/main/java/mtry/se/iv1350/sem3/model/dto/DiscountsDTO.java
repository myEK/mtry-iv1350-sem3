package mtry.se.iv1350.sem3.model.dto;

/**
 * Grupps all Discounts related to a user.
 * 
 * @author mtrys
 */
public class DiscountsDTO {
    private String discountsName;
    private UserDTO userDTO;
    private ItemDTO itemDTO;
    private double numberOfItem;
    private double saleDiscounts;

    /**
     * Creates a new instancen with the discounts
     * 
     * @param discounts
     * @param userDTO
     * @param itemDTO
     * @param numberOfItem
     * @param saleDiscounts
     */
    public DiscountsDTO(String discountsName, UserDTO userDTO, ItemDTO itemDTO, double numberOfItem,
            double saleDiscounts) {
        this.discountsName = discountsName;
        this.userDTO = userDTO;
        this.itemDTO = itemDTO;
        this.numberOfItem = numberOfItem;
        this.saleDiscounts = saleDiscounts;
    }

    /**
     * 
     * @return discountsName
     */
    public String getDiscounts() {
        return this.discountsName;
    }

    /**
     * 
     * @return
     */
    public UserDTO getUserDTO() {
        return this.userDTO;
    }

    /**
     * 
     * @return
     */
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }

    public double getNumberOfItem() {
        return this.numberOfItem;
    }

    public double getSaleDiscounts() {
        return this.saleDiscounts;
    }

}

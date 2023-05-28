package mtry.se.iv1350.sem3.view;

import mtry.se.iv1350.sem3.controller.Controller;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;
import mtry.se.iv1350.sem3.model.dto.UserDTO;
import mtry.se.iv1350.sem3.model.dto.SaleReturnDTO;


/**
 * This i a placeholder of all View
 * 
 * @author mtrys
 */
public class View {
    private Controller contr;

    /**
     * Save the controller struktur i view.
     * 
     * @param contr
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * <-- Test -->
     * labba och utveckling
     */
    public void runtest() {
        // start upp program, BF #2
        startNewSale();
        
        // Registrera vara, BF #3 - 4
        addNewItem("1010");
        addNewItem("1011");
        addNewItem("1012");
        addNewItem("1012");
        
        // End sail # 9
        endSale();
        
        // Betalar # 12
        pay(100);
        
        
    }

    /**
     * <-- Test -->
     * Start a new sale. by caling all methode in the controller
     */
    public void startNewSale() {
        contr.startNewSale();
    }

    /**
     * <-- Test -->
     * simulerer att spara new vara, by caling all methode in the controller.
     * @param barCode 
     */
    public void addNewItem(String barCode) {
        ItemDTO itemDTO = new ItemDTO(barCode);
        SaleReturnDTO show = contr.addnewitem(itemDTO);
        
        System.out.printf(" %s - %.2f kr // Tottalt: %.2f Kr\n", show.getItemDTO().getDeskripen(),show.getItemDTO().getPriseBrutto(), show.price());
        
    }

    /**
     * <-- Test -->
     * simulerer att add discounts, by caling all methode in the controller.
     */
    public void addDiscounts() {
        UserDTO userDTO = new UserDTO("Stina");
        contr.addDiscounts(userDTO);
    }

    /**
     * <-- Test -->
     * Ending Sale to get the price to pay
     */
    public void endSale() {
        System.out.printf("Tottal: %.2f kr\n", contr.endSale());
    }

    /**
     * <-- Test -->
     * Pay end ending Sale.
     * @param paying 
     */
    public void pay(double paying) {
        contr.pay(paying);
    }
}

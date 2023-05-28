package mtry.se.iv1350.sem3.controller;

import mtry.se.iv1350.sem3.integration.AccountingDB;
import mtry.se.iv1350.sem3.integration.DiscountsDB;
import mtry.se.iv1350.sem3.integration.ItemDB;
import mtry.se.iv1350.sem3.integration.PrinterDB;
import mtry.se.iv1350.sem3.model.Pay;
import mtry.se.iv1350.sem3.model.Sale;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;
import mtry.se.iv1350.sem3.model.dto.SaleDiscountsListDTO;
import mtry.se.iv1350.sem3.model.dto.SaleReturnDTO;
import mtry.se.iv1350.sem3.model.dto.UserDTO;

/**
 * Aplikationens enda Controller,
 * 
 * @author mtrys
 */
public class Controller {
    private ItemDB itemDB;
    private Sale sale;
    private DiscountsDB discountsDB;
    private AccountingDB accountingDB;
    private PrinterDB printerDB;

    /**
     * Cerat the controller call
     */
    public Controller() {
        this.itemDB = new ItemDB();
        accountingDB = new AccountingDB();
        printerDB = new PrinterDB();
    }

    /**
     * Cerat the informatioen and story to start a new sail.
     */
    public void startNewSale() {
        this.sale = new Sale();
    }

    /**
     * Kollar mot Exstarn DB for later Save item to Sale.
     * 
     * @param itemDTO
     * @return SaleItemReturnDTO
     */
    public SaleReturnDTO addnewitem(ItemDTO itemDTO) {
        return sale.addItem(itemDB.seekItemLook(itemDTO));
    }

    /**
     * Cerat contakt to discountsDB and seek discounts
     * 
     * Add discounts list to the Sale
     * 
     * @param userDTO
     * @return
     */
    public SaleDiscountsListDTO addDiscounts(UserDTO userDTO) {
        discountsDB = new DiscountsDB();
        return sale.addDiscounts(discountsDB.seekDiscounts(userDTO));
    }

    /**
     * get the price of sale
     * 
     * @return
     */
    public double endSale() {
        sale.endSale(/* add user later? */);
        return sale.getPrce();
    }

    public double pay(double paying) {
        Pay pay = new Pay(sale.getPrce(), paying);
        this.accountingDB.send(sale, pay);
        this.itemDB.send(sale);
        // this.discountsDB.send(sale);
        this.printerDB.Print(sale, pay);
        return pay.getBack();
    }

}

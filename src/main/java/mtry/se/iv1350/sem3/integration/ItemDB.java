package mtry.se.iv1350.sem3.integration;

import mtry.se.iv1350.sem3.model.Sale;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;

/**
 * Alla anropp till Item databas är callade från denna class
 * 
 * @author mtrys
 */
public class ItemDB {
    private ItemDTO[] db;
    /**
     * 
     */
    public ItemDB() {
        // To DB setup
        ItemDTO[] DB = {
            new ItemDTO("1010","Tomat",12,15.5,6), 
            new ItemDTO("1011", "Gurka", 12,30,2),
            new ItemDTO("1012", "Vitlök", 12,13,5),
            new ItemDTO("1011", "Ägg", 12,4,5),
            new ItemDTO("1011", "Vatten från vattenkran", 25,1,40)};
        db = DB;
    }

    /**
     * seek of item in DB.
     * 
     * @param itemDTO
     * @return
     */
    public ItemDTO seekItemLook(ItemDTO itemDTO) {
        
        for(int i = 0; i < this.db.length; i++){
            if(this.db[i].getBarCode() == itemDTO.getBarCode()){
                itemDTO.updateInfo(this.db[i].getDeskripen(), this.db[i].getTexRate(),this.db[i].getPrise(),itemDTO.getCounts());
                return itemDTO;
            }
        }
        // anroppa databas
        return null;
    }

    public void send(Sale sale) {
        // send data
    }

}

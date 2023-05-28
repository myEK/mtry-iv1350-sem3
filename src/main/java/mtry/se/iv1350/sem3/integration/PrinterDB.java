package mtry.se.iv1350.sem3.integration;

import java.util.List;
import mtry.se.iv1350.sem3.model.Pay;
import mtry.se.iv1350.sem3.model.Sale;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;

/**
 * Conting to printer
 */
public class PrinterDB {

    public PrinterDB() {
        // to printer set
        int a = 0;
    }

    public void Print(Sale sale, Pay pay) {
        System.out.print("--------------------------------------------------------------\n");
        
        
        int items = sale.getItem().getItemDTO().size();
        for(int i = 0; i < items; i++){
            printItem(sale.getItem().getItemDTO().get(i));
        }
        
        System.out.print("--------------------------------------------------------------\n");
        
        System.out.printf("Kost tottalt %5.2f kr (moms %5.2f) \n", sale.getPrce(),sale.getMoms());
        System.out.printf("Pay %5.2f kr \n", pay.getPaying());       
        System.out.printf("väcksel %5.2f kr \n", pay.getBack()); 
        
        System.out.print("--------------------------------------------------------------\n");
        
        System.out.printf("%s \n", sale.getInfo().getInfo());
        
        System.out.print("--------------------------------------------------------------\n");
        
    }
    
    private void printItem(ItemDTO Item){
        System.out.printf(" %10s %15.2f antal, - %5.2f kr \n", Item.getDeskripen(),Item.getCounts(),Item.getPriseBrutto());
    }
}

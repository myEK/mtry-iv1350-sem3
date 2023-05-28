package mtry.se.iv1350.sem3.integration;

import java.util.List;

import mtry.se.iv1350.sem3.model.Sale;
import mtry.se.iv1350.sem3.model.dto.DiscountsDTO;
import mtry.se.iv1350.sem3.model.dto.UserDTO;

/**
 * alla anrop mot databasen
 * 
 * @author mtrys
 */
public class DiscountsDB {

    /**
     * Callar DB för hämta databas,
     * 
     * @param userDTO
     * @return Lista med möjliga rabbater
     */
    public List<DiscountsDTO> seekDiscounts(UserDTO userDTO) {
        // cal Discounts databas
        return null;
    }

    public void send(Sale sale) {
        // send data
        int a = 0;
    }
}

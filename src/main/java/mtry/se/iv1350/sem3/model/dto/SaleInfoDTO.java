package mtry.se.iv1350.sem3.model.dto;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author mtrys
 */
public class SaleInfoDTO {
    private String time;
    private String date;
    private String story;

    /**
     * Save info for sale
     */
    public SaleInfoDTO() {
        this.time = LocalTime.now().toString();
        this.date = LocalDate.now().toString();
        this.story = "mtry@kth.se";
    }
    
    public String getInfo(){
        String s = " Time: " + this.time + " \n Date: " + date + " \n Story: " + this.story;
        return s;
    }
}

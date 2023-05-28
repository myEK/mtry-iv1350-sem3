package mtry.se.iv1350.sem3.startup;

import mtry.se.iv1350.sem3.controller.Controller;
import mtry.se.iv1350.sem3.view.View;

/**
 *
 * Start the program
 * 
 * @author mtrys
 */
public class Main {

    /**
     *
     * Staratr upp programet
     * 
     * @param args
     */
    public static void main(String[] args) {
        Controller contr = new Controller();
        View view = new View(contr);

        // runing test
        view.runtest();        
    }

}

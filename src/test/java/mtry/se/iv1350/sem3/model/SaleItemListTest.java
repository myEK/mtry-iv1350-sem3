package mtry.se.iv1350.sem3.model;

import java.util.List;
import mtry.se.iv1350.sem3.model.dto.ItemDTO;
import mtry.se.iv1350.sem3.model.dto.SaleReturnDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mtrys
 */
public class SaleItemListTest {

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdditem() {
        SaleItemList instance = new SaleItemList();

        ItemDTO itemDTO = new ItemDTO("2020", "Sten", 25, 25.5, 3);
        instance.additem(itemDTO);

        ItemDTO expResult = itemDTO;
        ItemDTO result = instance.getItemDTO().get(0);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera första vara error");

        instance = new SaleItemList();
        instance.additem(itemDTO);
        instance.additem(itemDTO);
        expResult = new ItemDTO("2020", "Sten", 25, 25.5, 6);
        result = instance.getItemDTO().get(0);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera vara som redan finns, error");

        instance = new SaleItemList();
        instance.additem(new ItemDTO("2022", "Mos", 25, 12, 2));
        instance.additem(new ItemDTO("2020", "Sten", 25, 25.5, 3));
        expResult = new ItemDTO("2020", "Sten", 25, 25.5, 3);
        result = instance.getItemDTO().get(1);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera ytligare vara som int finns, error");
    }

    @Test
    public void testGetPrise() {
        SaleItemList instance = new SaleItemList();
        double expResult = 0;
        double result = instance.getPrise();
        assertEquals(expResult, result,
                "Returerad fel belop (pris), vid ingen vara registrerad");
    }

    @Test
    public void testGetPriseBrutto() {
        SaleItemList instance = new SaleItemList();
        double expResult = 0;
        double result = instance.getPriseBrutto();
        assertEquals(expResult, result,
                "Returerad fel belop (brutto pris), vid ingen vara registrerad");
    }

    @Test
    public void testGetItemDTO() {
        SaleItemList instance = new SaleItemList();

        ItemDTO itemDTO = new ItemDTO("2020", "Sten", 25, 25.5, 3);
        instance.additem(itemDTO);

        ItemDTO expResult = itemDTO;
        ItemDTO result = instance.getItemDTO().get(0);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera första vara error");

        instance = new SaleItemList();
        instance.additem(itemDTO);
        instance.additem(itemDTO);
        expResult = new ItemDTO("2020", "Sten", 25, 25.5, 6);
        result = instance.getItemDTO().get(0);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera vara som redan finns, error");

        instance = new SaleItemList();
        instance.additem(new ItemDTO("2022", "Mos", 25, 12, 2));
        instance.additem(new ItemDTO("2020", "Sten", 25, 25.5, 3));
        expResult = new ItemDTO("2020", "Sten", 25, 25.5, 3);
        result = instance.getItemDTO().get(1);
        assertEquals(expResult.getCounts(), result.getCounts(), "Addera ytligare vara som int finns, error");
    }

}

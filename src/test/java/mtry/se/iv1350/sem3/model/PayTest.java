package mtry.se.iv1350.sem3.model;

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
public class PayTest {
    
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
    public void testGetBack() {  
        Pay instance = new Pay(99.5,120);
        double expResult = 20.5;
       
        double result = instance.getBack();
        assertEquals(expResult, result,
"Returerad fel belop att betala");
    }

    @Test
    public void testGetPaying() {
        Pay instance = new Pay(99.5,120);
        double expResult = 120;
       
        double result = instance.getPaying();
        assertEquals(expResult, result,
"Fel insparat belop på betalat belop");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.four;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Corne
 */
@RunWith(Parameterized.class)
public class PalinDromeUtilTest {
    
    private final Boolean expected;
    private final String input;

    public PalinDromeUtilTest(Boolean expected, String input) {
        this.expected = expected;
        this.input = input;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
            { true, "abba"  }, 
            { true, "901109" }, 
            { false, "xyz" },
            { false, "12345" }
        };
        return Arrays.asList(data);
    }
    
    /**
     * Test of isPalindrome method, of class PalinDromeUtil.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        Boolean result = PalinDromeUtil.isPalindrome(input);
        assertEquals(expected, result);
    }
    
}

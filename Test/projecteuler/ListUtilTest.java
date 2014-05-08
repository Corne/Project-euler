/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class ListUtilTest {
    
    public ListUtilTest() {
    }

    /**
     * Test of createListFromRange method, of class ListUtil.
     */
    @Test
    public void testCreateListFromRange() {
        System.out.println("createListFromRange");
        long start = 1L;
        long end = 10L;
        List<Long> expResult = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        List<Long> result = ListUtil.createListFromRange(start, end);
        assertEquals(expResult, result);
    }
    
}

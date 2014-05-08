/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Corne
 */
public class ListUtil {
    
    public static List<Long> createListFromRange(long start, long end){
        List<Long> result = new ArrayList<>();
        for (long i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
    
}

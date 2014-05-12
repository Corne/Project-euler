/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.eleven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Corne
 */
public class Grid {

    private final int[][] values;
    private final int width;
    private final int height;

    public Grid(int[][] values) {
        this.values = values;
        this.height = values.length;
        this.width = values[0].length;
    }

    public List<List<Integer>> getAdjacentSequences(int x, int y, int numberOfCells) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rightSequence = this.getRightSequence(x, y, numberOfCells);
        if(rightSequence != null){
            result.add(rightSequence);
        }
        List<Integer> downSequence = this.getDownSequence(x, y, numberOfCells);
        if(downSequence != null){
            result.add(downSequence);
        }
        
        return result;
    }

//    private List<Integer> getLeftSequence(int x, int y, int numberOfCells) {
//        int startIndex = x - (numberOfCells - 1);
//        if (startIndex < 0) {
//            return null;
//        } else {
//            List<Integer> result = new ArrayList<>();
//            for (int i = startIndex; i <= x; i++) {
//                result.add(values[y][i]);
//            }
//            return result;
//        }
//    }

    private List<Integer> getRightSequence(int x, int y, int numberOfCells) {
        int endIndex = x + (numberOfCells );
        if (endIndex >= this.width) {
            return null;
        } else {
            List<Integer> result = new ArrayList<>();
            for (int i = x; i <= endIndex; i++) {
                result.add(values[y][i]);
            }
            return result;
        }
    }
    
    private List<Integer> getDownSequence(int x, int y, int numberOfCells) {
        int endIndex = y + (numberOfCells );
        if (endIndex >= this.height) {
            return null;
        } else {
            List<Integer> result = new ArrayList<>();
            for (int i = y; i <= endIndex; i++) {
                result.add(values[i][x]);
            }
            return result;
        }
    }

}

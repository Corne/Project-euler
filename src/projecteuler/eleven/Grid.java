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

    //todo check if we can merge the next methods into 1
    public List<Integer> getRightSequence(int x, int y, int numberOfCells) {
        int endIndex = x + numberOfCells < this.width ? x + numberOfCells : this.width;
        List<Integer> result = new ArrayList<>();
        for (int i = x; i < endIndex; i++) {
            result.add(values[y][i]);
        }
        return result;
    }

    public List<Integer> getDownSequence(int x, int y, int numberOfCells) {
        int endIndex = y + numberOfCells < this.height ? y + numberOfCells : this.height;
        List<Integer> result = new ArrayList<>();
        for (int i = y; i < endIndex; i++) {
            result.add(values[i][x]);
        }
        return result;
    }

    public List<Integer> getRightDownSequence(int x, int y, int numberOfCells) {
        int endXIndex = x + numberOfCells < this.width ? x + numberOfCells : this.width;
        int endYIndex = y + numberOfCells < this.height ? y + numberOfCells : this.height;
        List<Integer> result = new ArrayList<>();
        int yIndex = y;
        for (int xIndex = x; (xIndex < endXIndex && yIndex < endYIndex); xIndex++) {
            result.add(values[yIndex][xIndex]);
            yIndex++;
        }
        return result;
    }

    public List<Integer> getLeftDownSequence(int x, int y, int numberOfCells) {
        int endXIndex = x - numberOfCells > 0 ? x - numberOfCells : -1;
        int endYIndex = y + numberOfCells < this.height ? y + numberOfCells : this.height;
        List<Integer> result = new ArrayList<>();
        int yIndex = y;
        for (int xIndex = x; (xIndex > endXIndex && yIndex < endYIndex); xIndex--) {
            result.add(values[yIndex][xIndex]);
            yIndex++;
        }
        return result;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    
}

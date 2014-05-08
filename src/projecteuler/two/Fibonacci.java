/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Corne
 */
public class Fibonacci {

    private final ArrayList<Long> sequence;

    public Fibonacci() {
        this.sequence = new ArrayList<>();
        this.sequence.add(0L);
        this.sequence.add(1L);
    }

    public List<Long> getSequenceBelowValue(long value) {
        //adds 1 more number then needed, not needed if we precalulate the value, but fine for now
        while (sequence.get(sequence.size() - 1) < value) {
            addFibo();
        }

        //not best performce because it will check all values, but just checking out java lambda's
        return sequence.stream().filter(s -> s < value)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    
    

    private void addFibo() {
        int currentSize = sequence.size();
        sequence.add(sequence.get(currentSize - 1) + sequence.get(currentSize - 2));
    }

}

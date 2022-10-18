package solid.ocp.operation;

import edu.najah.eng.solid.ocp.IOpeartion;

import java.util.List;

public class Min implements IOpeartion {

    @Override
    public int calculateResult(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }
}

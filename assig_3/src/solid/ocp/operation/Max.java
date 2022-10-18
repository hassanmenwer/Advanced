package solid.ocp.operation;

import edu.najah.eng.solid.ocp.IOpeartion;

import java.util.List;

public class Max implements IOpeartion {
    @Override
    public int calculateResult(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}

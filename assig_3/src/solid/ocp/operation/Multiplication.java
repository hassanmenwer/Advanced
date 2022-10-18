package solid.ocp.operation;

import edu.najah.eng.solid.ocp.IOpeartion;

import java.util.List;

public class Multiplication implements IOpeartion {
    @Override
    public int calculateResult(List<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }
}

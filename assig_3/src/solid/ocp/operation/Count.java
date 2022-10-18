package solid.ocp.operation;

import edu.najah.eng.solid.ocp.IOpeartion;

import java.util.List;

public class Count implements IOpeartion {
    @Override
    public int calculateResult(List<Integer> numbers) {
        return numbers.size();
    }
}

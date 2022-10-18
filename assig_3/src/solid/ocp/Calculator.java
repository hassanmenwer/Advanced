package solid.ocp;

import edu.najah.eng.solid.ocp.operation.*;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> numbers = null;

    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(Operation operation){

        if (operation.equals(Operation.Count)){
            IOpeartion op = new Count();
            return op.calculateResult(numbers);
        }

        if (operation.equals(Operation.Addition)){
            IOpeartion op = new Addition();
            return op.calculateResult(numbers);
        }

        if (operation.equals(Operation.Multiplication)){
            IOpeartion op = new Multiplication();
            return op.calculateResult(numbers);
        }
        if (operation.equals(Operation.Max)){
            IOpeartion op = new Max();
            return op.calculateResult(numbers);
        }
        if (operation.equals(Operation.Min)){
            IOpeartion op = new Min();
            return op.calculateResult(numbers);
        }

        System.err.println("Invalid operation");
        return -1111111;
    }

}
package ph.edu.dlsu.SequenceHelpers;

import ph.edu.dlsu.Sequence;
import java.util.ArrayList;

public class NaturalNumbers implements Sequence {

    private ArrayList<Integer> elements;
    private int numberElements;
    private int sum = 0;

    public void init (int num){

        elements = new ArrayList<Integer>(num);
        numberElements = num;

        for(int i = 0; i < numberElements; i++){
                elements.add(i);
        }

    }

    @Override
    public int getSum() {
        for(int i = 0; i < numberElements; i++){
            sum += elements.get(i);
        }
        return sum;
    }

    @Override
    public void printElements() {
        System.out.print("{");

        for(int i = 0; i < numberElements; i++){
            System.out.print(elements.get(i));
                if(i < numberElements-1)
                    System.out.print(", ");
        }

        System.out.print("}");
    }
}

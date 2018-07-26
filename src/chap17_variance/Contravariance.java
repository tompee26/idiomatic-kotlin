package chap17_variance;

import java.util.ArrayList;
import java.util.List;

public class Contravariance {
    public static void main(String... args) {
        varianceTest();
    }

    public static void varianceTest() {
        List<Number> numbers = new ArrayList<>();
        genericVariance(numbers);

        List<Object> objects = new ArrayList<>();
        genericVariance(objects);
    }


    public static void genericVariance(List<? super Number> numbers) {
        numbers.add(new Double(12));
        numbers.add(new Float(12));
    }

    public static void contravarianceProblem() {
        List<? super Number> numberList = getNumberList();
        numberList.add(new Long(12));
        numberList.add(new Double(12));

        //Number number = numberList.get(0); // compile error
    }

    public static List<? super Number> getNumberList() {
        List<Object> objects = new ArrayList<>();
        objects.add("");
        return objects;
    }
}

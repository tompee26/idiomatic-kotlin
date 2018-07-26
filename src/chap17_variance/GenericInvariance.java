package chap17_variance;

import java.util.ArrayList;
import java.util.List;

public class GenericInvariance {
    public static void main (String... args) {
        varianceTest();
    }

    public static void varianceTest() {
        List<Number> numbers = new ArrayList<>();
        genericVariance(numbers);

        List<Integer> integers = new ArrayList<>();
        //genericVariance(integers); // compile error
    }

    public static void genericVariance(List<Number> numbers) {
        numbers.add(new Long(12));
    }
}

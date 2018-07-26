package chap17_variance;

import java.util.ArrayList;
import java.util.List;

public class Covariance {
    public static void main(String... args) {
        varianceTest();
    }

    public static void varianceTest() {
        List<Number> numbers = new ArrayList<>();
        genericVariance(numbers);

        List<Integer> integers = new ArrayList<>();
        genericVariance(integers);
    }


    public static void genericVariance(List<? extends Number> numbers) {
    }

    public static void covarianceProblem() {
        //getNumberList().add(new Long(12)); // Compile error
    }

    public static List<? extends Number> getNumberList() {
        return new ArrayList<Integer>();
    }
}

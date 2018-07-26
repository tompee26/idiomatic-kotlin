package chap17_variance;

public class Variance {

    public static void main (String... args) {
        varianceTest();
    }

    public static void varianceTest() {
        Number[] numbers = new Number[12];
        arrayVariance(numbers);

        Integer[] integers = new Integer[12];
        arrayVariance(integers);
    }

    public static void arrayVariance(Number[] numbers) {
        numbers[0] = new Long(12);
    }
}

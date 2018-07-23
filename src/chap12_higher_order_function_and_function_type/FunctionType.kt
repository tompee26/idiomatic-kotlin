package chap12_higher_order_function_and_function_type


// A copy of stdlib function interface. Please check actual stdlib function for the updated code
/** A function that takes 1 argument. */
public interface Function1<in P1, out R> : Function<R> {
    /** Invokes the function with the specified argument. */
    public operator fun invoke(p1: P1): R
}
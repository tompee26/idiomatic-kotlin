package chap14_lambda_and_control_flows

fun higherOrderFunction(lambda : () -> Unit) {
}

fun lambdaReturnTest() {
    higherOrderFunction(fun() {
        return
    })
}

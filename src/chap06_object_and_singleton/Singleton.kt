package chap06_object_and_singleton

import java.io.Serializable

object Singleton : Serializable {
    val text: String = "Hello from singleton"

    init {
        /* Do initialization here */
    }
}
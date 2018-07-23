package chap09_lambda_receiver_dsl

class ViewCreator {
    class XMLChildContainer : XMLContainer() {
        private val tagData = StringBuilder()

        fun attr(attrName: String, value: String) {
            tagData.append(" $attrName=\"$value\"")
        }

        fun attrData() = tagData.toString()
    }

    open class XMLContainer {
        private val data = StringBuilder()

        fun child(tag: String, action: XMLChildContainer.() -> Unit): XMLContainer {
            data.append("<$tag")
            val tagData = XMLChildContainer()
            tagData.action()
            data.append(tagData.attrData())
            data.append(">")
            data.append(tagData.data())
            data.append("\n</$tag>")
            return this
        }

        fun data() = data.toString()
    }
}

fun createAndroidLayout(): ViewCreator.XMLContainer {
    return ViewCreator.XMLContainer()
}

fun main(args: Array<String>) {
    val xml = createAndroidLayout()
            .child("LinearLayout") {
                attr("android:layout_height", "match_parent")
                attr("android:layout_width", "match_parent")
                attr("android:orientation", "vertical")
                child("ImageView") {
                    attr("android:layout_height", "match_parent")
                    attr("android:layout_width", "match_parent")
                }
                child("TextView") {
                    attr("android:layout_height", "match_parent")
                    attr("android:layout_width", "match_parent")
                }
            }
    println(xml.data())
}
fun main(args: Array<String>) {
    val ivan = Person(23423,"Ivan")
    val petr = Person("N23222", "Petr")
    ivan.checkId()
    petr.checkId()


}
class Person<K>(val id: K, val name: String) {
    fun checkId() {
        when(id) {
            is Int -> println("id is an Integer")
            is String -> println("id is a String")
        }
    }
    fun validId(_id: K) {
        
    }
}
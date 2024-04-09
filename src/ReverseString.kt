fun reverseString(s: String): String {
    var stringArray = s.toCharArray()
    var indexStart = 0
    var indexEnd = stringArray.size - 1
    while (indexStart < indexEnd) {
        val temp = stringArray[indexStart]
        stringArray[indexStart] = stringArray[indexEnd]
        stringArray[indexEnd] = temp
        indexStart++
        indexEnd--
    }
    return stringArray.joinToString("")
}
fun main() {
    println("Insira uma string")
    val string = readln()
    println("A string invertida é: " + reverseString(string))
}
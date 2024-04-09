fun isFibonnaci(n: Int) {
    var a = 0
    var b = 1
    var c = 0
    while (c < n) {
        c = a + b
        a = b
        b = c
    }
    if (c == n) {
        println("O número $n é um número de Fibonacci.")
    } else {
        println("O número $n não é um número de Fibonacci.")
    }
}
fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()
    isFibonnaci(numero)
}
fun main() {

    //1 - Como criar um Set em Kotlin com os números de 1 a 5?
    val numbers1to5 = mutableSetOf(1,2,3,4,5)

    //2 - Como verificar se um determinado elemento existe em um Set em Kotlin?
    numbers1to5.contains(3)

    //3 - Como remover um elemento específico de um Set em Kotlin?
    numbers1to5.remove(1)

    print(numbers1to5)
}
fun main(args: Array<String>) {
    for (i in 1..4) {
        for (j in 1..4) {
            print("${i * j} \t")
        }
        println()
    }

    println("Введите число\n")
    val x: Int = readLine().toString().toInt()
    for (k in 1..x) {
        if (k % 2 == 0) {
            println(k)
        }
    }

    print("Введите число\n")
    val aa: Int = readLine().toString().toInt()
    var fib1 = 1
    var fib2 = 1
    var fib_sum = 0
    var i = 0
    while (i < aa - 2) {
        fib_sum = fib1 + fib2
        fib1 = fib2
        fib2 = fib_sum
        i = i + 1
    }
    print("Значение этого элемента: $fib2\n")

    print("Введите число\n")
    val num: Int = readLine().toString().toInt()
    var factorial: Long = 1
    for (i in 1..num) {
        factorial *= i.toLong()
    }
    println("Факториал $num = $factorial")

    println("Введите числа\n")
    val s = readLine()!!
    for (int in s) {
        println(int)
    }
    println()
    for (i in s.indices.reversed()) {
        print(s[i])
    }
}
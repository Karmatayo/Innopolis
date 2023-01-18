fun main(args: Array<String>) {
    print("Введите число\n")
    val a: Int = readLine().toString().toInt()
    if (a in 0..10) {
        println("Число меньше десяти\n")
    }
    else if (a > 10) {
        println("Число больше десяти\n")
    }

    print("Введите 1-ое число\n")
    val b: Int = readLine().toString().toInt()
    print("Введите 2-ое число\n")
    val c: Int = readLine().toString().toInt()
    if (b > c){
        println("Первое число больше, чем второе\n")
    }
    else if (b < c){
        println("Первое число больше, чем второе\n")
    }
    else {
        println("Первое число равно второму\n")
    }

    print("Введите сторону A:\n")
    val d: Int = readLine().toString().toInt()
    print("Введите сторону B:\n")
    val e: Int = readLine().toString().toInt()
    print("Введите сторону C:\n")
    val f: Int = readLine().toString().toInt()
    if (d == e && e == f){
        println("Треугольник равносторонний\n")
    }
    else if (d==e || d==f || e==f){
        println("Треугольник равнобедренный\n")
    }
    else {
        println("Треугольник разносторонний\n")
    }

    print("Введите четыре числа\n")
    val g1: Int = readLine().toString().toInt()
    val g2: Int = readLine().toString().toInt()
    val g3: Int = readLine().toString().toInt()
    val g4: Int = readLine().toString().toInt()
    var x: Int = 0;
    var y: Int = 0;
    if (g1 > 0){x++}
    else {y++}
    if (g2 > 0){x++}
    else {y++}
    if (g3 > 0){x++}
    else {y++}
    if (g4 > 0){x++}
    else {y++}
    println("Количество отрицательных чисел: $x")
    println("Количество положительных чисел: $y")

    print("Введите три числа\n")
    val h1: Int = readLine().toString().toInt()
    val h2: Int = readLine().toString().toInt()
    val h3: Int = readLine().toString().toInt()
    if (h1 > h2 && h1 > h3){
        println("max=$h1\n")
    }
    else if (h2 > h1 && h2 > h3){
        println("max=$h2\n")
    }
    else{
        println("max=$h3\n")
    }

    print("Введите число\n")
    val k: Int = readLine().toString().toInt()
    if (k % 2 == 0){
        println("Число четное")
    }
    else{
        println("Число нечетное")
    }

    print ("Товары:\n")
    var l1: Double = 10.43
    var l2: Double = 14550.00
    var l3: Double = 4650.90
    println("1. Апельсин - $l1 руб\n" +
            "2. Диван - $l2 руб\n" +
            "3. Самолет - $l3 руб\n" +
            "0. Выход")
    print("Введите сумму ваших денег\n")
    val ll: Int = readLine().toString().toInt()
    print ("Выберите товар:\n")
    var jj: Int = readLine().toString().toInt()
    when (jj) {
        1 -> print("\n")
        2 -> print("\n")
        3 -> print("\n")
        0 -> System.exit(0)
    }

}
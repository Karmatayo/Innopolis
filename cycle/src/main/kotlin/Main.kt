import java.util.Date
import javax.print.attribute.standard.Finishings
fun main(args: Array<String>) {
    //бесконечный цикл с выходом, если введена строка “Exit”
    print("Введите что-то\n")
    var a = readLine()
    while (a != "Exit") {
        a = readLine()
    }
    //ситуация с вводом отрицательного числа
    print("Введите число\n")
    val b: Int = readLine().toString().toInt()
    var sum = 0
    for (i in 1..b) {
        sum += i
    }
    print(sum)
    if (b < 0){
        System.exit (0)
    }
    //если значение вне диапазона 0 - 100, вывести сообщение “Введено некорректное значение” и попросить повторить ввод
    print("\nВведите число в диапазоне от 0 до 100\n")
    val c: Int = readLine().toString().toInt()
    if (c in 0..100) {
        println("Введенное верное число\nExit")
    }
    else if (c > 100) {
        println("Введено некорректное значение\nПовторите ввод\n")
    }
    // пользователь вводит номер канала, программа выводит название канала, выход из программы по вводу “0”
    var d: Int = readLine().toString().toInt()
    when (d) {
        1 -> print("Канал А\n")
        2 -> print("Канал В\n")
        3 -> print("Канал С\n")
        0 -> System.exit(0)
    }
}
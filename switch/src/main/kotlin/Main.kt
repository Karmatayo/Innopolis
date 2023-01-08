import java.util.Date
import javax.print.attribute.standard.Finishings
fun main(args: Array<String>) {
    print("Введите имя: ")
    val name = readLine()
    print("Введите фамилию: ")
    val sername = readLine()
    print("Введите год рождения: ")
    val year = readLine()
    println("1. Вывести имя\n" +
            "2. Вывести фамилию\n" +
            "3. Вывести год рождения\n" +
            "4. Вывести информацию\n" +
            "0. Выход")
    print ("Выберите пункт меню\n")
    var k: Int = readLine().toString().toInt()
    when (k) {
        1 -> println("Ваше имя: $name")
        2 -> println("Ваша фамилия: $sername")
        3 -> println("Ваш год рождения: $year")
        4 -> println ("Ваше имя: $name\n Ваша фамилия: $sername\n Ваш год рождения: $year")
        0 -> System.exit(0)
    }
}
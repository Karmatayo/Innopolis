import java.util.Date
import kotlin.random.Random
import javax.print.attribute.standard.Finishings
fun main(args: Array<String>) {
    val num = arrayOf(1, -2, -3, 4, 5)
    var n = 0
    var n1 = 0
    for(number in num){
        print("$number \t")
        if (number > 0){
            n ++
            print("полож $n\n")
        }
        else{
            n1 ++
            print("отриц $n1\n")
        }
    }

    val array = arrayOf(1, 2, 3, 4, 5)
    val odd = array.filterIndexed { index, x -> index % 2 == 0}
        .sum()
        .let { println(it)
        }

    val nums: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for(i in nums.indices){
        if(nums[i]%2 == 0){
            print(nums[i])
        }
    }

    val numbers: IntArray = intArrayOf(4, 9, 3, 2, 6)
    var Element = numbers[0]
    for (number in numbers){
        if(Element < number)
            Element = number
    }
    println("Наибольшее число в массиве: $Element")

    val list = listOf(1,2,2,3,3,3)
    fun ma() {
        val countByElement = list.groupingBy { it }.eachCount()
        val maximumElement = countByElement.maxBy { it.value }?.key
        println(maximumElement)
    }

    val size = 10
    val arr = Array(size) { Array(size) { Random.nextInt(10,100)} }
    for (row in arr) {
        for (r in row) {
            print("$r")
        }
        print("\n")
    }
    for (i in 0..size) {
        println("${" ".repeat(i)}${arr[i][i]}")
    }

    val sizee = 10
    val arrayy = Array(sizee) { Array(sizee) { Random.nextInt(10,100)} }
    for (row in arrayy) {
        for (rr in row) {
            print("$rr")
        }
        print("\n")
    }
    for (i in 0..sizee) {
        println("${" ".repeat(sizee - 1 - i)}${arrayy[i][sizee - 1 - i]}")
    }
}
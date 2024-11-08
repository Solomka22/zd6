
import kotlin.math.max
import kotlin.random.Random
import java.util.Scanner
//12
fun gd12(arr12: Array<Int>, index12: Int, index122: Int) {
    if (index12 in arr12.indices && index122 in arr12.indices) {
        val temp12 = arr12[index12]
        arr12[index12] = arr12[index122]
        arr12[index122] = temp12
    } else
        println("индексы выходят за пределы массива")
}
// 15
fun gd15(arr15: IntArray): Boolean {
    val n15 = arr15.size
    for (i15 in 0 until n15 / 2) {
        if (arr15[i15] != arr15[n15 - 1 - i15]) {
            return false
        }
    }
    return true
}
//19
fun gd19(arr19: IntArray, arr2: IntArray): IntArray {
    val result19 = IntArray(arr19.size + arr2.size)
    var i19 = 0
    var j19 = 0
    var k19 = 0
    while (i19 < arr19.size && j19 < arr2.size) {
        if (arr19[i19] < arr2[j19]) {
            result19[k19++] = arr19[i19++]
        } else {
            result19[k19++] = arr2[j19++]
        }
    }
    while (i19 < arr19.size) result19[k19++] = arr19[i19++]
    while (j19 < arr2.size) result19[k19++] = arr2[j19++]
    return result19
}
//21
fun gd21(arr211: IntArray, element21: Int): IntArray {
    return arr211.filter { it != element21 }.toIntArray()
}
//22
fun gd221(arr221: IntArray): Int? {
    val gd222 = arr221.distinct().sortedDescending()
    return if (gd222.size > 1) gd222[1] else null
}
//23
fun gd23(vararg arrays23: IntArray): IntArray {
    return arrays23.flatMap { it.asIterable() }.toIntArray()
}
//24
fun gd24(matrix24: Array<IntArray>): Array<IntArray> {
    val rows24 = matrix24.size
    val cols24 = matrix24[0].size
    val transposed24 = Array(cols24) { IntArray(rows24) }
    for (i24 in 0 until rows24) {
        for (j24 in 0 until cols24) {
            transposed24[j24][i24] = matrix24[i24][j24]
        }
    }
    return transposed24
}
//25
fun gd25(arr25: Array<Int>, target25: Int): Boolean {
    for (element25 in arr25) {
        if (element25 == target25) {
            return true
        }
    }
    return false
}
//27
fun gd27(arr27: IntArray): Int {
    var maxLength27 = 1
    var currentLength27 = 1
    for (i27 in 1 until arr27.size) {
        if (arr27[i27] == arr27[i27 - 1]) {
            currentLength27++
        } else {
            maxLength27 = maxOf(maxLength27, currentLength27)
            currentLength27 = 1
        }
    }
    return maxOf(maxLength27, currentLength27)
}
//29
fun gd29(arr29: IntArray): Double {
    val sorted29 = arr29.sorted()
    return if (sorted29.size % 2 == 0) {
        (sorted29[sorted29.size / 2 - 1] + sorted29[sorted29.size / 2]) / 2.0
    } else {
        sorted29[sorted29.size / 2].toDouble()
    }
}
val scan =Scanner(System.`in`)
fun main() {
    print("Задание 1: \n")
    val arr1 = intArrayOf(5, 10, 15, 20, 25)
    for(i in 0..4){
        print(arr1[i])
        print(" ")
    }
    print("\n\nЗадание 2: \n")
    var arr2 =0
    for(ii in 0..4)
        arr2 += arr1[ii]
    print("сумма всех элеменртов: $arr2")
    print("\n\nЗадание 3: \n")
    print("список: ")
    val arr3 = intArrayOf(4, 6,26, 97, 24, 6,3,99, 45,78)
    for(i3 in 0..(arr3.size-1)){
        print(arr3[i3])
        print(" ")
    }
    val max3 = arr3.maxOrNull()
    val min3 = arr3.minOrNull()
    print("\nмаксимальное число - $max3\nминимальное число - $min3")
    print("\n\nЗадание 4: \n")
    print("список: ")
    for(i3 in 0..(arr3.size-1)){
        print(arr3[i3])
        print(" ")
    }
    print("\nотсортированный список: ")
    val sortArr4 = arr3.sorted()
    print(sortArr4)
    print("\n\nЗадание 5: \n")
    println("уникальные символы в массиве: ")
    val arr5 = listOf("слово", "воробей", "дом")
    val arr51 = listOf('!', '@', '#', '$', '%','^')
    for(i5 in 0..2){
        print(arr5[i5])
        print(" ")
    }
    print("\n")
    for(i51 in 0..5){
        print(arr51[i51])
        print(" ")
    }
    print("\n\nЗадание 6: \n")
    val arr6 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    print("список: ")
    for(i6 in 0..9){
        print(arr6[i6])
        print(" ")
    }
    val arrChet = arr6.filter { it % 2 == 0 }
    val arrNeChet = arr6.filter { !(it % 2 == 0) }
    print("\nчетные числа: $arrChet")
    print("\nнечетные числа: $arrNeChet")
    print("\n\nЗадание 7: \n")
    print("список: ")
    for(i6 in 0..9){
        print(arr6[i6])
        print(" ")
    }
    val reversArr7 = arr6.reversedArray()
    print("\nреверсируемый список: ${reversArr7.joinToString(", ")}")
    print("\n\nЗадание 8: \n")
    val arr8 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    print("введите число от 1 до 10: ")
    val arr81 = scan.nextInt()
    for(i8 in 0..(arr8.size-1)){
        if(arr81==arr8[i8]){
            var arr82 = arr8[i8] -1
            print("элемент найдент под индексом: $arr82")
        }
    }
    print("\n\nЗадание 9: \n")
    val orarr9 = intArrayOf(1, 2, 3, 4, 5, 6,7,8,9,10)
    val coparr9 = orarr9.copyOf()
    println("скопированный массив: ${coparr9.joinToString(", ")}")
    print("\n\nЗадание 10: \n")
    print("четные числа: $arrChet")
    var sumarr10 =0
    for(i10 in 0..(arrChet.size-1))
        sumarr10 += arrChet[i10]
    print("\nсумма чисел массива: $sumarr10")
    print("\n\nЗадание 11: \n")
    val array111 = arrayOf(1, 2, 3, 4, 5)
    val array112 = arrayOf(4, 5, 6, 7, 8)
    val intersection11 = array111.toSet().intersect(array112.toSet())
    println("пересечение массивов: $intersection11")
    print("\n\nЗадание 12: \n")
    val array123 = arrayOf(1, 2, 3, 4, 5)
    println("массив до перестановки: ${array123.joinToString(", ")}")
    gd12(array123, 1, 3)
    println("массив после перестановки: ${array123.joinToString(", ")}")
    print("\n\nЗадание 13: \n")
    val randomArr13 = IntArray(20) { Random.nextInt(1, 101) }
    println("массив случайных чисел: ${randomArr13.joinToString(", ")}")
    print("\n\nЗадание 14: \n")
    val randomArr14 = IntArray(10) { Random.nextInt(1, 101) }
    val arr14 = randomArr14.filter { it % 3 == 0 }
    println("числа делящиеся на 3: ${randomArr14.joinToString(", ")}")
    print("\n\nЗадание 15: \n")
    val array15 = IntArray(5)
    println("введите 5 чисел:")
    for (i151 in array15.indices) {
        array15[i151] = readLine()?.toIntOrNull() ?: 0
    }
    if (gd15(array15)) {
        println("массив является палиндромом")
    } else {
        println("массив не является палиндромом")
    }
    print("\n\nЗадание 16: \n")
    val array16 = arrayOf(1, 2, 3)
    val array161 = arrayOf(4, 5, 6)
    val concatenatedArray = array16 + array161
    println("конкатенированный массив: ${concatenatedArray.joinToString(", ")}")
    print("\n\nЗадание 17: \n")
    val array17 = intArrayOf(1, 2, 3, 4, 5)
    val sum17 = array17.sum()
    val product17 = array17.reduce { acc, i -> acc * i }
    println("сумма элементов: $sum17")
    println("произведение элементов: $product17")
    print("\n\nЗадание 18: \n")
    val array18 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    for (i18 in array18.indices step 5) {
        val group18 = array18.sliceArray(i18 until minOf(i18 + 5, array18.size))
        println("группа: ${group18.joinToString(", ")}")
    }
    print("\n\nЗадание 19: \n")
    val array19 = intArrayOf(1, 3, 5)
    val array192 = intArrayOf(2, 4, 6)
    val arr19 = gd19(array19, array192)
    println("слитый отсортированный массив: ${arr19.joinToString(", ")}")
    print("\n\nЗадание 20: \n")
    val gd19 = 1
    val gd191 = 2
    val gd192 = 10
    val gd193 = IntArray(gd192) { gd19 + it * gd191 }
    println("арифметическая прогрессия: ${gd193.joinToString(", ")}")
    print("\n\nЗадание 21: \n")
    val array21 = intArrayOf(1, 2, 3, 4, 5)
    val newArray21 = gd21(array21, 3)
    println("массив после удаления элемента: ${newArray21.joinToString(", ")}")
    print("\n\nЗадание 22: \n")
    val array223 = intArrayOf(1, 2, 3, 4, 5)
    val secondMax22= gd221(array223)
    println("второй по величине элемент: $secondMax22")
    print("\n\nЗадание 23: \n")
    val array231 = intArrayOf(1, 2, 3)
    val array232 = intArrayOf(4, 5, 6)
    val array233 = intArrayOf(7, 8, 9)
    val combinedArray = gd23(array231, array232, array233)
    println("объединенный массив: ${combinedArray.joinToString(", ")}")
    print("\n\nЗадание 24: \n")
    val matrix24 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    val gd24 = gd24(matrix24)
    println("транспонированная матрица:")
    gd24.forEach { println(it.joinToString(", ")) }
    print("\n\nЗадание 25: \n")
    val array251 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Введите число для поиска (1-10):")
    val input25 = readLine()
    if (input25 != null) {
        val find25 = input25.toIntOrNull()
        if (find25 != null) {
            val found = gd25(array251, find25)
            if (found)
                println("число $find25 найдено в массиве")
            else {
                println("число $find25 не найдено в массиве")
            }
        } else
            println("пожалуйста, введите корректное число")
    }
    print("\n\nЗадание 26: \n")
    val array26 = intArrayOf(1, 2, 3, 4, 5)
    val average26 = array26.average()
    println("среднее арифметическое: $average26")
    print("\n\nЗадание 27: \n")
    val array27 = intArrayOf(1, 1, 2, 2, 2, 3, 3, 1)
    val maxLength27 = gd27(array27)
    println("максимальная последовательность одинаковых элементов: $maxLength27")
    print("\n\nЗадание 28: \n")
    println("введите элементы массива (через пробел):")
    val input28 = readLine() ?: ""
    val array28 = input28.split(" ").map { it.toInt() }.toIntArray()
    println("вы ввели массив: ${array28.joinToString(", ")}")
    print("\n\nЗадание 29: \n")
    val array29 = intArrayOf(1, 3, 2, 4, 5)
    val med29 = gd29(array29)
    println("медиана: $med29")
    print("\n\nЗадание 30: \n")
    val gd30 = IntArray(100) { (1..100).random() }
    for (i30 in gd30.indices step 10) {
        val group30 = gd30.sliceArray(i30 until minOf(i30 + 10, gd30.size))
        println("группа: ${group30.joinToString(", ")}")
    }
}
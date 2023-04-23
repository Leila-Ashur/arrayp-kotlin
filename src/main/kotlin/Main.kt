fun main() {
val myArray= intArrayOf(2,4,5,7,4,9)
    println(findFirstOccurrenceOfFive (myArray))
    val array= intArrayOf(1,2,3,4,3,2,4,2,4)
    println(occuerencOfTwo(array))
    var myArrays= arrayOf("Pineapple","mamgoe","orange")
    val resultArray = filterLongStrings(myArrays)
    println(resultArray.joinToString())
    val middle = intArrayOf(5, 3, 1, 4, 2)
    val medianIndex =middleNumber(myArray)
    println("Theindex of the median element is $medianIndex")

}

//Write a program that takes an array of integers as input and returns
// the index of the first occurrence of the number 5 in the array, or -1 if the number is not found.
fun findFirstOccurrenceOfFive(arr: IntArray): Int {
    for (i in arr.indices) {
        if (arr[i] == 5) {
            return i
        }
    }
    return -1
}
//that gives occrence of two
fun occuerencOfTwo(arr: IntArray):Int{
    for (n in arr){
        if (arr[n]==5){
            return n

        }
    }
    return -1
}

//Write a program that takes an array of strings as input and returns a new array
// containing only the strings that are longer than 5 characters, sorted in descending order by length.

fun filterLongStrings(arr: Array<String>): Array<String> {
    val result = mutableListOf<String>()
    for (s in arr) {
        if (s.length > 5) {
            result.add(s)
        }
    }
    result.sortByDescending { it.length }
    return result.toTypedArray()
}
//Write a program that takes an array of integers as input and returns the index of the median element
// of the array. If the array has an even number of elements, return the index of the lower of the two
// middle elements.
fun middleNumber(array: IntArray):Int{
    var sorted= array.sorted()
    var midlleIndex=sorted.size/2
    return midlleIndex

}


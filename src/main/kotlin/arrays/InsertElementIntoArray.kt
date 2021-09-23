package arrays

fun main(){

    var array: Array<Int> = Array(10,{0})
    //array = arrayOf(1,2,3,4,5)

    var arrayOne = IntArray(10)
    arrayOne[0] = 1
    arrayOne[1] = 2
    arrayOne[2] = 3
    arrayOne[3] = 4
    arrayOne[4] = 5


    var element: Int? = null
    var insertElement: Int = 11

    for (i in 0 until arrayOne.size){

       // print("${arrayOne[i]}, ")

        if (arrayOne[i] != 0){
            element = arrayOne[i]
            arrayOne[i] = insertElement
            insertElement = element
        }

    }

   /* println()

    for (i in 0 until array.size){
        print("${array[i]}, ")
    }

*/

    println()

    for (i in 0 until arrayOne.size){
        print("${arrayOne[i]}, ")
    }

}
package arrays

fun main(){


    var arr: Array<Int> = arrayOf(8,7,6,5,4,3,2,1)

    var start = 0
    var end = arr.size-1
    while (start < end){

        var temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }

    for (element in arr){
        print("${element}, ")
    }

}
package arrays

fun main(){

    var arr: Array<Int> = arrayOf(1,1,2,2,2,3,3,4,4,4,5,5,6,6,6)
    var tempArr: Array<Int> = arrayOf()


    var j: Int = 0
    for (i in 0 until arr.size-1){

        if (arr[i] != arr[i+1]){
            arr[j] = arr[i]
            j++
        }
    }
    arr[j] = arr[arr.size-1]


    for (i in 0 until j+1){
        print("${arr[i]}, ")
    }
}



fun main(){

    //var arr: Array<Int> = arrayOf(7, 1, 3, 2, 4, 5, 6)
    var arr: Array<Int> = arrayOf(4,3,1,2)
    //var arr: Array<Int> = arrayOf(2,3,4,1,5)

    var i = 0
    var swaps = 0
    var temp: Int

    while (i < arr.size) {
        if (arr[i] != i + 1) {
            temp = arr[i]
            arr[i] = arr[temp - 1]
            arr[temp - 1] = temp
            swaps++
        } else {
            i++
        }
    }

    println(swaps)
    for (i in 0 until arr.size){
        print("${arr[i]}, ")
    }
}
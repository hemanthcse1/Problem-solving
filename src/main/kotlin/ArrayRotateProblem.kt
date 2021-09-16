
fun main(){

    // input
    var intArray: Array<Int> = arrayOf(1,2,3,4,5)
    var d: Int = 4
    var n: Int = intArray.size


    // problem solving

    var lShifts: Int = 1

    while (lShifts <= d){
        var element = intArray[0]
        for (i in 1 until intArray.size){

            intArray[i-1] = intArray[i]

            if (i == n-1){
                intArray[i] = element
            }

        }
        lShifts++
    }

    for (i in 0 until intArray.size){
        print("${intArray[i]}, ")
    }

}
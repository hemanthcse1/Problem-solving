package arrays.operationsOnArray

fun main(){

    var arr = IntArray(10)


    initialArrayItems(arr)

    //insertIntoArray(arr,30)

    insertItemAtSpecificPosition(arr, 35, 3)


    for (i in 0 until arr.size){
        print("${arr[i]}, ")
    }


}

fun initialArrayItems(arr: IntArray){
    for (i in 0 until arr.size){
        if (i != 5){
            arr[i] = i+1
        }else{
            break
        }
    }
}


fun insertIntoArray(arr: IntArray, item: Int){

    var elementToInsert = item
    var temp = 0

    for (i in 0 until arr.size){

        if (arr[i] != 0){
            temp = arr[i]
            arr[i] = elementToInsert
            elementToInsert = temp
        }else if(arr[i] == 0){
            arr[i] = elementToInsert
            break
        }
    }

}

fun insertItemAtSpecificPosition(arr: IntArray, item: Int,position: Int){

    var elementToInsert = item
    var temp = 0

    for (i in position-1 until arr.size){
        if (arr[i] != 0){
            temp = arr[i]
            arr[i] = elementToInsert
            elementToInsert = temp
        }else if(arr[i] == 0){
            arr[i] = elementToInsert
            break
        }
    }
}
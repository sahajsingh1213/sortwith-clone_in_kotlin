
//fiterFuntion
fun <T> Collection<T>.customFilter( filerOut:(T)->Boolean):List<T>{
    val list = mutableListOf<T>()
    forEach{
        if (filerOut(it)) {list.add(it)}
    }
    return list
}


//fun <T> Collection<T>.sort(selector: (T) -> Comparable<Any>): MutableList<T> {
//    val newArr = mutableListOf<T>()
//    forEach {
//        newArr.add(it)
//    }
//    QuickSort(newArr, 0, this.size - 1, selector)
//    return newArr
//}







//sorting file for every datatype
fun  < T : Comparable<T>>QuickSort(arr: MutableList<T>,left:Int,right:Int , selector: (Any) -> Comparable<Any> ){

    //find pivot
    var pivot:Int = left-1
    if(right-left>0) {
        for (i in left..right) {
            if ( selector(arr[left]) >= selector(arr[i])) {
                pivot++
            }
        }//swap
        arr[left] = arr[pivot].also { arr[pivot] = arr[left] }
        // if(right-left==1){return}
        // adjustment
        var i = left;
        var en = right
        while (i < pivot && en > pivot) {
            if (selector(arr[i]) > selector(arr[pivot]) && selector(arr[en]) < selector(arr[pivot])) {
                arr[i] = arr[en].also { arr[en] = arr[i] }
                i++
                en--
            } else if (selector(arr[i]) > selector(arr[pivot]) && selector(arr[en]) > selector(arr[pivot])) {
                en--
            } else if (selector(arr[i]) <= selector(arr[pivot]) && selector(arr[en]) < selector(arr[pivot])) {
                i++
            } else {
                break
            }
        }


        if (((pivot - 1) - left) > 0 && pivot != 0) {
            QuickSort(arr, left, pivot - 1,selector)

        }
        if (pivot != arr.size - 1  && ((right - (pivot + 1)) > 0) ) {
            QuickSort(arr,  pivot+ 1, right,selector)
        }
    }
}




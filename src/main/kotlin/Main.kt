import java.awt.Shape

fun main(args: Array<String>) {

   var circle = circle("cirlce1",3.3)//circle1 have area = 34.1946
   var sqaure1 = sqare("square1",3.74)//square1 have area = 13.987600000000002
   var triangle2 = triangle("triangle",34.7,6.8)//triangle have area = 117.98
    //this selector can't be used in all cases
    var selector:(shape) -> Comparable<*>? = {it.area}





   var shapelist = mutableListOf (circle,sqaure1,triangle2)
   var decide = Comparator{shape1:shape,shpa2:shape->
       when{
           (selector(shape1) as Comparable<Any>).compareTo(selector(shpa2) as Comparable<Any>)==1 -> 1// as is used to typecast selectors in subtypes
           (selector(shape1) as Comparable<Any>).compareTo(selector(shpa2) as Comparable<Any>)==-1 -> 1
           else->0
       }

   }
    shapelist.forEach{
        println("${it.name} = ${selector(it)}")
    }
    println("")
   shapelist.sort { it.area }
    shapelist.forEach{
        println("${it.name} = ${selector(it)}")
    }




    //6,7,0,8,3,1,2   2,4,5,5,5,4,3,0
  var mutableList = mutableListOf("sahaj","singh","parmar")
   //f QuickSort(mutableList,0,mutableList.size-1)
    println(mutableList)



}







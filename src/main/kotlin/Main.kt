import java.awt.Shape

fun main(args: Array<String>) {

   var cirle1 = circle("cirlce1",3.3)//cirlce1 have area = 34.1946
   var sqare1 = sqare("sqare1",3.74)//sqare1 have area = 13.987600000000002
   var triangle2 = triangle("triangle",34.7,6.8)//triangle have area = 117.98
    var selector:(shape) -> Comparable<*>? = {it.area}





   var shapelist = mutableListOf (cirle1,sqare1,triangle2)
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
    QuickSort(shapelist,0,shapelist.size-1,selector as (Any) ->Comparable<Any> )
    shapelist.forEach{
        println("${it.name} = ${selector(it)}")
    }



    //6,7,0,8,3,1,2   2,4,5,5,5,4,3,0
//  var mutableList = mutableListOf("sahaj","singh","parmar")
//    QuickSort(mutableList,0,mutableList.size-1)
//    println(mutableList)



}







import javax.swing.plaf.synth.SynthRadioButtonUI

open class shape(var name:String):Comparable<Any>{
    open var area = 0.0
    open fun areaCal():Double = 0.0
    override fun compareTo(other: Any): Int {
        TODO("Not yet implemented")
    }
}

class circle(name: String,var radius:Double): shape(name){


    override fun areaCal() = 3.14*radius*radius


    override var area: Double = areaCal()

}

 class sqare(name: String,var side:Double):shape(name){

     override fun areaCal() = side*side

     override var area: Double = areaCal()
 }

class triangle(name: String,
               var base:Double,
               var height:Double):shape(name){

    override fun areaCal() =  0.5*(base*height)
    override var area: Double = areaCal()
}
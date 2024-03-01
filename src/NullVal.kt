class Wolf{
    var hunger = 10
    val food = "meat"

    fun eat(){
        println("The Wolf is eating $food")
    }
}

class MyWolf {
    var Wolf: Wolf? = Wolf()

    fun MyFun() {
        Wolf?.eat()
    }
}

fun getAWolf(): Wolf?{
    return Wolf()
}


fun main(){
    var w: Wolf? = Wolf()
    if (w!=null){
        w.eat()
    }
    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = MyWolf()
    myWolf?.Wolf?.hunger = 8
    println("The value of myWolf?.Wolf?.hunger is ${myWolf?.Wolf?.hunger}")

    var myArray = arrayOf("Hi","Hello",null)
    for (item in myArray){
        item?.let { println(it) }
    }

    getAWolf()?.let {it.eat()}

    w = null
    val z = w!!.hunger
}
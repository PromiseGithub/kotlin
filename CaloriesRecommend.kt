open class CaloriesRecommend {
    var egg = 78
    var banana = 105
    var apple = 95
    var soda = 150
    var cereal = 150
    var qty = 0


    open fun recommend(): Int {

        println("How many eggs have you had today? (1 = 78 calories): ")
        qty = readLine()!!.toInt()
        egg = qty * 78

        println("How many bananas have you had today? (1 = 105 calories): ")
        qty = readLine()!!.toInt()
        banana = qty * 105

        println("How many apples have you had today? (1 = 95 calories): ")
        qty = readLine()!!.toInt()
        apple = qty * 95

        println("How much soda have you had today? (1 = 150 calories): ")
        qty = readLine()!!.toInt()
        soda = qty * 150

        println("How many bowls of cereal have you had today? (1 = 150 calories): ")
        qty = readLine()!!.toInt()
        cereal = qty * 150

        return egg + banana + apple + soda + cereal
    }
}
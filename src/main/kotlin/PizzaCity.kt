abstract class PizzaCity(val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
                         val sicilianPizzaPrice:Double, val tyroleanPizzaPrice:Double)
{
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0

    var cheque = 0

    abstract fun neapolitanPizzaSale()

    abstract fun romanPizzaSale()

    abstract fun sicilianPizzaSale()

    abstract fun tyroleanPizzaSale()

    fun showStatistics(){
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано сицилийской пиццы: ${neapolitanPizzaCount}")
        println("Продано сицилийской пиццы: $romanPizzaCount")
        println("Продано сицилийской пиццы: $tyroleanPizzaCount")


        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice

        println("Выручка: $money")
    }

}
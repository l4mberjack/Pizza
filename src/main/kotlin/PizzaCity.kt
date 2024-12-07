abstract class PizzaCity(val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
                         val sicilianPizzaPrice:Double, val tyroleanPizzaPrice:Double)
{
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0
    var cheque = 0
    var coffe = 0

    abstract fun neapolitanPizzaSale()

    abstract fun romanPizzaSale()

    abstract fun sicilianPizzaSale()

    abstract fun tyroleanPizzaSale()

    open fun showStatistics(){
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")



        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice

        println("Выручка: $money")
        println("Выручка с учетом скидок и проданных кофе: ${(money - cheque * 50) + coffe * 200}")

    }

}
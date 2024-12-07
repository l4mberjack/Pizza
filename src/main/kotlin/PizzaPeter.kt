
class PizzaPeter(
    neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
     sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
) : PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
      sicilianPizzaPrice, tyroleanPizzaPrice), Drink

{
    override var deniedCoffe = 0
    override fun neapolitanPizzaSale() {
       neapolitanPizzaCount++
       println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }

     override fun drinkSale() {
        println("Желаете кофе?")
        println("1. Да \n2. Нет")
        if (readln() == "1") {println("С вас 200 рублев");coffe++}
        else deniedCoffe++
    }

    override fun showStatistics() {
        super.showStatistics()

        println("Общее кол-во проданного кофе: ${coffe}; Общая сумма: ${coffe * 200}")
        println("Процент людей купивших кофе: ${(coffe*100) / (coffe+deniedCoffe)}")
        println("Процент людей отказавшихся от кофе: ${100 -(coffe*100) / (coffe+deniedCoffe)}")
    }

}
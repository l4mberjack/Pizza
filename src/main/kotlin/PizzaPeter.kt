
class PizzaPeter(
    neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
     sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
) : PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
      sicilianPizzaPrice, tyroleanPizzaPrice), Drink

{
    val pizzas = mutableMapOf("Неаполитанская пицца" to neapolitanPizzaCount,"Римская пицца" to romanPizzaCount,
        "Тирольская пицца" to tyroleanPizzaCount, "Сицилийская пицца" to sicilianPizzaCount)
    var currentpizza: String = ""
    override var deniedCoffe = 0
    override fun neapolitanPizzaSale() {
       neapolitanPizzaCount++
        currentpizza = pizzas["Неаполитанская пицца"].toString()
       println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        currentpizza = pizzas["Римская пицца"].toString()
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        currentpizza = pizzas["Сицилийская пицца"].toString()
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        currentpizza = pizzas["Тирольская пицца"].toString()
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }

     override fun drinkSale() {
        println("Желаете кофе?")
        println("1. Да \n2. Нет")
        if (readln() == "1") {println("С вас 200 рублев");coffe++; var cur = currentpizza.toInt();cur++;println(cur)}
        else deniedCoffe++
    }

    override fun showStatistics() {
        super.showStatistics()


        println("Общее кол-во проданного кофе: ${coffe}; Общая сумма: ${coffe * 200}")
        println("Процент людей купивших кофе: ${(coffe*100) / (coffe+deniedCoffe)}")
        println("Процент людей отказавшихся от кофе: ${100 -(coffe*100) / (coffe+deniedCoffe)}")
    }

}
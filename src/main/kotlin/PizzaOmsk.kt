class PizzaOmsk(
    neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
    sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
) : PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice), Drink, CheckPhoto, Sauce
{

    override var sauce = 0
    override var deniedCoffe = 0
    var deniedSauce = 0
    var notSeenCheques = 0.0
    var CheeseSause = 0
    var OmskiySause = 0
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Омске")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Омске")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Омске")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Омске")
    }

    override fun showStatistics() {
        super.showStatistics()

    }

    override fun drinkSale() {
        println("Желаете кофе?")
        println("1. Да \n2. Нет")
        if (readln() == "1") {println("С вас 200 рублев");coffe++}
        else deniedCoffe++
    }
    override fun SauceSale() {
        println("Желаете соус к пицце?")
        println("1. Да \n2. Нет")
        if(readln() == "1"){
            println("1. Сырный\n2. Омский")}
        when(readln()){
            "1" -> CheeseSause++
            "2" -> OmskiySause++
        }


    }
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да \n2. Нет")
        if (readln() == "1") {println("Вам будет скидка 50 рублев с покупки");cheque++}
        else notSeenCheques++
    }


}
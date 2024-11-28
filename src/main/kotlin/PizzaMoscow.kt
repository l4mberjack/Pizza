
class PizzaMoscow(
        neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
        sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
    ) : PizzaCity(neapolitanPizzaPrice, romanPizzaPrice,
        sicilianPizzaPrice, tyroleanPizzaPrice), CheckPhoto

    {
        val seenCheques = cheque
        var notSeenCheques = 0.0
        override fun neapolitanPizzaSale() {
            neapolitanPizzaCount++
            println("Спасибо за покупку неаполитанской пиццы в Москве")
        }

        override fun romanPizzaSale() {
            romanPizzaCount++
            println("Спасибо за покупку римской пиццы в Москве")
        }

        override fun sicilianPizzaSale() {
            sicilianPizzaCount++
            println("Спасибо за покупку сицилийской пиццы в Москве")
        }

        override fun tyroleanPizzaSale() {
            tyroleanPizzaCount++
            println("Спасибо за покупку тирольской пиццы в Москве")
        }

        override fun showCheckPhoto() {
            println("У вас есть фотография чека?")
            println("1. Да \n2. Нет")
            if (readln() == "1") {println("Вам будет скидка 50 рублев с покупки");cheque++}
            else notSeenCheques++
        }

        override fun showStatistics() {
            super.showStatistics()
            println("Общее количество чеков: ${cheque}; Общая сумма скидок: ${cheque*50}")
            println("Процент людей показавших чеки: ${(cheque*100) / (cheque+notSeenCheques)}")
            println("Процент людей не показавших чеки: ${100 -(cheque*100) / (cheque+notSeenCheques)}")
        }

    }

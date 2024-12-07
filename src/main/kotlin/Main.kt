import kotlin.system.exitProcess

fun main() {
    //Цены на объекты(пиццы) класса PizzaPeter
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    //Цены на объекты(пиццы) класса PizzaMoscow
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )
    val pizzaOmsk = PizzaOmsk(150.0, 170.5,
        145.0, 160.0)

    selectCity(pizzaMoscow, pizzaPeter, pizzaOmsk)

}

///<summary>
///Функция для выбора города и пиццы
///</summary>
fun selectCity(pizzaMoscow: PizzaMoscow, pizzaPeter: PizzaPeter, pizzaOmsk: PizzaOmsk ) {

    var currentPizzaCity: PizzaCity
    while (true) {
        println("Добрый день! Выберите город")
        println("1.Москва\n2.Санкт-Петербург\n3.Омск\n0.Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaOmsk
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        println("Выберите пиццу:")
        println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца\n0. Показать статистику")
        selectPizza(currentPizzaCity)
    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            currentPizzaCity.neapolitanPizzaSale(); selectAddService(currentPizzaCity)
        }

        "2" -> {
            currentPizzaCity.romanPizzaSale(); selectAddService(currentPizzaCity)
        }

        "3" -> {
            currentPizzaCity.sicilianPizzaSale(); selectAddService(currentPizzaCity)
        }

        "4" -> {
            currentPizzaCity.tyroleanPizzaSale(); selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            return
        }
    }
}

fun selectAddService(currentPizzaCity: PizzaCity){
    when(currentPizzaCity){
        is PizzaOmsk ->  {currentPizzaCity.showCheckPhoto();currentPizzaCity.drinkSale(); currentPizzaCity.SauceSale()}
        is PizzaPeter -> currentPizzaCity.drinkSale()
        is  PizzaMoscow -> currentPizzaCity.showCheckPhoto()
    }
}

import kotlin.system.exitProcess

fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )

}

fun selectCity(pizzaPeter: PizzaPeter, pizzaMoscow: PizzaMoscow)
{
    val currentPizzaCity: PizzaCity
    println("Добрый день! Выберите город")
    println("1.Москва\n2.Санкт-Петербург")
    val city = readln()
    println("Выберите пиццу:")
    println("1. Неаполитанская пицца\n2. Римская пицца\n3. Сицилийская пицца\n4. Тирольская пицца")
    val pizza = readln()
    if (city == "1") {
        currentPizzaCity = pizzaMoscow
        if (pizza == "1")
            pizzaMoscow.neapolitanPizzaSale()
        else if (pizza == "2")
            pizzaMoscow.romanPizzaSale()
        else if (pizza == "3")
            pizzaMoscow.sicilianPizzaSale()
        else if (pizza == "4")
            pizzaMoscow.tyroleanPizzaSale()
        else{
            println("ERROR")
            exitProcess(1)
        }
    }
    else if (city == "2") {
        currentPizzaCity = pizzaPeter
        if (pizza == "1")
            pizzaPeter.neapolitanPizzaSale()
        else if (pizza == "2")
            pizzaPeter.romanPizzaSale()
        else if (pizza == "3")
            pizzaPeter.sicilianPizzaSale()
        else if (pizza == "4")
            pizzaPeter.tyroleanPizzaSale()
        else{
            println("ERROR")
            exitProcess(1)
        }
    }
    else {
        println("ERROR")
        exitProcess(1)
    }
}

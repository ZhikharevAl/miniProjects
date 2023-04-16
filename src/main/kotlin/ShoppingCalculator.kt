fun main() {
    val userInput = printMainMenuS()

    println()

    when (userInput) {
        "1" -> analyzeOrder()
        "2" -> payOrder()
        "3" -> cancelOrder()
        else -> println("Вы выбрали некорректный пункт меню")
    }
}


fun printMainMenuS(): String {
    println("""
        1. Посчитать стоимость продуктовой корзины
        2. Оплатить покупку
        3. Отменить покупку
    """.trimIndent())
    return readItemMenuS() ?: ""
}

fun readItemMenuS(): String? {
    return readlnOrNull()
}

fun analyzeOrder() {
    println()
    println("Идет анализ продуктовой корзины")
    val goodsName = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val goodsPrice = arrayOf(14, 69, 240, 31, 46, 10000)

    var name = ""
    var sum = 0

    do {
        name = readln()

        if (name != "Продуктовая корзина пустая") {
            var found = false
            for (index in goodsName.indices) {
                if (goodsName[index] == name) {
                    sum += goodsPrice[index]
                    found = true
                    break
                }
            }
            if (!found) {
                println()
                println("Товар \"$name\" не найден в базе данных")
                return
            }
        } else {
            break
        }
    } while (true)
    println()
    println("Стоимость всех товаров в продуктовой корзине: $sum кредитов")
}

fun payOrder() {
    println("""
        Происходит процесс оплаты
        
        Оплата прошла успешно
    """.trimIndent())
}

fun cancelOrder() {
    println("""
        Идет отмена покупки
        
        Покупка отменена
    """.trimIndent())
}





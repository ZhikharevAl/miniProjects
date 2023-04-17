fun main(){
    val dataAuto = getDataAuto()

    val dataMovie = getDataMovie()

    val dataDroid = getDataDroid()
    print("Введите тип рекламы для отображения (Авто, Кино или Дроиды): ")
    val adType = readln()
    print("Введите количество повторений объявлений: ")
    val steps = readln().toInt()
    var currentStep = 0
    do{
        currentStep++

        when(adType){
            "Авто" -> {
                showBillBoard(dataAuto)
            }
            "Кино" -> {
                showBillBoard(dataMovie)
            }
            "Дроиды" -> {
                showBillBoard(dataDroid)
            }
        }
        Thread.sleep(1000) // Добавляем задержку на 1 секунду
        println()
    }while(currentStep < steps)

}

fun getDataAuto(): Array<String> {
    return arrayOf(
        "Только сегодня! Спорткар за 9990 кредитов! Спешите купить!",
        "Встречайте первый Галактический спорткар с открытым верхом. Ограниченная серия уже в нашем магазине!",
        "Опаздываешь на важные встречи? Покупай спорткар с квантовым двигателем всего за 29990 кредитов!"
    )
}

fun getDataMovie(): Array<String> {
    return arrayOf(
        "Новая часть культовой саги \"Звездные волны XIX\". Только в IMax5D!",
        "Что победит - деньги или любовь? Продолжение легендарного фильма \"Летучая мышь в черном\" уже в кинотеатрах!",
        "Ежегодная часть \"Елочки-Иголочки\" уже в кино! Скорее в кинотеатры!"
    )
}

fun getDataDroid(): Array<String> {
    return arrayOf(
        "Заметил, что дроид уже не так эффективно работает? Чип I.A.M.D.N. уже в магазинах! Обнови своего дроида!",
        "Мощнее в 1,5 раза! Дороже в 2 раза! Приобретай нашего дроида!",
        "Любишь дорогих роботов? Прошлые поколения уже не радуют? Только для тебя! Золотой дроид с инкрустацией драгоценными камнями за 20000 кредитов!"
    )
}

fun showBillBoard(data: Array<String>) {
    for (i in data.indices) {
        println(data[i])
    }
}







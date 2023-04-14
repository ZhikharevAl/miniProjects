import kotlin.system.exitProcess

fun main() {
    val game = 1
    val guide = 2
    val exit = 3

    printMainMenu()
    val selectedItemMenu = readItemMenu()
    when (selectedItemMenu) {
        game -> runGame()
        guide -> showGuide()
        exit -> exitProcess(0)
    }
}

fun printMainMenu() {
    println("""
        1. Запустить игру
        2. Гид по игре
        3. Выйти из игры
        
        Выберите пункт:
    """.trimIndent())
}

fun readItemMenu(): Int {
    return readLine()?.toIntOrNull() ?: 0
}

fun runGame() {
    // генерируем загаданное число в промежутке от 1 до 100
    val numberToGuess = (1..100).random()

    // печатаем приветственное сообщение
    println("Угадайте число от 1 до 100")

    // запускаем бесконечный цикл, пока число не будет угадано
    while (true) {
        // запрашиваем у пользователя ввод числа
        print("Введите число: ")
        val guess = readLine()?.toIntOrNull()

        // проверяем ввод пользователя
        if (guess == null) {
            println("Вы ввели некорректное значение")
            continue
        }

        if (guess !in 1..100) {
            println("Число $guess лежит за пределами заданного промежутка")
            continue
        }

        // проверяем, угадал ли пользователь число
        if (guess == numberToGuess) {
            println("Вы угадали число!")
            break
        } else if (guess < numberToGuess) {
            println("Загаданное число больше")
        } else {
            println("Загаданное число меньше")
        }
    }
}

fun showGuide() {
    val questions = arrayOf(
        "Какая цель игры?",
        "Сколько дается попыток?",
        "Есть ограничение по времени?"
    )
    val answers = arrayOf(
        "Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.",
        "Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.",
        "Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить " +
                "счет за аренду сервера."
    )

    for (i in questions.indices) {
        println("Вопрос: ${questions[i]}")
        println("Ответ: ${answers[i]}")
        println()
    }
}

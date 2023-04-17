# **Тест кейсы для программы.**

## _В данной таблице представлены тест кейсы, которые покрывают основные функциональности программы, используя различные техники тест дизайна._

## Предусловия:

- Все функции, используемые в коде, должны быть определены и работоспособны.
- Пользователь должен знать, как вводить тип рекламы и количество повторений.
- Функция showBillBoard должна корректно выводить массив строк на экран.

| ID | Описание теста                                                      | Шаги воспроизведения                                                                                                                        | Ожидаемый результат                                                                                                           |
|----|---------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| 1  | Проверка отображения рекламы для категории "Авто"                   | 1. Запустить приложение <br> 2. Ввести "Авто" как тип рекламы <br> 3. Ввести число повторений объявлений <br> 4. Нажать "Enter"             | Должна отображаться реклама из массива "dataAuto" указанное количество раз с задержкой в 1 секунду между каждым объявлением.  |
| 2  | Проверка отображения рекламы для категории "Кино"                   | 1. Запустить приложение <br> 2. Ввести "Кино" как тип рекламы <br> 3. Ввести число повторений объявлений <br> 4. Нажать "Enter"             | Должна отображаться реклама из массива "dataMovie" указанное количество раз с задержкой в 1 секунду между каждым объявлением. |
| 3  | Проверка отображения рекламы для категории "Дроиды"                 | 1. Запустить приложение <br> 2. Ввести "Дроиды" как тип рекламы <br> 3. Ввести число повторений объявлений <br> 4. Нажать "Enter"           | Должна отображаться реклама из массива "dataDroid" указанное количество раз с задержкой в 1 секунду между каждым объявлением. |
| 4  | Проверка отображения ошибки при некорректном вводе типа рекламы     | 1. Запустить приложение <br> 2. Ввести "Некорректный тип" как тип рекламы <br> 3. Ввести число повторений объявлений <br> 4. Нажать "Enter" | Должно появиться сообщение об ошибке "Некорректный тип рекламы".                                                              |
| 5  | Проверка отображения ошибки при некорректном вводе числа повторений | 1. Запустить приложение <br> 2. Ввести "Авто" как тип рекламы <br> 3. Ввести "abc" как число повторений объявлений <br> 4. Нажать "Enter"   | Должно появиться сообщение об ошибке "Некорректное число повторений объявлений".                                              |
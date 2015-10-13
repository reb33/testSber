Feature: Выполнение тестов с кредитными картами

Scenario: Сравнить 2 кредитные карты, убедиться что кредитные ставки отображаются правильно
  Given На главной странице
  When Перейти на экран Кредитные карты
  Then Проверка перехода на экран Кредитные карты
  When Выбрать 2 кредитные карты
  When Перейти на экран Сравнение карт
  Then Проверка перехода на экран Сравнения карт
  Then Проверка процентов первой карты "25,9%.* - 33,9%"
  Then Проверка процентов последней карты "25,9%.* - 33,9%"
  When Переход на домашнюю страницу
  Then Проверка перехода на домашнюю страницу


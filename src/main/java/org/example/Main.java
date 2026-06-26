package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int initialBalance = 100;
    int refillAmount = 1100;

    int bonus;
      if (refillAmount > 1000) {
        bonus = refillAmount/100;
      } else {
          bonus = 0;
      }

    int finalBalance = initialBalance + refillAmount + bonus;

        System.out.println("Начальный баланс: " + initialBalance + " руб.");
        System.out.println("Сумма пополнения: " + refillAmount + " руб.");
        System.out.println("Бонусы: " + bonus + " руб.");
        System.out.println("Итоговый баланс: " + finalBalance + " руб.");

    }
}

package ru.netology.services;

public class Service {

    public static int calculate(int income, int expenses, int threshold) {
        int balance = 0; // количество денег на счету
        int count = 0; // счётчик месяцев отдыха
        int difference = 0;
        int remains = 0;

        for (int month = 0; month < 12; month++) {

            if (balance < threshold) {
                System.out.println("Месяц " + (month + 1) + ". Денег " + balance + ". Придётся работать. Заработал " + income + ", потратил -" + expenses);
                balance += income; //  balance = balance + income
                balance -= expenses; //  balance = balance - expenses
            } else {
                remains = balance - expenses;
                difference = remains - remains / 3;
                System.out.println("Месяц " + (month + 1) + ". Денег " + balance + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + difference);
                balance -= difference + expenses;
                count++;
            }
        }


        return count;
    }

}

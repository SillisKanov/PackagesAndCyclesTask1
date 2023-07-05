package ru.netology.services;

public class Service {

    private int balance = 0;
    private int income;
    private int expenses;
    private int threshold;

    public Service(int income, int expenses, int threshold) {
        this.income = income;
        this.expenses = expenses;
        this.threshold = threshold;
    }

    public int calculate() {
        int count = 0;
        int difference = 0;
        int remains = 0;

        for (int i = 1; i < 13; i++) {

            if (balance < threshold) {
                System.out.println("Месяц " + i + ". Денег " + balance + ". Придётся работать. Заработал " + income + ", потратил -" + expenses);
                balance += income;
                balance -= expenses;
            } else {
                remains = (balance - expenses);
                difference = remains - remains / 3;
                System.out.println("Месяц " + i + ". Денег " + balance + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + difference);
                balance -= difference + expenses;
                count++;
            }
        }

        return count;
    }

}

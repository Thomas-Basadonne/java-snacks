package org.lessons.java.snacks;

public class snack9 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("La somma dei primi 10 numeri: " + sum);
        System.out.println("La media dei primi 10 numeri: " + average);
    }
}



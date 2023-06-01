package org.lessons.java.snacks;

import java.util.Scanner;

public class snack8 {

    /*
      - Chiedi un numero di 4 cifre all’utente
      - calcola la somma di tutte le cifre che compongono il numero
      6753 -> 6 + 7 + 5 + 3 = 21
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validNumber = false;
        int number;
        do {
            System.out.print("Inserisci un numero di 4 cifre: ");
            number = scan.nextInt();
            if (number > 999 && number < 10000) {
                // Numero valido
                validNumber = true;
            }
        } while (!validNumber);

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("La somma delle cifre è: " + sum);

        scan.close();
    }
}

package org.lessons.java.snacks;

import java.util.Scanner;

public class snack5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        System.out.print("Inserisci una stringa: ");
        str = input.nextLine();

            int countAlfabetici = 0;
            int countNumeri = 0;
            int countSimboli = 0;

            for (char carattere : str.toCharArray()) {
                if (Character.isLetter(carattere)) {
                    countAlfabetici++;
                } else if (Character.isDigit(carattere)) {
                    countNumeri++;
                } else {
                    countSimboli++;
                }
            }

            System.out.println("Caratteri alfabetici: " + countAlfabetici);
            System.out.println("Numeri: " + countNumeri);
            System.out.println("Simboli non alfanumerici: " + countSimboli);
    }
}


package org.lessons.java.snacks;
import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String str = input.nextLine();

        int lunghezza = str.length();
        boolean isPalindroma = true;

        for (int i = 0; i < lunghezza / 2; i++) {
            if (str.charAt(i) != str.charAt(lunghezza - 1 - i)) {
                isPalindroma = false;
                break;
            }
        }

        if (isPalindroma) {
            System.out.println("La stringa inserita è palindroma.");
        } else {
            System.out.println("La stringa inserita non è palindroma.");
        }
    }
}

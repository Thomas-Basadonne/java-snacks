package org.lessons.java.snacks;
import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + numero);
        } else {
            int numeroSuccessivo = numero + 1;
            System.out.println("Il numero inserito è dispari. Il numero successivo è: " + numeroSuccessivo);
        }
        input.close();
    }
}

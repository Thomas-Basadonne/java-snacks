package org.lessons.java.snacks;
import java.util.Random;

public class snack2 {
    public static void main(String[] args) {
        String[] nomi = {"pippo", "pluto", "topolino", "trilli", "paperino"};
        String[] cognomi = {"rosso", "blu", "giallo", "verde", "marrone"};

        Random random = new Random();

        System.out.println("Falsa lista di invitati:");

        for (int i = 0; i < 10; i++) {
            String nome = nomi[random.nextInt(nomi.length)];
            String cognome = cognomi[random.nextInt(cognomi.length)];

            System.out.println((i + 1) + ". " + nome + " " + cognome);
        }
    }
}

package org.lessons.java.snacks;

public class snack7 {
    public static void main(String[] args) {
        int totalSeconds = 8665; // Numero di secondi da convertire

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Il tempo convertito è: " + timeString);
    }
}

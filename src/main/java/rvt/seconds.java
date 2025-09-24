package rvt;

import java.util.Scanner;

public class seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much days u want to calculate?");
        int sekundes = scanner.nextInt();

        int sekundites = sekundes * 24 * 60 * 60;

        System.out.println("Tavas dienu/dienas sekundes: " + sekundites);
    }
    
}

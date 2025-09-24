package rvt;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pirmais skaitlis: ");
        int pirmais = scanner.nextInt();

        System.out.println("Otrais skaitlis: ");
        int otrais = scanner.nextInt();

        System.out.println("Tresais skaitlis: ");
        int tresais = scanner.nextInt();

        int kopa = pirmais + otrais + tresais;

        double iznakums = kopa /3.0;

        System.out.println("Videjais aritmetiskais starp skaitliem ir: " + iznakums  );


    }
    
}

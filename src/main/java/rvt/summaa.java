package rvt;

import java.util.Scanner;

public class summaa {
    public static void main(String[] args) {
        System.out.println("Give the first number: ");
        Scanner scanner = new Scanner(System.in);
        int mainigais = scanner.nextInt();

        System.out.println("Give the second number: ");
        int mainigais1 = scanner.nextInt(); 

        int suma = mainigais + mainigais1;
        
        System.out.println("The result is: " + suma);


    }
}

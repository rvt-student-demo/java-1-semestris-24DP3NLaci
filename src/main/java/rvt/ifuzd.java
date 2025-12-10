package rvt;

import java.util.Scanner;

public class ifuzd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int a = scanner.nextInt();

        if (a > 0){
            System.out.println("Skaitlis ir pozitivs");
        }
        
        else
        System.out.println("Skaitlis ir negativs.");
        
    }
    
}

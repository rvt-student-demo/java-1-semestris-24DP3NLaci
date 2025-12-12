package rvt;
import java.util.Scanner;
public class delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();


        System.out.println("Ievadi cenu: ");
        double cena = scanner.nextDouble();


        System.out.println("Express piegāde? (1 ja jā, 2 ja nē) :");
        double piegade = scanner.nextInt();


        double summa = 0;

        double piegade2 = 0;
        if (piegade == 1) {
            if (summa >= 10) {
                piegade2 = 2;
            } else {  
                piegade2 = 10;}
        }
        summa = cena + piegade2;
        System.out.println("Rēķins ");

        System.out.println(prece + "  " + cena);

        System.out.println("Piegade: " + piegade2);
        
        System.out.println("Kopā: " + summa);
        }
        }
    
package rvt;
import java.util.Scanner;
public class sequence {
public static void main(String[] args) {    
Scanner scanner = new Scanner(System.in);
int Pirmais = 0;
int Pedejais = 0;
int i = 0;
int kopa = 0;

System.out.println("Ievadi pirmo skaitli: ");
Pirmais = scanner.nextInt();
System.out.println("Ievadi pedejo skaitli");
Pedejais = scanner.nextInt();


for(i = Pirmais; i  <= Pedejais; i++ ) {

    kopa += i;


}

System.out.println("Rezultats ir: " + kopa);
scanner.close();



}
}


package rvt;
import java.util.Scanner;
public class summe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int kopa = 0;
        int aplis = 0;

        while(true){
            System.out.println("Give me number: ");
            int skaitlis = scanner.nextInt();

            if(skaitlis == 0) {
                break;
            }
            kopa += skaitlis;
            aplis += 1;


        }
       System.out.println("Sum: " + kopa);
       System.out.println("Apli : " + aplis);

    }
    
}

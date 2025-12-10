package rvt;
import java.util.Scanner;
import java.util.ArrayList;



public class firstlast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();

        System.out.println("Enter values (enter an empty line to quit):");

        while (true) {
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            userList.add(input);
        }

        int count = userList.size();

        System.out.println("total: " + count);

        scanner.close();

        if(!userList.isEmpty()) {
            int lastIndex = userList.size() - 1;

            System.out.println("Last item was: " + userList.get(lastIndex));
        } else {
            System.out.println("There was no items.");

        }
        }
    }
    


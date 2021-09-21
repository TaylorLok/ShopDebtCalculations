package shop.com;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of shop you in debt");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        Payment[] shop = new Payment[number];

        System.out.println("Verify the shop details where you want to pay your debt to:");

        double amt = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Shop " + (i + 1));

            System.out.println("Enter Shop id");
            int id = input.nextInt();

            System.out.println("Enter Shop Name");
            String name = input.next();

            System.out.println("Enter amount you owes");
            amt = input.nextDouble();

            shop[i] = new Payment(amt, name, id);


        }

        System.out.println("\n The details of the shops and amount you owe are : \n\n");
        for (int i = 0; i < number; i++) {
            System.out.println("Shop " + (i + 1));

            shop[i].display();

        }

        double total = number*(amt);
        System.out.println("Total owes =  "+ total);
    }
}

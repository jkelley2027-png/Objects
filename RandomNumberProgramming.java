
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumberprogramming;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jkelley2027
 */
public class RandomNumberProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Part 1 - Phone Number Generator
        System.out.println("Phone Number Generator");

        char choice = 'p';

        while (choice == 'p') {
            int first = random.nextInt(800);
            int second = random.nextInt(656);
            int third = random.nextInt(10000);

            System.out.printf("%03d-%03d-%04d%n", first, second, third);

            System.out.println("Press p for another phone number or any other key to stop");
            choice = input.next().charAt(0);
        }

        // Part 2 - 6 Sided Die Generator
        System.out.println();
        System.out.println("6 Sided Die Generator");

        choice = 'r';

        while (choice == 'r') {
            int die = random.nextInt(6) + 1;

            System.out.println("You rolled: " + die);

            System.out.println("Press r to roll again or any other key to stop:");
            choice = input.next().charAt(0);
        }

        input.close();
    }
}


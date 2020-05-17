/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class Menu {
    public Menu() {}
    public void displayMenu() {

        Scanner sC = new Scanner(System.in);
        System.out.println("\n----------- Welcome to the Stock Market Simulator ---------------\n");
        System.out.println(
                "Please choose option: "
                + "\n1 Company with the highest capital "
                + "\n2 Company with the lowest capital"
                + "\n3 Investor with the highest number of shares"
                + "\n4 Investor with the lowest number of shares "
                + "\n5 Exit ");

        int opt = sC.nextInt();
switch (opt) {

            case 1:
                System.out.println(" Company with the highest capital");

                break;
            case 2:
                System.out.println("Company with the lowest capital ");

                break;
            case 3:
                System.out.println("Investor with the highest capital ");

                break;
            case 4:
                System.out.println("Company with the lowest capital ");

                break;
            case 5:
                System.out.println("Exit");
                System.exit(0);

        }
        while (!sC.hasNextInt()) {
            System.out.print("Input not valid, please try again");
            displayMenu();
            break;
        }
    }

}

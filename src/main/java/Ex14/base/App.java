/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex14.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double tax = 0.055;
        double cost = myApp.getCost();
        String state = myApp.getState();
        if(state.equals("WI"))
            myApp.WIOutput(tax, cost);
        else
            myApp.normalOutput(cost);
    }

    private void normalOutput(double cost) {
        System.out.println("The total is $" + String.format("%.2f", cost) + ".");
    }

    private void WIOutput(double tax, double cost) {
        double total = Math.ceil((cost * (1 + tax)) * 100) / 100;
        System.out.println("The subtotal is $" + String.format("%.2f", cost) + ".\nThe tax is $" + String.format("%.2f",(cost * tax)) + ".\nThe total is $" + String.format("%.2f", total) + ".");
    }

    private String getState() {
        System.out.print("What is the state? ");
        return in.nextLine();
    }

    private double getCost() {
        System.out.print("What is the order amount? ");
        return Double.parseDouble(in.nextLine());
    }

}

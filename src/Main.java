import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args){

      // Initialize Variables

        Scanner sc = new Scanner(System.in);

        int totalPeople;
        int tipPercentage;
        double cost = 0;

        // User Input

        System.out.println("Welcome to the tip calculator! ");


        System.out.print("How many people are in your group? > ");
        totalPeople = sc.nextInt();
        sc.nextLine();

        System.out.print("What's the tip percentage? (0-100) >  ");
        tipPercentage = sc.nextInt();
        sc.nextLine();

      // Allow the user to input multiple costs

        while (true){
            double currentEntry;
            System.out.print("Enter a cost in dollars and cents. type -1 to end. > ");
            currentEntry = sc.nextDouble();
            if (currentEntry == -1.0){
                break;
            }
            else{
                cost += currentEntry;
            }
        }

      // Calculate values

        double totalTip = (tipPercentage / 100.0) * cost;
        double totalCost = cost + totalTip;
        double perPersonBeforeTip = cost / totalPeople;
        double tipPerPerson = totalTip / totalPeople;
        double costPerPerson = totalCost / totalPeople;

      // How are we going to format these decimals!

        DecimalFormat currency = new DecimalFormat("$#,##0.00");

        // 11.79
        // 11.78848

        // totalCost = (int) (totalCost * 100 + 0.5) / 100.0;
        // totalTip = (int) (totalTip * 100 + 0.5) / 100.0;


        System.out.println("Total Bill Before Tip: " + currency.format(cost));
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Total Tip: " + currency.format(totalTip));
        System.out.println("Total Bill With Tip: " + currency.format(totalCost));

        // double perPersonBeforeTip = ((int) ((cost / totalPeople) * 100 + 0.5)) / 100.0;
        // double tipPerPerson = (int) ((totalTip / totalPeople) * 100 + 0.5) / 100.0;
        // double costPerPerson = (int) ((totalCost / totalPeople) * 100 + 0.5) / 100.0;

        System.out.println("Per Person Cost Before Tip: " + currency.format(perPersonBeforeTip));
        System.out.println("Tip Per Person: " + currency.format(tipPerPerson));
        System.out.println("Total Cost Per Person: " + currency.format(costPerPerson));
    }
}

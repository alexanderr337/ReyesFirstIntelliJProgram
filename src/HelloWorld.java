import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int totalPeople;
        int tipPercentage;
        double cost = 0;



        System.out.println("Welcome to the tip calculator! ");


        System.out.print("How many people are in your group? > ");
        totalPeople = sc.nextInt();
        sc.nextLine();

        System.out.print("What's the tip percentage? (0-100) >  ");
        tipPercentage = sc.nextInt();
        sc.nextLine();

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

        double totalTip = (tipPercentage / 100.0) * cost;
        double totalCost = cost + totalTip;

        // 11.79
        // 11.78848

        totalCost = (int) (totalCost * 100 + 0.5) / 100.0;
        totalTip = (int) (totalTip * 100 + 0.5) / 100.0;


        System.out.println("Total Bill Before Tip: " + cost);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total Bill With Tip: " + totalCost);

        double perPersonBeforeTip = ((int) ((cost / totalPeople) * 100 + 0.5)) / 100.0;
        double tipPerPerson = (int) ((totalTip / totalPeople) * 100 + 0.5) / 100.0;
        double costPerPerson = (int) ((totalCost / totalPeople) * 100 + 0.5) / 100.0;

        System.out.println("Per Person Cost Before Tip: " + perPersonBeforeTip);
        System.out.println("Tip Per Person: " + tipPerPerson);
        System.out.println("Total Cost Per Person: " + costPerPerson);
    }
}

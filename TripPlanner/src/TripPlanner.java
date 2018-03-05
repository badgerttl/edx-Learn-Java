import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        intro(input);
        timeBudget(input);
        timeDiff(input);
        countryArea(input);
    }
    public static void intro(Scanner input) {
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String dest = input.nextLine();
        System.out.println("Great! " + dest + " sounds like a great trip");
        System.out.println("***********\n");
    }
    public static void timeBudget(Scanner input) {
        System.out.print("How many days are you going to spend travelling? " );
        int numdays = input.nextInt();
        System.out.print("What is your budget for the trip? ");
        double budget = input.nextDouble();
        System.out.print("What is the currency symbol for your travel destination? ");
        String cursym = input.next();
        System.out.print("How many " + cursym + " are there in 1 USD? ");
        double curate = input.nextDouble();
        System.out.println();
        int numhours = numdays*24;
        int nummin = numhours*60;
        int numsec = nummin*60;
        System.out.println("If you are travelling for " + numdays + " days that is the same as " + numhours + " hours or " + nummin + " minuets or " + numsec + " seconds." );
        System.out.println("If you are going to spend $" + (int)(budget * 100) / 100.0 + " USD that means per day you can spend up to $" + (int)(budget / numdays * 100) / 100.0 + " USD.");
        System.out.println("Your total budget in " + cursym + " is " + (int)(budget * curate * 100) / 100.0 + " " + cursym + ", which per day is " + (int)(budget * curate / numdays * 100) / 100.0 + " " + cursym + "." );
        System.out.println("***********\n");
    }
    public static void timeDiff(Scanner input) {
        System.out.print("What is the time difference, in hours, between your home your destination? ");
        int timediff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + timediff + ":00 in your travel destination\nand when it is noon at home it will be " + (timediff + 12) + ":00.");
        System.out.println("***********\n");
    }
    public static void countryArea(Scanner input) {
        System.out.print("What is the square area of your destination country in km2? ");
        int countryarea = input.nextInt();
        System.out.println("In miles2 that is " + (countryarea*0.38610) + ".");
        System.out.println("***********\n");
    }
}

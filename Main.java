import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner newScanner = new Scanner(System.in);
        String userName = newScanner.next();
        System.out.println("you sound like an upperty shithead, " + userName);

        System.out.println("how old are you?");
        int userAge = newScanner.nextInt();
        System.out.println(userAge + "?, you look way older than that.");

        System.out.println("how tall are you in meters?");
        double userHeight = newScanner.nextDouble();
        System.out.println(userHeight + "! You are so short!");
        double heightDifferenceM = userHeight - 1.75;
        double heightDifferenceF = userHeight - 1.62;
        System.out.format("%.2fm if you are male.\n", heightDifferenceM);
        System.out.format("%.2fcm if you are female.\n", heightDifferenceF);
    }

}
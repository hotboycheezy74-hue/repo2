import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter Double");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();
        System.out.print(userInt + " " + userDouble + " ");
        System.out.println(userChar + " " + userString );

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter Double");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();
        System.out.print(userString + " " + userChar + " ");
        System.out.println(userDouble + " " + userInt);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter Double");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();
        System.out.print(userInt + " " + userDouble + " ");
        System.out.println(userChar + " " + userString );
        System.out.print(userString + " " + userChar + " ");
        System.out.println(userDouble + " " + userInt);
        System.out.println(userDouble + " cast to an integer is " + (int) userDouble);


    }
}
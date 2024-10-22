import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)
        System.out.print("Plase chose your role:");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser") ){
            System.out.println("Welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome user");
        }else System.out.println("please make sure and enter valid role");

//    2.Take three numbers from the user and print the greatest number
        System.out.print("Plase enter number 1:");
        int number1 = input.nextInt();
        System.out.print("Plase enter number 2:");
        int number2 = input.nextInt();
        System.out.print("Plase enter number 3:");
        int number3 = input.nextInt();

        if (number1 >number2 && number1>number3) {
            System.out.println("the greatest number is:"+number1);
        } else if (number2 >number1 && number2>number3) {
            System.out.println("the greatest number is:"+number2);
        } else if (number3 >number1 && number3>number2) {
            System.out.println("Thr greatest number is:"+number3);
        } else System.out.println("there are 2 number equal");

        //3..Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.
        System.out.println("lets generates an integer & displays the name of the weekday");
        Random rand = new Random();
        int generate_number = rand.nextInt((7 - 1) + 1) + 1;
        System.out.println("The generate_number is:" + generate_number);

        switch (generate_number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("there is something wrong!");
        }

//4)Write a program that takes a numeric score as input and prints
//the corresponding letter grade using the following grading scale:
        System.out.print("please enter your score from 100:");
        int score = input.nextInt();
        if (score >= 90) {
            System.out.println("your Grade:A");
        } else if (score<=89 && score>= 80) {
            System.out.println("your Grade:B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("your Grade:C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("your Grade:D");
        } else System.out.println("your Grade:F");


        //5)Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.

        System.out.print("please enter your age:");
        int age = input.nextInt();
        if (age < 13) {
            System.out.print("You are an: Child");
        } else if (age >=13 && age <=19 ) {
            System.out.print("You are an: Teenager");
        } else if (age >=20) {
            System.out.print("You are an:Adult");
        } else System.out.println("please enter valid data");


    }
}
//Class 2
import java.util.Scanner;

public class JavaIntroduction {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter quantity: ");
        int quantity = sc.nextInt();

        if (quantity < 100) {
            System.out.println("No discount");
        } else if (quantity >= 100 && quantity <= 120) {
            System.out.println("You get 10%");

        } else {
            System.out.println("You get 15%");
        }
    }
}



/*
import java.util.Scanner;

public class JavaIntroduction {

    public static void main(String args[]){
    int num1, num2;

         Scanner sc = new Scanner(System.in);

            System.out.print("Please enter your first number: ");
            num1 = sc.nextInt();

            System.out.print("Please enter your second number: ");
            num2 = sc.nextInt();

        int sum = num1 + num2;

    System.out.println("The sum of the two number is: " + sum); */




import programme1calculate.Calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();

            System.out.println("Please enter one of symbol +,-,/,*: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(firstNumber, secondNumber, symbol);

            System.out.println("Would you like to do more calculation? enter Y OR N");
            char choice = scanner.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                System.out.println("Program terminated ");
                break;
            }
        }

        scanner.close();
    }
}
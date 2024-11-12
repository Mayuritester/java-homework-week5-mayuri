package programme1calculate;
//**Create four methods with manes “addition”, “subtraction”, “division”,
//and “multiplication”. All methods are instance methods and it doesn’t
//return anything. But it has two parameters with the names “int a” and
//“int b”. Also each method has System.out.println(). This prints the
//result. Also create one more method with the name “calculateResult”
//with three parameters with name int a, int b and char symbol. Write the
//logic in the calculateResult method that when the user enters first
//number and second number and symbol based on symbol it does
//calculate.

public class Calculator {
    //methods for addtion, subtraction, multiplication and division
    public static void addition(int a, int b) {
        System.out.println(a + b);

    }
    public static void subtration (int a, int b){
        System.out.println(a - b);
    }

    public static void division (int a, int b){
        System.out.println(a / b);
    }
    public static void multiplication (int a, int b){
        System.out.println(a * b);
    }

    public static void calculateResult (int a, int b, char symbol){
        switch (symbol){
            case '+':
                addition(a,b);
                break;
            case'-':
                subtration(a,b);
                break;
            case'/':
                break;
            case '*':
                multiplication(a,b);
                break;
            default:
                System.out.println("invalid operator sysmbol");


        }
    }
}

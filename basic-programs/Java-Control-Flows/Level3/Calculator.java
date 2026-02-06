import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        double first, second;
        String op;

        Scanner sc = new Scanner(System.in);
        first = sc.nextDouble();
        second = sc.nextDouble();
        op = sc.next();

        switch (op) {

            case "+":
                System.out.println(first + second);
                break;

            case "-":
                System.out.println(first - second);
                break;

            case "*":
                System.out.println(first * second);
                break;

            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

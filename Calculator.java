
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of values - ");
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println("Please enter at least two numbers for calculations.");
                return;
            }

            double result = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter value " + i + ": ");
                double value = sc.nextDouble();

                if (i == 1) {
                    result = value;
                } else {
                    System.out.print("Enter an operator (+, -, *, /): ");
                    char operator = sc.next().charAt(0);

                    switch (operator) {
                        case '+':
                            result += value;
                            break;
                        case '-':
                            result -= value;
                            break;
                        case '*':
                            result *= value;
                            break;
                        case '/':
                            try{
                                result /= value;
                            }
                            catch(ArithmeticException e){
                                System.out.println("Error occured"+e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("!!! Error Invalid Operator !!!");
                            sc.close();
                            return;
                    }
                }
            }

            System.out.println("Result: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error Invalid input. Please enter valid numbers.");
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}

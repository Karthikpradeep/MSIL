import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberToWordsConverter {
    private static final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private static final String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety" };

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        String words = "";
        if (num >= 100000) {
            words += convertThreeDigits(num / 100000) + " Lakh ";
            num %= 100000;
        }
        if (num >= 1000) {
            words += convertThreeDigits(num / 1000) + " Thousand ";
            num %= 1000;
        }
        words += convertThreeDigits(num) + " only";
        return words;
    }
    private static String convertThreeDigits(int num) {
        String result = "";
        if (num >= 100) {
            result += ones[num / 100] + " Hundred";
            num %= 100;
            if (num > 0) {
                result += " and ";
            }
        }
        if (num >= 11 && num <= 19) {
            result += teens[num - 10];
        } 
        else {
            result += tens[num / 10];
            if (num % 10 != 0) {
                result += " " + ones[num % 10];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 6 digits): ");
        try {
            int num = scanner.nextInt();
            if (num >= 0 && num <= 999999) {
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                String numberWithCommas = decimalFormat.format(num);
                String words = numberToWords(num);
                System.out.println("In Number: " + numberWithCommas);
                System.out.println("In Words: " + words);
            } else {
                System.out.println("Please enter a valid number within the range 0 to 999999.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }
}

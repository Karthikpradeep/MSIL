package p1;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to find the day of the week: ");
        int dayNumber = scanner.nextInt();
        if (dayNumber >= 1 && dayNumber <= 7) {
            String day;
            if (dayNumber == 1) {
                day = "Monday";
            } else if (dayNumber == 2) {
                day = "Tuesday";
            } else if (dayNumber == 3) {
                day = "Wednesday";
            } else if (dayNumber == 4) {
                day = "Thursday";
            } else if (dayNumber == 5) {
                day = "Friday";
            } else if (dayNumber == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
            System.out.println("The day of the week is " + day);
        }
        else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        switch (dayNumber) {
            case 1:
                System.out.println(" The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is Thursday");
                break;
            case 5:
                System.out.println("The day of the week is Friday");
                break;
            case 6:
                System.out.println("The day of the week is Saturday");
                break;
            case 7:
                System.out.println("The day of the week is Sunday");
                break;
            default:
                System.out.println("Please enter a number between 1 and 7.");
        }
        scanner.close();
    }
}


package p3;
import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array - ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\nEnter the number to be updated - ");
        int num = sc.nextInt();
        int index = -1;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.print("Enter the replacement number - ");
            int rep = sc.nextInt();
            arr[index] = rep;
            System.out.print("Updated array - ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
        } else {
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}
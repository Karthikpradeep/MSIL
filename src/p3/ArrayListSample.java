package p3;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the elements to the arraylist and type 000 to stop - ");
            int input = sc.nextInt();
            if (input == 000) {
                break;
            }
            arr.add(input);

        }

        System.out.println(arr);
        System.out.print("Enter the element to be searched in the arraylist - ");
        int x = sc.nextInt();
        boolean found = false;
        if (arr.contains(x)) {
            found = true;
        }
        if (found) {
            System.out.println("Element " + x + " found in the arraylist");
        } else {
            System.out.println("Element " + x + " not found in the arraylist");
        }
        System.out.print("Do you want to shuffle the arraylist yes/no -");
        String str;
        str = sc.next();
        if (str.equalsIgnoreCase("yes")) {
            Collections.shuffle(arr);
            System.out.println("Shuffled arraylist" + arr);
        }
        sc.close();
    }
}
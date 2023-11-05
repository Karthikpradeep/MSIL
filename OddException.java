import java.util.Scanner;

class OddNumException extends Exception {
    public OddNumException(String message) {
        super(message);
    }
}

public class OddException {
    public static int result(int num)throws OddNumException {
        if (num % 2 == 1) {
            throw new OddNumException("!!! Odd Number not Allowded !!!");
        } else {
            System.out.println("Number is even");
        }
        return num;
    }

    public static void main(String[] args)throws OddNumException {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number - ");
        num = sc.nextInt();
        result(num);
        sc.close();
    }
}

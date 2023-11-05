import java.util.Scanner;
public class ExceptionExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the dividend - ");
            int divid = sc.nextInt();
            System.out.print("Enter the divisor - ");
            int divis = sc.nextInt();
            int result = divid/divis;
            System.out.println("Result - "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred - "+e.getMessage());
        }
       // finally{
         //   System.out.println("Finally block is executed");
        //}
        sc.close();
    }
}

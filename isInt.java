import java.util.Scanner;

public class isInt {
    public static void main(String[] args) {
        System.out.println("Enter any thing i guess is that intger or any thing else");
        Scanner sc = new Scanner(System.in);
        boolean input = sc.hasNextInt();
        if (input) {
            System.out.println("a Integer");
        }
        else {
            System.out.println("Not a integer");
        }
    }
}

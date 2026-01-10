import java.util.Scanner;

public class multi_n {
    public static void main(String[] args) {
        Gson file = new Gson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        int password = file.pinput();
    }
}

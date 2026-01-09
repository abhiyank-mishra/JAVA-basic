import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You subject num 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter You subject num 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter You subject num 3");
        int sub3 = sc.nextInt();
        System.out.println("Enter You subject num 4");
        int sub4 = sc.nextInt();
        System.out.println("Enter You subject num 5");
        int sub5 = sc.nextInt();
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        double per = sum / 5;
        System.out.println(per);
    }
}

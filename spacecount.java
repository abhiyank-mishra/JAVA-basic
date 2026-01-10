import java.util.Scanner;

public class spacecount {
    public static void main(String[] args) {
        System.out.println("Enter any String..");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == 32) {
                count++;
            }
        }
        System.out.println(count);
    }
}

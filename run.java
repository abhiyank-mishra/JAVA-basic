import java.util.Random;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Gson file = new Gson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        Abhiyank r = new Abhiyank();
        name = r.nameCaptial(name);
        Random rand = new Random();
        int password = rand.nextInt(9999);
        double ammount = 1000.00;
        System.out.println(name+" your password is "+password+"\nYour Ballance is "+ammount);


        file.addData(name, password, ammount);
    }
}

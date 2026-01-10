import java.util.Random;
import java.util.Scanner;

class Guess {
    int inputNumber;

    public int genrate() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
    
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter num: ");
            int input = sc.nextInt();
            return input;
        } catch (Exception e) {
            System.out.println("Enter a Valid num ");
        }
        return 0;
    }

    public boolean check(int humInput,int comInput) {
        if (comInput == humInput) {
            System.out.println("Congresulation.. \nNumber is "+comInput);
            return false;
        }
        else if (comInput > humInput) {
            System.out.println("To less..");
            return true;
        }
        else if (comInput < humInput) {
            System.out.println("To large..");
            return true;
        }
        else {
            return true;
        }
    }
    
}

public class guess_no {
    public static void main(String[] args) {
        Guess game = new Guess();
        int user = game.takeUserInput();
        int computer = game.genrate();
        // System.out.printf("Your num is %d\n", user);
        while (game.check(user, computer)) {
            user = game.takeUserInput();
            
        }
        
    }
}

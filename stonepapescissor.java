import java.util.Random;
import java.util.Scanner;

class Game {
    String getSPS(int num) {
        if (num == 1) {
            return "Stone";
        } else if (num == 2) { 
            return "Paper";
        } else if (num == 3) {
            return "Scissor";
        } else {
            return "Invalid Input";
        }
    }

    void result(int computerInput, int humanInput) {
        int hscore = 0;
        int cscore = 0;
        if (computerInput == 3 && humanInput == 2) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou lose.", getSPS(computerInput),
                    getSPS(humanInput));
            cscore += 10; 
        }
        else if (computerInput == 1 && humanInput == 2) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou Win.", getSPS(computerInput),
                    getSPS(humanInput));
            hscore += 10; 
        }
        else if (computerInput == 1 && humanInput == 3) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou lose.", getSPS(computerInput),
                    getSPS(humanInput));
            cscore += 10;
        }
        else if (computerInput == 2 && humanInput == 1) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou lose.", getSPS(computerInput),
                    getSPS(humanInput));
            cscore += 10; 
        }
        else if (computerInput == 2 && humanInput == 3) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou win.", getSPS(computerInput),
                    getSPS(humanInput));
            hscore += 10; 
        }
        else if (computerInput == 3 && humanInput == 1) {
            System.out.printf("Computer Choose %s and You Choose %s \nYou win.", getSPS(computerInput),
                    getSPS(humanInput));
            hscore += 10; 
        }
        else if (computerInput == humanInput) {
            System.out.printf("You bouth choose %s so this is a Draw.", getSPS(humanInput));
            cscore += 0; 
        }
        
    }
}

public class stonepapescissor {
    public static void main(String[] args) {
        int human = 8;
        while (human != 0) {
            Random rm = new Random();
            int comp = rm.nextInt(3);
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter: \n1. for Stone\n2. for Paper\n3. for Scissor");
            human = sc.nextInt();
            Game game = new Game();
            game.result(comp, human);
        }
    }
}
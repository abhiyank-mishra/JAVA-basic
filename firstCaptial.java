import java.util.Scanner;

class Abhiyank {
    

    public String nameCaptial(String name) {
        String first = name.substring(0, 1);
        String second = name.substring(1);
        String mainName = first.toUpperCase() + second.toLowerCase();
        return mainName;
    }

    
}

public class firstCaptial {
    public static void main(String[] args) {
        System.out.println("Enter Your name in Any format");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Abhiyank cp = new Abhiyank();
        System.out.println(cp.nameCaptial(name));
    }
}

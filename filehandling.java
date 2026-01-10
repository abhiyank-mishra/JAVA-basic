import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Gson {
    String fileName = "Data/data.json";

    public int pinput() {
        Scanner sc = new Scanner(System.in);
        try{
            int password = sc.nextInt();
            return password;
        }catch(Exception e){
            System.out.println("Enter only number..");
            return pinput();
        }
    }

    public boolean addData(String name, int password, double ammount) {
    try {
        FileReader r = new FileReader(fileName);
        BufferedReader br = new BufferedReader(r);

        String line;
        String data = "";

        while ((line = br.readLine()) != null) {
            data += line + "\n";
        }
        br.close();

        String target = "},{}";

        if (data.contains(target)) {
            String insert =
                "},\n\t{\n" +
                "\t\t\"name\":\"" + name + "\",\n" +
                "\t\t\"password\":" + password + ",\n" +
                "\t\t\"ammount\":" + ammount + "\n" +
                "\t},{}\n";

            data = data.replace(target, insert);

            FileWriter w = new FileWriter(fileName);
            w.write(data);
            w.close();

            System.out.println("Add Successfully");
            return true;
        } else {
            System.out.println("Pattern not found");
            return false;
        }

    } catch (Exception e) {
        System.out.println("Error: " + e);
        return false;
    }
}


    public boolean newData(String name, int password, double ammount ) {
      File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("File not found, New file " + fileName + " Created");
            }
                
                FileWriter w = new FileWriter(fileName);
                w.write("[\n\t{\n");
                w.write("\t\t\"name\":\""+name+"\",\n");
                w.write("\t\t\"password\":"+password+",\n");
                w.write("\t\t\"ammount\":"+ammount+"\n");
                w.write("\t},{}\n]\n");
                w.close();
                System.out.println("Write Successfully");
                return true;
            
        }
        catch (IOException e) {
            System.out.println("Some error occur");
            return false;
        }
    }  
    
    public boolean creat(String fileName) {
        File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("Created "+fileName+" ...");
                return true;
            }
            else {
                return false;
            }
            
        }
        catch (IOException e) {
            System.out.println("Some error occur");
            return false;
        }
    }
}

public class filehandling {
    public static void main(String[] args) {
        Gson file = new Gson();
        String fileName = "Data/data.json";
        String name = "Abhiyank";
        int age = 1325;
        file.newData(name, age, 2345);
        file.addData(name, age, 8952);
    }
}

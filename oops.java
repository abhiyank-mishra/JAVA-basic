class Employe {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        System.out.printf("Name change %s to %s\n", name, newName);
        name = newName;
    }
}


public class oops {
    public static void main(String[] args) {
        Employe rohan = new Employe();
        rohan.name = "Rohan Shriwastav";
        rohan.salary = 19323;
        System.out.println(rohan.getSalary());
        rohan.setName("Rohan Chutiya");
        System.out.println(rohan.getName());

    }
}

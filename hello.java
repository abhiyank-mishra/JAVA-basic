class Mobile {
    String brand;
    double price;
    boolean isAvailable;

    public void show(){
        System.out.print(brand + " " + "Price: " + price);
        if (isAvailable) {
            System.out.println(" Phone is Available");
        }
        else {
            System.out.println(" Phone is not Available");   
        }
    }
}

public class hello {  
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 10_000_0.00;
        obj1.isAvailable = true;

        Mobile obj2 = new Mobile();
        obj2.brand = "Motorola";
        obj2.price = 10_000.00;
        obj2.isAvailable = true;

        Mobile obj3 = new Mobile();
        obj3.brand = "Redmi";
        obj3.price = 1_000_0.00;
        obj3.isAvailable = false;


        obj1.show();
        obj3.show();
    }
}

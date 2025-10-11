class Mobile {
    String brand;
    int price;
    static String name;

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }
}

public class Main {
    public static void main(String args[]) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Redmi";
        obj1.price = 5;
        Mobile.name = "Smart";

        obj2.brand = "Vivo";
        obj2.price = 22;

        Mobile.show1(obj1); // Call the static method using the class name
    }
}

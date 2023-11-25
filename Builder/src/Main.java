import models.Computer;

//* Builder Pattern, a creational design pattern, is used to construct a complex object without directly instantiating the object.
public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Intel i7", "16GB", "1TB")
                .setKeyboard("Logitech")
                .setMouse("Logitech")
                .setMonitor("LG")
                .setPowerSupply("Corsair")
                .build();

        Computer computer2 = new Computer.Builder("Intel i7", "16GB", "1TB")
                .setKeyboard("Logitech")
                .setMouse("Logitech")
                .setMonitor("LG")
                .build();

        System.out.println(computer.toString());
        System.out.println(computer2.toString());
    }
}
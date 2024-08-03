package creational.builder;

public class Example {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("HDD: " + computer.getHDD());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
        System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled());
    }
}

package structural.facade;

public class Example {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        computer.startComputer();
        System.out.println();
        computer.shutdownComputer();
    }
}

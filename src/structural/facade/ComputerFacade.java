package structural.facade;

class CPU {
    public void start() {
        System.out.println("CPU starting...");
    }
    public void stop() {
        System.out.println("CPU stopping...");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory loading...");
    }
    public void unload() {
        System.out.println("Memory unloading...");
    }
}

class HardDrive {
    public void read() {
        System.out.println("Hard Drive reading...");
    }
    public void write() {
        System.out.println("Hard Drive writing...");
    }
}

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
    }

    public void shutdownComputer() {
        System.out.println("Shutting down computer...");
        hardDrive.write();
        memory.unload();
        cpu.stop();
    }
}

package structural.bridge;

// Implementor interface
interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

// Concrete Implementor 1
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

// Concrete Implementor 2
class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is now OFF.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}

// Abstraction
abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}

// Refined Abstraction
class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
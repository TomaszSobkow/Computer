package computer.usbDeviceses;

public class MemoryStick implements USBDevice{

    private String brand;

    public MemoryStick(String brand){
        this.brand = brand;
    }

    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public String getUsbDeviceName() {
        return null;
    }

    @Override
    public String toString() {
        String connected = connect()? "Connected "+ this.brand.toUpperCase():"Disconnected";
        return "\nMemoryStick " + connected;
    }
}

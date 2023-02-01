package computer.usbDeviceses;

public class Mouse implements USBDevice{

    private String brand;

    public Mouse(String brand){
        this.brand = brand;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Disconnected");
        return true;
    }

    @Override
    public String getUsbDeviceName() {
        return this.brand;
    }
}

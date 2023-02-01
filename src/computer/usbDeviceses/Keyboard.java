package computer.usbDeviceses;

public class Keyboard implements USBDevice{

    private String name;

    public Keyboard(String name){
        this.name = name;
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
        return this.name;
    }
}

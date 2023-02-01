package computer.usbDeviceses;

public class MemoryStick implements USBDevice{

    private String brand;
    private boolean ejected;

    public MemoryStick(String brand){

        this.brand = brand;
        this.ejected = false;
    }

    @Override
    public boolean connect() {
        System.out.println("Stick Connected!");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Eject stick first!");
            return false;
        }else {
            System.out.println("Stick Disconnected!");
            return true;
        }
    }

    @Override
    public String getUsbDeviceName() {
        return null;
    }

    public void eject(){
        System.out.println("Ejecting Memory Stick");
        ejected = true;
    }

    @Override
    public String toString() {
        String connected = connect()? "Connected "+ this.brand.toUpperCase():"Disconnected";
        return "\nMemoryStick " + connected;
    }
}

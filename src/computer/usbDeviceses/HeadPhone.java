package computer.usbDeviceses;

public class HeadPhone implements USBDevice{

    private String headPhoneName ;

    public HeadPhone(String headPhoneName) {
        this.headPhoneName = headPhoneName;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected");
        return true; }
    @Override
    public boolean disconnect() {
        System.out.println("Disconnected");
        return true; }
    @Override
    public String getUsbDeviceName() { return this.headPhoneName; }

    @Override
    public String toString() { return "HeadPhone: " + headPhoneName; }
}

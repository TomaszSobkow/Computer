package computer;

import computer.drive.Drive;
import computer.usbDeviceses.HeadPhone;
import computer.usbDeviceses.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive driveType;
    private HeadPhone headPhone;

    List<USBDevice> USBDeviceList = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.driveType = drive;
    }

    public Monitor getMonitor() { return monitor; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }

    public Drive getDriveType() { return driveType; }
    public void setDriveType(Drive driveType) { this.driveType = driveType; }

    public HeadPhone getHeadPhone() { return headPhone; }
    public void setHeadPhone(HeadPhone headPhone) { this.headPhone = headPhone; }

    public List<USBDevice> getUSBDeviceList() { return USBDeviceList;  }

    @Override
    public String toString() {
        String headPhoneAsString = (this.headPhone == null)? "Not Connected" : this.headPhone.getUsbDeviceName();

        String filesOnDrive;
        return "Computer" +
                  this.monitor +
                "\n\tDrive: " + this.driveType +
                "\n\tHeadphone: " + headPhoneAsString+
                "\n\tList of Files: "+ getDriveType().listFiles();
    }
}


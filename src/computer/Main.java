package computer;

import computer.drive.SSD_Drive;
import computer.student.Student;
import computer.usbDeviceses.HeadPhone;
import computer.usbDeviceses.Keyboard;
import computer.usbDeviceses.MemoryStick;
import computer.usbDeviceses.Mouse;

public class Main {


    public static void main(String[] args) {
        MemoryStick memoryStick = new MemoryStick("New STICK 3 GB");

        //Computer computer = new Computer(new Monitor(), new HDD_Drive());
        Computer computer = new Computer();
        //computer.drive().addFile(new File("File1"));
        computer.addNewUsbDevice(new MemoryStick("Sandisk 128GB"));
        computer.addNewUsbDevice(memoryStick);
        computer.addNewUsbDevice(new HeadPhone("Bose"));
        computer.addNewUsbDevice(new Mouse("Dell"));
        computer.addNewUsbDevice(new Keyboard("Logitech"));
        System.out.println(computer);
        computer.removeUsbDevice(memoryStick);
        memoryStick.eject();
        computer.removeUsbDevice(memoryStick);

        //1:44:46
        // on YouTube course https://www.youtube.com/watch?v=OvY0f-IWlos

    }
}

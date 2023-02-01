package computer;

import computer.drive.HDD_Drive;
import computer.drive.SSD_Drive;

public class Main {


    public static void main(String[] args) {

        Computer computer = new Computer(new Monitor(), new HDD_Drive() { });

        computer.getDriveType().addFile(new File("Learning programming"));
        computer.getDriveType().addFile(new File("Learning programming"));
        System.out.println(computer );

        computer.setDriveType(new SSD_Drive());
        computer.getDriveType().addFile(new File("New File"));
        computer.getDriveType().addFile(new File("New File2"));
        System.out.println(computer );

        //1:42:08
        // on YouTube course https://www.youtube.com/watch?v=OvY0f-IWlos

    }
}

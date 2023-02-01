package computer;

import computer.drive.SSD_Drive;
import computer.student.Student;

public class Main {


    public static void main(String[] args) {

        //Computer computer = new Computer(new Monitor(), new HDD_Drive());
        Computer computer = new Computer();


        computer.drive().addFile(new File("Learning programming"));
        computer.drive().addFile(new File(("0000000000")));
        System.out.println(computer );

        computer.setDrive(new SSD_Drive());
        computer.drive().addFile(new File("New File"));
        computer.drive().addFile(new File("New File2"));
        computer.getMonitor().HDReady();
        System.out.println(computer );

        System.out.println(new Student("Software development","Tomasz",48));

        //1:42:08
        // on YouTube course https://www.youtube.com/watch?v=OvY0f-IWlos

    }
}

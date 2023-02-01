package computer.drive;

import computer.File;

public interface Drive {

    void addFile(File file);
    String listFiles();
    File findFile(String fileName);

}

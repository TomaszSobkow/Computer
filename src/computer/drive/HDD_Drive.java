package computer.drive;

import computer.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDD_Drive implements Drive {

    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public String listFiles() {
    StringBuilder allFiles = new StringBuilder();
        for (File file: files) {
            allFiles.append(file.getName()+ ", ");
        }
    return allFiles.toString() ;
    }

    @Override
    public File findFile(String fileName) {
        Optional<File> findFile = files.stream()
                .filter(file -> file.getName().equals(fileName))
                .findFirst();

        return findFile.orElseThrow();
    }

    @Override
    public String toString() {
        return "HDD";

    }
}

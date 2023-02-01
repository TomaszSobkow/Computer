package computer.drive;

import computer.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSD_Drive implements Drive {
    Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
      files.put(file.getName(), file);
    }

    @Override
    public String  listFiles() {
        Collection<File>collectionsOfFiles = files.values();
        StringBuilder allFiles = new StringBuilder();

        for (File file: collectionsOfFiles) {
            allFiles.append(file.getName()+", ");
        }
        return allFiles.toString();
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }

    @Override
    public String toString() {
        return "SSD";
    }
}

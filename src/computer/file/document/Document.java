package computer.file.document;

import computer.file.File;
import computer.file.FileType;

public class Document implements File {
    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public FileType getType() {
        return null;
    }
}

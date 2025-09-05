package ccwc;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public FileReader() {
    }

    public boolean fileExist(String filename) {
        boolean result = Files.exists(Paths.get(filename));
        return result;
    }
}

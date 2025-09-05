package ccwc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTest {
    FileReader fileReader;
    @BeforeEach
    void setUp() {
        this.fileReader = new FileReader();
    }

    @Test
    @DisplayName("Obtener true en archivo inexistente")
    public void fileDoesExist() {

        String file = "src/main/java/resources/test.txt";
        boolean exist = fileReader.fileExist(file);

        assertTrue(exist);
    }

    @Test
    @DisplayName("Obtener false en archivo inexistente")
    public void fileDoesNotExist(){
        String file = "archivo inexistente.txt";
        boolean exist = fileReader.fileExist(file);

        assertFalse(exist);
    }

}

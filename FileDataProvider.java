package milosz.pakiet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider {
    @Override
    public String getDate() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/data.txt")));
        } catch (IOException e) {
            System.out.println("Błąd " + e.getMessage());
        }
        return "Błędne dane";
    }
}

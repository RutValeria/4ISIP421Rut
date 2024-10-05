import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task4_FileManager
{
    // Метод для чтения файла
    public String ReadFile(String FilePath) throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(FilePath)));
    }

    // Метод для записи в файл
    public void WriteFile(String Content, String FilePath) throws IOException
    {
        Files.write(Paths.get(FilePath), Content.getBytes());
    }

    // Метод для проверки существования файла
    public boolean ValidateInput(String FilePath)
    {
        return Files.exists(Paths.get(FilePath));
    }
}

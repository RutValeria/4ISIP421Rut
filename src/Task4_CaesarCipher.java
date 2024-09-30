import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task4_CaesarCipher
{
    public static void main(String[] args)
    {

    }
    // Алфавит
    private static final char[] Alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.',
            ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private static final int AlphabetSize = Alphabet.length;

    // Метод для сдвига символа на заданое количество позиций
    private char ShiftSymbol(char symbol, int key)
    {
        int index = FindCharIndex(symbol);
        if (index == -1)
        {
            return symbol; // Если символа нет в алфавите, возвращаем его без изменений
        }
        int ShiftIndex = (index + key) % AlphabetSize;
        if (ShiftIndex < 0)
        {
            ShiftIndex += AlphabetSize; // Убираем отрицательные индексы
        }
        return Alphabet[ShiftIndex];
    }

    // Метод для поиска индекса символа в алфавите
    private int FindCharIndex(char symbol)
    {
        for (int i = 0; i < AlphabetSize; i++)
        {
            if (Alphabet[i] == symbol)
            {
                return i;
            }
        }
        return -1; // Возвращаем -1, если символ не найден
    }

    // Метод для чтения файла
    private String ReadFile(String FilePath) throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(FilePath)));
    }

    // Метод для записи в файл
    private void WriteFile(String Content, String FilePath) throws IOException
    {
        Files.write(Paths.get(FilePath), Content.getBytes());
    }

    // Метод для проверки существования файла
    private boolean ValidateInput(String FilePath)
    {
        return Files.exists(Paths.get(FilePath));
    }

}

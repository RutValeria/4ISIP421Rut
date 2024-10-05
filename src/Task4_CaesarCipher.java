public class Task4_CaesarCipher
{
    // Алфавит
    private static final char[] Alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
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

    // Шифрование
    public String Encrypt(String text, int key)
    {
        StringBuilder EncryptText = new StringBuilder();
        for (char symbol : text.toCharArray())
        {
            EncryptText.append(ShiftSymbol(symbol, key));
        }
        return EncryptText.toString();
    }

    // Расшифровка
    public String Decrypt(String text, int key)
    {
        return Encrypt(text, -key); // Расшифрока, как шифрование с отрицательным ключом
    }

    // Brute force
    public void BruteForce(String text)
    {
        for (int key = 1; key < AlphabetSize; key++)
        {
            StringBuilder DecryptText = new StringBuilder();
            for (char symbol : text.toCharArray())
            {
                DecryptText.append(ShiftSymbol(symbol, -key));
            }
            System.out.println("Ключ: " + key + " Текст: " + DecryptText);
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Task4_Menu
{
    private Task4_CaesarCipher cipher = new Task4_CaesarCipher();
    private Task4_FileManager fileManager = new Task4_FileManager();
    private Scanner scanner = new Scanner(System.in);

    // Главное меню
    public void Start()
    {
        while (true)
        {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Шифрование");
            System.out.println("2 - Расшифровка с ключом");
            System.out.println("3 - Brute force");
            System.out.println("0 - Выход");

            int option = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (option == 0)
            {
                System.out.println("Выход из программы.");
                break;
            }
            HandleOption(option);
        }
    }

    // Обработка выбора пользователя
    private void HandleOption(int option)
    {
        System.out.println("Введите путь к входному файлу: ");
        String InputFile = scanner.nextLine();

        System.out.println("введите путь к выходному файлу: ");
        String OutputFile = scanner.nextLine();

        if (!fileManager.ValidateInput(InputFile))
        {
            System.out.println("Файл не найден!");
            return;
        }

        try
        {
            String content = fileManager.ReadFile(InputFile);

            if (option == 1 || option == 2)
            {
                System.out.println("Введите ключ: ");
                int key = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                String Result;
                if (option == 1)
                {
                    Result = cipher.Encrypt(content, key);
                }
                else
                {
                    Result = cipher.Decrypt(content, key);
                }

                fileManager.WriteFile(Result, OutputFile);
                System.out.println("Операция завершена!");
            }
            else if (option == 3)
            {
                cipher.BruteForce(content);
            }
            else
            {
                System.out.println("Неверный выбор.");
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}

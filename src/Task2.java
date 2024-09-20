import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Task2
{
    public static void main(String[] args)
    {
//        Для 1 задачи

        try
        {
            System.out.println(max(10, 20));
            System.out.println(max(10, 10));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

//        Для 2 задачи

        try
        {
            System.out.println(divide(10, 2));
            System.out.println(divide(10, 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        //    Для 3 задачи

        try
        {
            System.out.println(convertToInt("123"));
            System.out.println(convertToInt("abc"));
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 4 задачи

        try
        {
            checkAge(-1);
            checkAge(0);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 5 задачи

        try
        {
            System.out.println(sqrt(25));
            System.out.println(sqrt(-9));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 6 задачи

        try
        {
            System.out.println(factorial(5));
            System.out.println(factorial(-3));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 7 задачи

        try
        {
            checkForZeros(new int[]{1, 2, 3, 4});
            checkForZeros(new int[]{1, 0, 3});
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        //Для 8 задачи

        try
        {
            System.out.println(power(2, 3));
            System.out.println(power(2, -1));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        //Для 9 задачи

        try
        {
            System.out.println(trimString("Hello, world!", 5));
            System.out.println(trimString("Hello", 10));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 10 задачи

        try
        {
            System.out.println(findElement(new int[]{1, 2, 3, 4}, 3));
            System.out.println(findElement(new int[]{1, 2, 3, 4}, 5));
        }
        catch (NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 11 задачи

        try
        {
            System.out.println(toBinary(10));
            System.out.println(toBinary(-10));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 12 задачи

        try
        {
            System.out.println(isDivisible(10, 2));
            System.out.println(isDivisible(10, 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 13 задачи

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        try
        {
            System.out.println(getElement(list, 1));
            System.out.println(getElement(list, 2));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 14 задачи

        try
        {
            checkPasswordStrength("password123");
            checkPasswordStrength("short");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 15 задачи

        try
        {
            checkDate("15.09.2024");
            checkDate("2024-09-15");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 16 задачи

        try
        {
            System.out.println(concatenateStrings("Hello, ", "world!"));
            System.out.println(concatenateStrings("Hello", null));
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 17 задачи

        try
        {
            System.out.println(modulus(10, 3));
            System.out.println(modulus(10, 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 18 задачи

        try
        {
            System.out.println(sqrt1(16));
            System.out.println(sqrt1(-16));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 19 задачи

        try
        {
            System.out.println(celsiusToFahrenheit(25));
            System.out.println(celsiusToFahrenheit(-300));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Для 20 задачи

        try
        {
            checkString("Hello");
            checkString("");
            checkString(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }





//        1. Функция для нахождения максимума
//        Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.

    public static int max(int a, int b)
    {
        if (a == b)
        {
            // throw new — оператор, который создаёт и выбрасывает новое исключение
            throw new IllegalArgumentException("Числа равны!");
        }
        return Math.max(a, b);
    }


//        2. Калькулятор деления
//        Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.

    public static double divide(double a, double b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }


//        3. Конвертер строк в числа
//        Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.

    public static int convertToInt(String str)
    {
        try
        {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            throw new NumberFormatException("Строка не может быть конвертирована!");
        }
    }


//        4. Проверка возраста
//        Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.

    public static void checkAge(int age)
    {
        if (age < 0 || age > 150)
        {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150!");
        }
        System.out.println("Возраст корректен");
    }


//        5. Нахождение корня
//        Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.

    public static double sqrt(double number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Math.sqrt(number);
    }


//        6. Факториал
//        Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.

    public static long factorial(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        long result = 1;
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }


//        7. Проверка массива на нули
//        Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.

    public static void checkForZeros(int[] array)
    {
        for (int num : array)
        {
            if (num == 0)
            {
                throw new IllegalArgumentException("Массив содержит ноль!");
            }
        }
    }


//        8. Калькулятор возведения в степень
//        Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.

    public static double power(double base, int exponent)
    {
        if (exponent < 0)
        {
            throw new IllegalArgumentException("Степень не может быть отрицательной!");
        }
        return Math.pow(base, exponent);
    }


//        9. Обрезка строки
//        Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.

    public static String trimString(String str, int length)
    {
        if (length > str.length())
        {
            throw new IllegalArgumentException("Длина обрезки больше длины строки!");
        }
        return str.substring(0, length);
    }


//        10. Поиск элемента в массиве
//        Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.

    public static int findElement(int[] array, int element)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == element)
            {
                return i;
            }
        }
        throw new NoSuchElementException("Элемент не найден в массиве!");
    }


//        11. Конвертация в двоичную систему
//        Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.

    public static String toBinary(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Integer.toBinaryString(number);
    }


//        12. Проверка делимости
//        Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.

    public static boolean isDivisible(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return dividend % divisor == 0;
    }


//        13. Чтение элемента списка
//        Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.

    public static <T> T getElement(List<T> list, int index)
    {
        if (index < 0 || index >= list.size())
        {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
        }
        return list.get(index);
    }


//        14. Парольная проверка
//        Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.

    public static void checkPasswordStrength(String password)
    {
        if (password.length() < 8)
        {
            throw new IllegalArgumentException("Пароль слишком короткий. Должно быть не менее 8 символов!");
        }
    }


//        15. Проверка даты
//        Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.

    public static void checkDate(String dateStr)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try
        {
            LocalDate.parse(dateStr, formatter);
        }
        catch (DateTimeException e)
        {
            throw new IllegalArgumentException("Некорректная дата!");
        }
    }


//        16. Конкатенация строк
//        Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.

    public static String concatenateStrings(String str1, String str2)
    {
        if (str1 == null || str2 == null)
        {
            throw new NullPointerException("Одна из строк равна null!");
        }
        return str1 + str2;
    }


//        17. Остаток от деления
//        Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.

    public static int modulus(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return dividend % divisor;
    }


//        18. Квадратный корень
//        Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.

    public static double sqrt1(double number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        return Math.sqrt(number);
    }


//        19. Конвертер температуры
//        Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.

    public static double celsiusToFahrenheit(double celsius)
    {
        if (celsius < -273.15)
        {  // Абсолютный ноль в Цельсиях
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля!");
        }
        return celsius * 9 / 5 + 32;
    }


//        20. Проверка строки на пустоту
//        Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.

    public static void checkString(String str)
    {
        if (str == null || str.isEmpty())
        {
            throw new IllegalArgumentException("Строка пустая или равна null!");
        }
    }
}

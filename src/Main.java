import java.util.Scanner;
public class Main
{
    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // числа меньше или равные 1 не являются простыми
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // число делится на i, значит, оно не простое
            }
        }
        return true; // число простое
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Задача 1: Четное или нечетное число
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.

//        System.out.print("Введите число: ");
//        int num = in.nextInt();
//        if (num % 2 == 0)
//        {
//            System.out.println("Число четное");
//        }
//        else
//        {
//            System.out.println("Число нечетное");
//        }


//        Задача 2: Минимальное из трех чисел
//        Условие:
//        Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.

//        System.out.print("Введите число a: ");
//        int a = in.nextInt();
//        System.out.print("Введите число b: ");
//        int b = in.nextInt();
//        System.out.print("Введите число c: ");
//        int c = in.nextInt();
//        int min = a; // Представим, что a минимальное
//        if (b < min)
//        {
//            min = b; // b будет min, если b будет меньше min
//        }
//        if (c < min)
//        {
//            min = c; // c будет min, если c будет меньше min
//        }
//        System.out.println("Минимальное число: " + min);


//        Задача 3: Таблица умножения
//        Условие:
//        Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).

//        for (int i = 1; i < 11; i++)
//        {
//            //%d — это спецификатор формата для целых чисел
//            //%n — это спецификатор для перехода на новую строку
//            System.out.printf("%d * 5 = %d%n", i, i * 5);
//        }


//        Задача 4: Сумма чисел от 1 до N
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

//        System.out.print("Введите число: ");
//        int N = in.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++)
//        {
//            sum += i;
//        }
//        System.out.printf("Сумма всех чисел от 1 до %d: %d", N, sum);


//        Задача 5: Число Фибоначчи
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

//        System.out.print("Введите число: ");
//        int N = in.nextInt();
//        int a = 0, b = 1;
//        System.out.print("Первые " + N + " чисел Фибоначчи: ");
//        for (int i = 0; i < N; i++)
//        {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//        System.out.println();


//        Задача 6: Проверка простого числа
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).

//        System.out.print("Введите число: ");
//        int number = in.nextInt();
//        if (isPrime(number)) {
//            System.out.println(number + " является простым числом.");
//        } else {
//            System.out.println(number + " не является простым числом.");
//        }


//        Задача 7: Обратный порядок чисел
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.

//        System.out.print("Введите число: ");
//        int N = in.nextInt();
//        System.out.println("Числа от " + N + " до 1 в обратном порядке: ");
//        for (int i = N; i >= 1; i--)
//        {
//            System.out.print(i + " ");
//        }
//        System.out.println();


//        Задача 8: Сумма четных чисел
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).

//        System.out.print("Введите число A: ");
//        int A = in.nextInt();
//        System.out.print("Введите число B: ");
//        int B = in.nextInt();
//        int sum = 0;
//        for (int i = A; i <= B; i++)
//        {
//            if (i % 2 == 0)
//            {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма всех четных чисел от " + A + " до " + B + ": " + sum);


//        Задача 9: Реверс строки
//        Условие:
//        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

//        System.out.print("Введите строку: ");
//        String stroka = in.nextLine();
//        String revers = new StringBuilder(stroka).reverse().toString();
//        System.out.println("Строка в обратном порядке: " + revers);


//        Задача 10: Количество цифр в числе
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        //Преобразовываем число в строку и считаем
//        // valueOf() - преобразует в нужный тип данных
//        // Math.abs() - мы получаем модуль числа
//        // length() – возвращает длину строки
//        int countnum = String.valueOf(Math.abs(num)).length();
//        System.out.println("Количество цифр в числе: " + countnum);


//        Задача 11: Факториал числа
//        Условие:
//        Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).

//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        long fact = 1;
//        for (int i = 2; i <= num; i++)
//        {
//            fact *= i;
//        }
//        System.out.println("Факториал числа " + num + " равен: " + fact);


//        Задача 12: Сумма цифр числа
//        Условие:
//        Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.

//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        int sum = 0;
//        num = Math.abs(num);
//        while (num > 0)
//        {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("Сумма всех цифр числа: " + sum);


//        Задача 13: Палиндром
//        Условие:
//        Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).

//        System.out.print("Введите строку: ");
//        String stroka = in.nextLine();
//        // Приводим строку к единому регистру и удаляем пробелы
//        // replaceAll() – метод позволяет заменить слово в строке
//        // \\s+ - будет соответствовать одному или нескольким символам пробела
//        // toLowerCase() - преобразует все символы в данной строки в нижний регистр
//        String normal = stroka.replaceAll("\\s+", "").toLowerCase();
//        boolean isPalindrome = true;
//        int length = normal.length();
//        for (int i = 0; i < length / 2; i++)
//        {
//            // charAt() - возвращает символ, расположенный по указанному индексу строки
//            if (normal.charAt(i) != normal.charAt(length - i - 1))
//            {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome)
//        {
//            System.out.println("Строка является палиндромом");
//        }
//        else
//        {
//            System.out.println("Строка не является палиндромом");
//        }


//        Задача 14: Найти максимальное число в массиве
//        Условие:
//        Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.

//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < size; i++)
//        {
//            if (array[i] > max)
//            {
//                max = array[i];
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);


//        Задача 15: Сумма всех элементов массива
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.

//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < size; i++)
//        {
//            sum += array[i];
//        }
//        System.out.println("Сумма всех элементов массива: " + sum);


//        Задача 16: Количество положительных и отрицательных чисел
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.

//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        int posicount = 0;
//        int negacount = 0;
//        for (int i = 0; i < size; i++)
//        {
//            if (array[i] > 0)
//            {
//                posicount++;
//            }
//            else if (array[i] < 0)
//            {
//                negacount++;
//            }
//        }
//        System.out.println("Количество положительных чисел в массиве: " + posicount);
//        System.out.println("Количество отрицательных чисел в массиве: " + negacount);


//        Задача 17: Простые числа в диапазоне
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).

//        System.out.print("Введите число A: ");
//        int A = in.nextInt();
//        System.out.print("Введите число B: ");
//        int B = in.nextInt();
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++)
//        {
//            if (isPrime(i))
//            {
//                System.out.print(i + " ");
//            }
//        }


//        Задача 18: Подсчет гласных и согласных в строке
//        Условие:
//        Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.

//        System.out.print("Введите строку: ");
//        String input = in.nextLine().toLowerCase();
//        int vowelscount = 0;
//        int consonantscount = 0;
//        // toCharArray() - преобразует данную строку в новый массив символов
//        for (char ch : input.toCharArray())
//        {
//            if (isVowel(ch))
//            {
//                vowelscount++;
//            }
//            else if (isConsonants(ch))
//            {
//              consonantscount++;
//            }
//        }
//        System.out.println("Количество гласных букв в строке: " + vowelscount);
//        System.out.println("Количество согласных букв в строке: " + consonantscount);
//    }
//    public static boolean isVowel(char ch)
//    {
//        return "аеёиоуыэюя".indexOf(ch) != -1;
//    }
//    public static boolean isConsonants(char ch)
//    {
//        // Проверяем, является ли символ буквой, и если да, то проверяем, является ли согласной
//        return "abcdefghijklmnopqrstuvwxyzабвгдежзийклмнопрстуфхцчшщъыьэюя".indexOf(ch) != -1 && !isVowel(ch);
//    }


//        Задача 19: Перестановка слов в строке
//        Условие:
//        Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.

//        System.out.print("Введите строку из нескольких слов: ");
//        String input = in.nextLine().toLowerCase();
//        // split() - разделяет данную строку вокруг данного регулярного выражения
//        String [] words = input.split("\\s+");
//        System.out.println("Слова в обратном порядке: ");
//        for (int i = words.length - 1; i >= 0; i--)
//        {
//            System.out.print(words[i] + " ");
//        }


//        Задача 20: Число Армстронга
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).

//        System.out.print("Введите целое число: ");
//        int number = in.nextInt();
//        // Сохраним исходное число для сравнения
//        int originalNumber = number;
//        int sum = 0;
//        // Вычисляем количество цифр
//        int digitsCount = String.valueOf(number).length();
//        // Вычисляем сумму цифр, возведенных в степень количества цифр
//        while (number > 0)
//        {
//            int digit = number % 10; // Получаем последнюю цифру
//            // Math.pow() - возводит значение первого аргумента в степень второго аргумента, тем самым позволяет осуществить быстрое возведение в степень любых значений
//            sum += Math.pow(digit, digitsCount); // Добавляем степень
//            number /= 10; // Убираем последнюю цифру
//        }
//        // Проверяем, является ли число числом Армстронга
//        if (sum == originalNumber)
//        {
//            System.out.println(originalNumber + " является числом Армстронга.");
//        }
//        else
//        {
//            System.out.println(originalNumber + " не является числом Армстронга.");
//        }
    }
}
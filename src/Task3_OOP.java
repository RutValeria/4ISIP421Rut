import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Task3_OOP
{
    public static void main(String[] args)
    {
//        Для 1 задачи

//        Person person = new Person("Екатерина", 18, "Женский");
//        person.displayInfo();
//        person.increaseAge();
//        person.displayInfo();
//        person.setName("Валерия");
//        person.displayInfo();

//        Для 2 задачи

//        Worker worker = new Worker("Валерия", 19, "Женский", 80000);
//        worker.displayInfo();
//        Manager manager = new Manager("Екатерина", 18, "Женский", 50000, 5);
//        manager.displayInfo();

//        Для 3 задачи

//        Animal[] animals = { new Dog(), new Cat(), new Cow() };
//        for (Animal animal : animals)
//        {
//            animal.makeSound();
//        }

//        Для 4 задачи

//        Transport car = new Car();
//        Transport bike = new Bike();
//        car.move();
//        bike.move();

//        Для 5 задачи

//        Library library = new Library();
//        Book book1 = new Book("Первая книга", "Первый автор", 2001);
//        Book book2 = new Book("Вторая книга", "Первый автор", 2005);
//        library.addBook(book1);
//        library.addBook(book2);
//        System.out.println("Книги первого автора:");
//        library.searchByAuthor("Первый автор");
//        System.out.println("Книги выпущенные в 2005:");
//        library.searchByYear(2005);

//        Для 6 задачи

//        BankAccount account = new BankAccount("123456789", 1000.00);
//        // Пополнение счета
//        account.deposit(500.00);
//        // Снятие средств
//        account.withdraw(200.00);
//        // Попытка снять больше средств, чем на счету
//        account.withdraw(2000.00);
//        // Проверка баланса
//        System.out.println("Баланс: " + account.getBalance());

//        Для 7 задачи

//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//        Counter c3 = new Counter();
//        System.out.println("Количество созданных объектов: " + Counter.getObjectCount());

//        Для 8 задачи

//        Shape circle = new Circle(5.0);
//        Shape rectangle = new Rectangle(4.0, 6.0);
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

//        Для 9 задачи

//        Animal fish = new Fish();
//        Animal bird = new Bird();
//        Animal dog = new Dog();
//        fish.move();
//        bird.move();
//        dog.move();

//        Для 10 задачи

//        University university = new University();
//        Student s1 = new Student("Алиса", "ПКС1", 4.5);
//        Student s2 = new Student("Макс", "ПКС2", 3.7);
//        Student s3 = new Student("Анна", "ПКС1", 4.8);
//        university.addStudent(s1);
//        university.addStudent(s2);
//        university.addStudent(s3);
//        System.out.println("Все студенты:");
//        university.displayAllStudents();
//        System.out.println("\nСтуденты отсортированы по имени:");
//        university.sortByName();
//        university.displayAllStudents();
//        System.out.println("\nСтуденты с оценкой >= 4.0:");
//        university.filterByGrade(4.0);
    }
}
//        1. Класс "Человек"
//        Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.
//class Person
//{
//    private String name;
//    private int age;
//    private String gender;
//    public Person(String name, int age, String gender)
//    {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//    public void displayInfo()
//    {
//        System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
//    }
//    public void increaseAge()
//    {
//        this.age++;
//    }
//    public void setName(String newName)
//    {
//        this.name = newName;
//    }
//}

//        2. Наследование: Класс "Работник" и "Менеджер"
//        Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.
//    class Worker extends Person
//    {
//        private double salary;
//        public Worker(String name, int age, String gender, double salary)
//        {
//            super(name, age, gender);
//            this.salary = salary;
//        }
//        public void displayInfo()
//        {
//            super.displayInfo();
//            System.out.println("Зарплата: " + salary);
//        }
//    }
//    class Manager extends Worker
//    {
//        private int numberOfSubordinates;
//        public Manager(String name, int age, String gender, double salary, int numberOfSubordinates)
//        {
//            super(name, age, gender, salary);
//            this.numberOfSubordinates = numberOfSubordinates;
//        }
//        public void displayInfo()
//        {
//            super.displayInfo();
//            System.out.println("Количество подчиненных: " + numberOfSubordinates);
//        }
//    }

//        3. Полиморфизм: Животные
//        Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.
//interface Animal
//{
//    void makeSound();
//}
//class Dog implements Animal
//{
//    public void makeSound()
//    {
//        System.out.println("Гав!");
//    }
//}
//class Cat implements Animal
//{
//    public void makeSound()
//    {
//        System.out.println("Мяу!");
//    }
//}
//class Cow implements Animal
//{
//    public void makeSound()
//    {
//        System.out.println("Му!");
//    }
//}

//        4. Абстрактный класс "Транспорт"
//        Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
//abstract class Transport
//{
//    public abstract void move();
//}
//class Car extends Transport
//{
//    public void move()
//    {
//        System.out.println("Автомобиль движется по дороге.");
//    }
//}
//class Bike extends Transport
//{
//    public void move()
//    {
//        System.out.println("Велосипед движется по дороге.");
//    }
//}

//        5. Класс "Книга" и "Библиотека"
//        Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.
//class Book
//{
//    private String title;
//    private String author;
//    private int year;
//    public Book(String title, String author, int year)
//    {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//    public String getAuthor()
//    {
//        return author;
//    }
//    public int getYear()
//    {
//        return year;
//    }
//    public String getTitle()
//    {
//        return title;
//    }
//    public void displayInfo()
//    {
//        System.out.println("Название книги: " + title + ", Автор: " + author + ", Год выпуска книги: " + year);
//    }
//}
//class Library
//{
//    private ArrayList<Book> books;
//    public Library()
//    {
//        books = new ArrayList<>();
//    }
//    public void addBook(Book book)
//    {
//        books.add(book);
//    }
//    public void searchByAuthor(String author)
//    {
//        for (Book book : books)
//        {
//            if (book.getAuthor().equals(author))
//            {
//                book.displayInfo();
//            }
//        }
//    }
//    public void searchByYear(int year)
//    {
//        for (Book book : books)
//        {
//            if (book.getYear() == year)
//            {
//                book.displayInfo();
//            }
//        }
//    }
//}

//        6. Инкапсуляция: Банк
//        Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.
//class BankAccount
//{
//    private String accountNumber;
//    private double balance;
//    public BankAccount(String accountNumber, double initialBalance)
//    {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//    public void deposit(double amount)
//    {
//        if (amount > 0)
//        {
//            balance += amount;
//            System.out.println("Депозит успешен. Новый баланс: " + balance);
//        }
//        else
//        {
//            System.out.println("Неверная сумма депозита.");
//        }
//    }
//    public void withdraw(double amount)
//    {
//        if (amount > 0 && amount <= balance)
//        {
//            balance -= amount;
//            System.out.println("Вывод успешен. Новый баланс: " + balance);
//        }
//        else
//        {
//            System.out.println("Неверная сумма вывода или недостаточно средств.");
//        }
//    }
//    public double getBalance()
//    {
//        return balance;
//    }
//    public String getAccountNumber()
//    {
//        return accountNumber;
//    }
//}

//        7. Счетчик объектов
//        Создайте класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
//class Counter
//{
//    private static int objectCount = 0;
//    public Counter()
//    {
//        objectCount++;
//    }
//    public static int getObjectCount()
//    {
//        return objectCount;
//    }
//}

//        8. Площадь фигур
//        Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.
//abstract class Shape
//{
//    public abstract double getArea();
//}
//class Circle extends Shape
//{
//    private double radius;
//    public Circle(double radius)
//    {
//        this.radius = radius;
//    }
//    @Override
//    public double getArea()
//    {
//        return Math.PI * radius * radius;
//    }
//}
//class Rectangle extends Shape
//{
//    private double width;
//    private double height;
//    public Rectangle(double width, double height)
//    {
//        this.width = width;
//        this.height = height;
//    }
//    @Override
//    public double getArea()
//    {
//        return width * height;
//    }
//}

//        9. Наследование: Животные и их движения
//        Создайте класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).
//class Animal
//{
//    public void move()
//    {
//        System.out.println("Животное движется.");
//    }
//}
//class Fish extends Animal
//{
//    @Override
//    public void move()
//    {
//        System.out.println("Рыба плавает.");
//    }
//}
//class Bird extends Animal
//{
//    @Override
//    public void move()
//    {
//        System.out.println("Птица летит.");
//    }
//}
//class Dog extends Animal
//{
//    @Override
//    public void move()
//    {
//        System.out.println("Собака бежит.");
//    }
//}

//        10. Работа с коллекциями: Университет
//        Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.
//class Student
//{
//    private String name;
//    private String group;
//    private double grade;
//    public Student(String name, String group, double grade)
//    {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public String getGroup()
//    {
//        return group;
//    }
//    public double getGrade()
//    {
//        return grade;
//    }
//    public void displayInfo()
//    {
//        System.out.println("Имя: " + name + ", Группа: " + group + ", Оценка: " + grade);
//    }
//}
//class University
//{
//    private ArrayList<Student> students;
//    public University()
//    {
//        students = new ArrayList<>();
//    }
//    public void addStudent(Student student)
//    {
//        students.add(student);
//    }
//    public void sortByName()
//    {
//        Collections.sort(students, Comparator.comparing(Student::getName));
//    }
//    public void filterByGrade(double minGrade)
//    {
//        for (Student student : students)
//        {
//            if (student.getGrade() >= minGrade)
//            {
//                student.displayInfo();
//            }
//        }
//    }
//    public void displayAllStudents()
//    {
//        for (Student student : students)
//        {
//            student.displayInfo();
//        }
//    }
//}

//        11. Класс "Магазин"
//        Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.
//
//        12. Интерфейс "Платежная система"
//        Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
//
//        13. Генерация уникальных идентификаторов
//        Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
//
//        14. Класс "Точка" и "Прямоугольник"
//        Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.
//
//        15. Комплексные числа
//        Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.
//
//        16. Перегрузка операторов: Матрица
//        Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
//
//        17. Создание игры с использованием ООП
//        Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
//
//        18. Автоматизированная система заказов
//        Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
//
//        19. Наследование: Электроника
//        Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.

//        20. Игра "Крестики-нолики"
//        Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.


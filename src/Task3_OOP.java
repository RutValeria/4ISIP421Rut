import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Task3_OOP
{
    public static void main(String[] args) {
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

//        Для 11 задачи

//        Store store = new Store();
//        Product product1 = new Product("Яблоко", 100, 1);
//        Product product2 = new Product("Банан", 200, 2);
//        store.addProduct(product1);
//        store.addProduct(product2);
//        store.searchProduct("Яблоко").displayProduct();
//        store.removeProduct("Банан");
//        store.searchProduct("Банан").displayProduct();

//        Для 12 задачи

//        PaymentSystem creditCard = new CreditCard();
//        PaymentSystem paypal = new PayPal();
//        creditCard.pay(100.0);
//        paypal.refund(50.0);

//        Для 13 задачи

//        UniqueID obj1 = new UniqueID();
//        UniqueID obj2 = new UniqueID();
//        System.out.println("Идентификатор объекта 1: " + obj1.getId());
//        System.out.println("Идентификатор объекта 2: " + obj2.getId());
//        System.out.println("Текущий счетчик идентификаторов: " + UniqueID.getCurrentID());

//        Для 14 задачи

//        Point topLeft = new Point(0, 5);
//        Point bottomRight = new Point(5, 0);
//        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

//        Для 15 задачи

//        ComplexNumber num1 = new ComplexNumber(3, 4);
//        ComplexNumber num2 = new ComplexNumber(1, 2);
//        ComplexNumber sum = num1.add(num2);
//        ComplexNumber difference = num1.subtract(num2);
//        ComplexNumber product = num1.multiply(num2);
//        ComplexNumber quotient = num1.divide(num2);
//        System.out.println("Сложение: ");
//        sum.display();
//        System.out.println("Вычитание: ");
//        difference.display();
//        System.out.println("Умножение: ");
//        product.display();
//        System.out.println("Деление: ");
//        quotient.display();

//        Для 16 задачи

//        Matrix m1 = new Matrix(2, 2);
//        Matrix m2 = new Matrix(2, 2);
//        m1.setElement(0, 0, 1);
//        m1.setElement(0, 1, 2);
//        m1.setElement(1, 0, 3);
//        m1.setElement(1, 1, 4);
//        m2.setElement(0, 0, 5);
//        m2.setElement(0, 1, 6);
//        m2.setElement(1, 0, 7);
//        m2.setElement(1, 1, 8);
//        System.out.println("Матрица 1:");
//        m1.display();
//        System.out.println("Матрица 2:");
//        m2.display();
//        Matrix sum = m1.add(m2);
//        System.out.println("Сложение матриц:");
//        sum.display();
//        Matrix product = m1.multiply(m2);
//        System.out.println("Умножение матриц:");
//        product.display();

//        Для 17 задачи

//        Weapon sword = new Weapon("Меч", 10);
//        Player player = new Player("Герой", 100, sword);
//        Enemy enemy = new Enemy("Гоблин", 30);
//        player.attack(enemy);
//        enemy.takeDamage(10);
//        if (!enemy.isAlive()) {
//            System.out.println(enemy.getName() + " побежден!");
//        }

//        Для 18 задачи

//        Customer customer = new Customer("Алиса");
//        Product apple = new Product("Яблоко", 0.5);
//        Product banana = new Product("Банан", 0.7);
//        Order order = new Order(customer);
//        order.addProduct(apple);
//        order.addProduct(banana);
//        order.displayOrder();

//        Для 19 задачи

//        Smartphone phone = new Smartphone("Samsung");
//        Laptop laptop = new Laptop("Dell");
//        phone.turnOn();
//        phone.takePhoto();
//        phone.turnOff();
//        laptop.turnOn();
//        laptop.code();
//        laptop.turnOff();

//        Для 20 задачи

//        Game game = new Game();
//        game.playGame();

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
//class Product
//{
//    private String name;
//    private double price;
//    private int quantity;
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public double getPrice()
//    {
//        return price;
//    }
//    public int getQuantity()
//    {
//        return quantity;
//    }
//    public void displayProduct()
//    {
//        System.out.println("Имя: " + name + ", Цена: " + price + ", Количество: " + quantity);
//    }
//}
//class Store
//{
//    private ArrayList<Product> products;
//    public Store()
//    {
//        products = new ArrayList<>();
//    }
//    public void addProduct(Product product)
//    {
//        products.add(product);
//        System.out.println("Добавленный товар: " + product.getName());
//    }
//    public void removeProduct(String name)
//    {
//        products.removeIf(product -> product.getName().equals(name));
//        System.out.println("Удаленный товар: " + name);
//    }
//    public Product searchProduct(String name)
//    {
//        for (Product product : products)
//        {
//            if (product.getName().equals(name))
//            {
//                return product;
//            }
//        }
//        System.out.println("Товар не найден: " + name);
//        return null;
//    }
//}

//        12. Интерфейс "Платежная система"
//        Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
//interface PaymentSystem
//{
//    void pay(double amount);
//    void refund(double amount);
//}
//class CreditCard implements PaymentSystem
//{
//    @Override
//    public void pay(double amount)
//    {
//        System.out.println("Оплачено " + amount + " с помощью кредитной карты.");
//    }
//    @Override
//    public void refund(double amount)
//    {
//        System.out.println("Возврат " + amount + " на кредитную карту.");
//    }
//}
//class PayPal implements PaymentSystem
//{
//    @Override
//    public void pay(double amount)
//    {
//        System.out.println("Оплачено " + amount + " с помощью PayPal.");
//    }
//    @Override
//    public void refund(double amount)
//    {
//        System.out.println("Возврат " + amount + " на PayPal.");
//    }
//}

//        13. Генерация уникальных идентификаторов
//        Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
//class UniqueID
//{
//    private static int idCounter = 0;
//    private int id;
//    public UniqueID()
//    {
//        this.id = ++idCounter;
//    }
//    public int getId()
//    {
//        return id;
//    }
//    public static int getCurrentID()
//    {
//        return idCounter;
//    }
//}

//        14. Класс "Точка" и "Прямоугольник"
//        Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.
//class Point
//{
//    private double x;
//    private double y;
//    public Point(double x, double y)
//    {
//        this.x = x;
//        this.y = y;
//    }
//    public double getX()
//    {
//        return x;
//    }
//    public double getY()
//    {
//        return y;
//    }
//}
//class Rectangle
//{
//    private Point topLeft;
//    private Point bottomRight;
//    public Rectangle(Point topLeft, Point bottomRight)
//    {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//    public double getArea()
//    {
//        double width = Math.abs(bottomRight.getX() - topLeft.getX());
//        double height = Math.abs(topLeft.getY() - bottomRight.getY());
//        return width * height;
//    }
//}

//        15. Комплексные числа
//        Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.
//class ComplexNumber
//{
//    private double real;
//    private double imaginary;
//    public ComplexNumber(double real, double imaginary)
//    {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//    public ComplexNumber add(ComplexNumber other)
//    {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
//    public ComplexNumber subtract(ComplexNumber other)
//    {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }
//    public ComplexNumber multiply(ComplexNumber other)
//    {
//        double realPart = this.real * other.real - this.imaginary * other.imaginary;
//        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//    public ComplexNumber divide(ComplexNumber other)
//    {
//        double denominator = other.real * other.real + other.imaginary * other.imaginary;
//        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//    public void display()
//    {
//        System.out.println(real + " + " + imaginary + "i");
//    }
//}

//        16. Перегрузка операторов: Матрица
//        Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
//class Matrix
//{
//    private int[][] data;
//    private int rows, cols;
//    public Matrix(int rows, int cols)
//    {
//        this.rows = rows;
//        this.cols = cols;
//        data = new int[rows][cols];
//    }
//    public void setElement(int row, int col, int value)
//    {
//        data[row][col] = value;
//    }
//    public Matrix add(Matrix other)
//    {
//        if (this.rows != other.rows || this.cols != other.cols)
//        {
//            throw new IllegalArgumentException("Размеры матрицы должны совпадать для сложения.");
//        }
//        Matrix result = new Matrix(this.rows, this.cols);
//        for (int i = 0; i < rows; i++)
//        {
//            for (int j = 0; j < cols; j++)
//            {
//                result.data[i][j] = this.data[i][j] + other.data[i][j];
//            }
//        }
//        return result;
//    }
//    public Matrix multiply(Matrix other)
//    {
//        if (this.cols != other.rows)
//        {
//            throw new IllegalArgumentException("Размеры матрицы должны совпадать при умножении.");
//        }
//        Matrix result = new Matrix(this.rows, other.cols);
//        for (int i = 0; i < this.rows; i++)
//        {
//            for (int j = 0; j < other.cols; j++)
//            {
//                for (int k = 0; k < this.cols; k++)
//                {
//                    result.data[i][j] += this.data[i][k] * other.data[k][j];
//                }
//            }
//        }
//        return result;
//    }
//    public void display()
//    {
//        for (int i = 0; i < rows; i++)
//        {
//            for (int j = 0; j < cols; j++)
//            {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//        17. Создание игры с использованием ООП
//        Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
//class Player
//{
//    private String name;
//    private int health;
//    private Weapon weapon;
//    public Player(String name, int health, Weapon weapon)
//    {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }
//    public void attack(Enemy enemy)
//    {
//        enemy.takeDamage(weapon.getDamage());
//        System.out.println(name + " нападает " + enemy.getName() + " с " + weapon.getName());
//    }
//    public void takeDamage(int damage)
//    {
//        health -= damage;
//        System.out.println(name + " получил " + damage + " урона. Здоровье: " + health);
//    }
//    public boolean isAlive()
//    {
//        return health > 0;
//    }
//}
//class Enemy
//{
//    private String name;
//    private int health;
//    public Enemy(String name, int health)
//    {
//        this.name = name;
//        this.health = health;
//    }
//    public void takeDamage(int damage)
//    {
//        health -= damage;
//        System.out.println(name + " получил " + damage + " урона. Здоровье: " + health);
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public boolean isAlive()
//    {
//        return health > 0;
//    }
//}
//class Weapon
//{
//    private String name;
//    private int damage;
//
//    public Weapon(String name, int damage)
//    {
//        this.name = name;
//        this.damage = damage;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public int getDamage()
//    {
//        return damage;
//    }
//}

//        18. Автоматизированная система заказов
//        Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
//class Product
//{
//    private String name;
//    private double price;
//    public Product(String name, double price)
//    {
//        this.name = name;
//        this.price = price;
//    }
//    public String getName()
//    {
//        return name;
//    }
//    public double getPrice()
//    {
//        return price;
//    }
//}
//class Order
//{
//    private ArrayList<Product> products;
//    private Customer customer;
//    public Order(Customer customer)
//    {
//        this.customer = customer;
//        products = new ArrayList<>();
//    }
//    public void addProduct(Product product)
//    {
//        products.add(product);
//        System.out.println(product.getName() + " добавлен в заказ.");
//    }
//    public double getTotalCost()
//    {
//        double total = 0;
//        for (Product product : products)
//        {
//            total += product.getPrice();
//        }
//        return total;
//    }
//    public void displayOrder()
//    {
//        System.out.println("Заказ " + customer.getName() + ":");
//        for (Product product : products)
//        {
//            System.out.println(product.getName() + " - $" + product.getPrice());
//        }
//        System.out.println("Общая стоимость: $" + getTotalCost());
//    }
//}
//class Customer
//{
//    private String name;
//    public Customer(String name)
//    {
//        this.name = name;
//    }
//    public String getName()
//    {
//        return name;
//    }
//}

//        19. Наследование: Электроника
//        Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
//class Device
//{
//    protected String brand;
//    public Device(String brand)
//    {
//        this.brand = brand;
//    }
//    public void turnOn()
//    {
//        System.out.println(brand + " включен.");
//    }
//    public void turnOff()
//    {
//        System.out.println(brand + " выключен.");
//    }
//}
//class Smartphone extends Device
//{
//    public Smartphone(String brand)
//    {
//        super(brand);
//    }
//    public void takePhoto()
//    {
//        System.out.println(brand + " сделал фото.");
//    }
//}
//class Laptop extends Device
//{
//    public Laptop(String brand)
//    {
//        super(brand);
//    }
//    public void code()
//    {
//        System.out.println(brand + " используется для кодирования.");
//    }
//}

//        20. Игра "Крестики-нолики"
//        Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
//class Game
//{
//    private char[][] board;
//    private char currentPlayer;
//    public Game()
//    {
//        board = new char[3][3];
//        currentPlayer = 'X';
//        initializeBoard();
//    }
//    public void initializeBoard()
//    {
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                board[i][j] = '-';
//            }
//        }
//    }
//    public void printBoard()
//    {
//        System.out.println("Поле:");
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public boolean isBoardFull()
//    {
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                if (board[i][j] == '-')
//                {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    public boolean checkWin()
//    {
//        // Проверка рядов и столбцов
//        for (int i = 0; i < 3; i++)
//        {
//            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
//                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer))
//            {
//                return true;
//            }
//        }
//        // Проверка диагоналей
//        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
//                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer))
//        {
//            return true;
//        }
//        return false;
//    }
//    public void changePlayer()
//    {
//        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//    }
//    public void playGame()
//    {
//        Scanner scanner = new Scanner(System.in);
//        boolean gameEnded = false;
//        while (!gameEnded)
//        {
//            printBoard();
//            int row, col;
//            do
//            {
//                System.out.println("Игрок " + currentPlayer + ", введите свой ход (строку и столбец): ");
//                row = scanner.nextInt();
//                col = scanner.nextInt();
//            }
//            while (row < 0 || col < 0 || row >= 3 || col >= 3 || board[row][col] != '-');
//            board[row][col] = currentPlayer;
//            gameEnded = checkWin();
//            if (!gameEnded)
//            {
//                if (isBoardFull())
//                {
//                    System.out.println("Ничья!");
//                    break;
//                }
//                changePlayer();
//            }
//            else
//            {
//                printBoard();
//                System.out.println("Игрок " + currentPlayer + " победил!");
//            }
//        }
//        scanner.close();
//    }
//}
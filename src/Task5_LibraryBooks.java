import java.sql.*;
import java.util.Scanner;

public class Task5_LibraryBooks
{
    // Данные для подключения к базе
    private static final String URL = "jdbc:sqlserver://localhost:1433; databaseName=BookLibrary";
    private static final String USER = "Valeri";
    private static final String PASSWORD = "1qaz!QAZ";

    // Метод для подключения к базе данных
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Добавление новой книги
    public static void addBook(String title, String author, int year) {
        String sql = "INSERT INTO Books (title, author, year) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setInt(3, year);
            pstmt.executeUpdate();
            System.out.println("Книга добавлена успешно!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Просмотр всех книг
    public static void viewBooks() {
        String sql = "SELECT * FROM Books";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Список книг:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Название: " + rs.getString("title") +
                        ", Автор: " + rs.getString("author") + ", Год: " + rs.getInt("year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Обновление книги по id
    public static void updateBook(int id, String title, String author, int year) {
        String sql = "UPDATE Books SET title = ?, author = ?, year = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setInt(3, year);
            pstmt.setInt(4, id);
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Книга успешно обновлена!");
            } else {
                System.out.println("Книга с таким ID не найдена.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Удаление книги по id
    public static void deleteBook(int id) {
        String sql = "DELETE FROM Books WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Книга успешно удалена!");
            } else {
                System.out.println("Книга с таким ID не найдена.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Главное меню
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Просмотреть книги");
            System.out.println("3. Обновить книгу");
            System.out.println("4. Удалить книгу");
            System.out.println("5. Выйти");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Чистка сканнера

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите год издания книги: ");
                    int year = scanner.nextInt();
                    addBook(title, author, year);
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    System.out.print("Введите ID книги для обновления: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Очистка сканнера
                    System.out.print("Введите новое название книги: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Введите нового автора книги: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Введите новый год издания книги: ");
                    int newYear = scanner.nextInt();
                    updateBook(id, newTitle, newAuthor, newYear);
                    break;
                case 4:
                    System.out.print("Введите ID книги для удаления: ");
                    int deleteId = scanner.nextInt();
                    deleteBook(deleteId);
                    break;
                case 5:
                    System.out.println("Выход...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор.");
            }
        }
    }
}

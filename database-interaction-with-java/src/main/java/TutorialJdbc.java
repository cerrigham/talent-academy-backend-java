import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TutorialJdbc{
    private final String url = "jdbc:postgresql://localhost/library";
    private final String user = "postgres";
    private final String password = "";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public List<String> booksQuery(Connection con) throws SQLException {
        String query = "select * from book";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<String> books = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String condition = rs.getString("condition");
                String book = String.valueOf(id).concat(" ") .concat(title).concat(" ").concat(author).concat(" ").concat(condition);
                System.out.println(book);
                books.add(book);
            }
            return books;
        } catch (SQLException e) {
           System.out.println(e.getMessage());
           return null;
        }
    }

    public static void main(String[] args) {
        TutorialJdbc app = new TutorialJdbc();
        Connection connection = app.connect();
        try {
            app.booksQuery(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

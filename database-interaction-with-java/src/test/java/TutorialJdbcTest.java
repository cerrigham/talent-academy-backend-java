import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TutorialJdbcTest {

    private final TutorialJdbc tutorialJdbc = new TutorialJdbc();

    @Test
    void connectDatabase() {
        Connection connection = tutorialJdbc.connect();
        assertNotEquals(connection, null);
    }

    @Test
    void testQueryBook() {
        Connection connection = tutorialJdbc.connect();
        List<String> books = new ArrayList<>();
        try {
             books = tutorialJdbc.booksQuery(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        assertTrue(books.size() > 0);
    }
}

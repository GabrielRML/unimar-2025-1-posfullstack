package br.unimar.designpatterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    @Test
    void shouldReturnSameInstance() {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        Assertions.assertSame(connection1, connection2, "Instances should be the same.");
    }

    @Test
    void shouldExecuteQuery() {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        String result = connection.query("SELECT id, name FROM users");

        Assertions.assertEquals("Query SQL: SELECT id, name FROM users", result);
    }
}

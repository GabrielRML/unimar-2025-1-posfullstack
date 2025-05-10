package br.unimar.designpatterns.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connecting...");
    }

    public static DatabaseConnection getInstance() {
        if (DatabaseConnection.instance == null) {
            DatabaseConnection.instance = new DatabaseConnection();
        }
        return DatabaseConnection.instance;
    }

    public String query(String query) {
        return "Query SQL: %s".formatted(query);
    }
}

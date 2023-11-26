//* Singleton class
//* Only one instance of this class can be created
//* This is useful for database connections
//* This is useful for logging
//* This is useful for caching
//* This is useful for thread pools
//* This is useful for configuration settings

public class SingletonDatabase {
    private static SingletonDatabase instance;
    private final String connectionString;

    private SingletonDatabase(String connectionString) {
        this.connectionString = connectionString;
    }

    //* Only one thread can access this method at a time --> synchronized
    public static synchronized SingletonDatabase getInstance(String connectionString) {
        // If instance is null, create a new instance
        if (instance == null) {
            // Create a new instance
            instance = new SingletonDatabase(connectionString);
        }
        // Return the instance
        return instance;
    }

    // Getters
    public String getConnectionString() {
        return connectionString;
    }
}

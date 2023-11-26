//* Singleton Pattern, used to create a single instance of a class
public class Main {
    public static void main(String[] args) {
       // Create a new instance of the SingletonDatabase class
       SingletonDatabase database1 = SingletonDatabase.getInstance("connectionString1");
       SingletonDatabase database2 = SingletonDatabase.getInstance("connectionString2");
       SingletonDatabase database3 = SingletonDatabase.getInstance("connectionString3");
       SingletonDatabase database4 = SingletonDatabase.getInstance("connectionString4");

       // Print out the database instances, they all have the same value because of the singleton pattern
       System.out.println(database1);
       System.out.println(database2);
       System.out.println(database3);
       System.out.println(database4);

    }
}
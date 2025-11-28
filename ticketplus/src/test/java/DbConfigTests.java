import com.jspiders.config.DBConfig;

public class DbConfigTests
{
    public static void main(String[] args) {
        testDbConnection();
    }

    public static void testDbConnection()
    {
        System.out.println("Testing DB Connection");
        try {
            DBConfig.getSession();
            DBConfig.shutdown();
            System.out.println("✅ Test DB PASSED");
        }
        catch (Exception ex) {
            System.out.println("❌ Test DB FAILED");
        }

    }

}

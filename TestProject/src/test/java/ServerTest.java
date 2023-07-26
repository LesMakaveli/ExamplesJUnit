import org.junit.Test;


public class ServerTest
{
    @Test(timeout = 1000)
    public void shouldConnectInOneSecond() {
        Server.getConnection();
    }
}

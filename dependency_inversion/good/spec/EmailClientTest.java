import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/8/14.
 */
public class EmailClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        var formatter = new NotificationFormatter();
        String weather = formatter.formatWeatherConditions("sunny");
        gmail.alertWeatherConditions(weather);

        assertEquals("It is sunny", outContent.toString());
    }
}

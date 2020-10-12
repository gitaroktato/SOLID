import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/8/14.
 */
public class MobileDeviceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        var formatter = new NotificationFormatter();
        String weather = formatter.formatWeatherConditions("rainy");
        iPhone.alertWeatherConditions(weather);

        assertEquals("It is rainy", outContent.toString());
    }
}

/**
 * Created by mrk on 4/8/14.
 */
public class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void notify(Notifier notifier, NotificationFormatterInterface formatter) {
        var notification = formatter.formatWeatherConditions(currentConditions);
        notifier.alertWeatherConditions(notification);
    }
}

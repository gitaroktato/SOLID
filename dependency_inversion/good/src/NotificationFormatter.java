public class NotificationFormatter implements NotificationFormatterInterface {

    public String formatWeatherConditions(String weatherConditions) {
        if (weatherConditions == "rainy")
            return "It is rainy";
        if (weatherConditions == "sunny")
            return "It is sunny";
        if (weatherConditions == "cloudy")
            return "It is cloudy";
        return "";
    }
}

/**
 * Created by mrk on 4/8/14.
 */
class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        System.out.print(weatherConditions);
    }
}

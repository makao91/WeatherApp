package application.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StaticValues {
    public static final String API_KEY = "efcffdfceae519b062a44af691b68cc8";
    public static final String firstTown = "Poznań";
    public static final String secondTown = "Nuuk";
    public static final String firstCountry = "";
    public static final String secondCountry = "";
    public static final String fxmlName = "/application/primary.fxml";

    public static Integer getCuurentDayOfTheMonth(long plusDays) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        now = now.plusDays(plusDays);
        int integerDay = Integer.parseInt(dtf.format(now));
        return integerDay;
    }
    public static String getDayAndMonth (LocalDateTime date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM");
        LocalDateTime now = LocalDateTime.now();
        String formatted = date.format(dtf);
        return formatted;
    }
}

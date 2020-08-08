package application.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class StaticValues {
    public static final String API_KEY = "efcffdfceae519b062a44af691b68cc8";
    public static final String FIRST_TOWN = "Poznań";
    public static final String SECOND_TOWN = "Nuuk";
    public static final String FIRST_COUNTRY = "";
    public static final String SECOND_COUNTRY = "";
    public static final String FXML_NAME = "/application/primary.fxml";
    public static final int NUMBER_OF_GSON_DATA_IN_PACKAGE = 40;
    public static final String WRONG_NAME_OF_TOWN_OR_COUNTRY ="Niewłaściwa nazwa miejscowości lub państwa!";
    public static final String SET_COUNTRY ="Wprowadź nazwę kraju.";
    public static final String SET_TOWN ="Wprowadź nazwę miasta.";

    public static String getDayAndMonth (LocalDateTime date, Integer plusDays) {
        String formattedDate = date.plusDays(plusDays).getDayOfMonth() + " - " + date.plusDays(plusDays).getMonthValue();
        return formattedDate;
    }
    public static LocalDateTime getDateFromGsonData (Integer dateFromGson) {
        long test_timestamp = dateFromGson*1000L;
        LocalDateTime triggerTime =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(test_timestamp), ZoneId.systemDefault());
        return triggerTime;
    }
}

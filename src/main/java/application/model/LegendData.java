package application.model;

import java.util.HashMap;
import java.util.Map;

public class LegendData {

    private final Map<String, String> legednData;

    public LegendData() {
        this.legednData = new HashMap<String, String>();
        makeLegendData();
    }

    private final void makeLegendData() {
        legednData.put("01d", "bezchmurne niebo");
        legednData.put("01n", "bezchmurna noc");
        legednData.put("02d", "pojedyńcze chmurki");
        legednData.put("02n", "pojedyńcze chmurki nocą");
        legednData.put("03d", "chmury pierzaste");
        legednData.put("04d", "pochmurnie z przjaśnieniami");
        legednData.put("09d", "przelotny deszcz");
        legednData.put("10d", "deszcz");
        legednData.put("10n", "deszcz w nocy");
        legednData.put("11d", "burza");
        legednData.put("13d", "śnieg");
        legednData.put("50d", "mgła");
    }
    public Map<String, String> getLegednData() {
        return legednData;
    }
}

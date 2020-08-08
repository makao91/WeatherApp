package application.model;

import java.util.HashMap;
import java.util.Map;

public class LegendData {

    private final Map<String, String> legendData;

    public LegendData() {
        this.legendData = new HashMap<>();
        makeLegendData();
    }

    private final void makeLegendData() {
        legendData.put("01d", "bezchmurne niebo");
        legendData.put("01n", "bezchmurna noc");
        legendData.put("02d", "pojedyńcze chmurki");
        legendData.put("02n", "pojedyńcze chmurki nocą");
        legendData.put("03d", "chmury pierzaste");
        legendData.put("04d", "pochmurnie z przjaśnieniami");
        legendData.put("09d", "przelotny deszcz");
        legendData.put("10d", "deszcz");
        legendData.put("10n", "deszcz w nocy");
        legendData.put("11d", "burza");
        legendData.put("13d", "śnieg");
        legendData.put("50d", "mgła");
    }
    public Map<String, String> getLegendData() {
        return legendData;
    }
}

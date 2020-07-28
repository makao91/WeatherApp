package application.model.GsonsClass;

import java.util.ArrayList;
import java.util.List;

public class FullWrappedGson {

    private Integer cod;
    private Integer message;
    private Integer cnt;
    private List<FullWeatherInformation> list;
    private City city;

    public Integer getCod() {
        return cod;
    }

    public Integer getMessage() {
        return message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public List<FullWeatherInformation> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}

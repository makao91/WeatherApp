package application.model.GsonsClass;

import java.util.ArrayList;

public class FullWrappedGson {

    Integer cod;
    Integer message;
    Integer cnt;
    ArrayList<FullWeatherInformation> list;
    City city;

    public Integer getCod() {
        return cod;
    }

    public Integer getMessage() {
        return message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public ArrayList<FullWeatherInformation> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}

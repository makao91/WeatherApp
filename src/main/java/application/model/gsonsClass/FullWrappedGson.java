package application.model.gsonsClass;

import java.util.List;

public class FullWrappedGson {

    private List<FullWeatherInformation> list;
    private City city;

    public List<FullWeatherInformation> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    public void setList(List<FullWeatherInformation> list) {
        this.list = list;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

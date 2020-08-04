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

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public void setList(List<FullWeatherInformation> list) {
        this.list = list;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

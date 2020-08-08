package application.model.gsonsClass;

import java.util.List;

public class FullWeatherInformation {

    private Integer dt;
    private Main main;
    private List<Weather> weather;

    public Integer getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}

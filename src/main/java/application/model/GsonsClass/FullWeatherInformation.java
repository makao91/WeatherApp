package application.model.GsonsClass;

import java.util.ArrayList;

public class FullWeatherInformation {

    private Integer dt;
    Main main;
    ArrayList<Weather> weather;
    Clouds clouds;
    Wind wind;
    Integer visibility;
    Float pop;
    Sys sys;
    String dr_txt;

    public Integer getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Float getPop() {
        return pop;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDr_txt() {
        return dr_txt;
    }
}

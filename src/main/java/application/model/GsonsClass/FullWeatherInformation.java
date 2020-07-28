package application.model.GsonsClass;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class FullWeatherInformation {

    private Integer dt;
    private Main main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private Integer visibility;
    private Float pop;
    private Sys sys;
    private String dr_txt;

    public Integer getDt() {
        return dt;
    }
    public String getFormattedDate() {
        Date date = new Date((long)dt*1000);
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC+2"));
        String formatted = formatter.format(date);
        return formatted + ":00";
    }

    public Integer getDayFromWeatherData(){
        Date date = new Date((long)dt*1000);
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC+2"));
        String formatted = formatter.format(date);
        int integerDay = Integer.parseInt(formatted);
        return integerDay;
    }

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
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

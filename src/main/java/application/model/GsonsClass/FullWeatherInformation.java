package application.model.GsonsClass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class FullWeatherInformation {

    private Integer dt;
    private Main main;
    private ArrayList<Weather> weather;
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
        // formattter
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        // Pass date object
        String formatted = formatter.format(date);

        System.out.println(dt);


        return formatted + ":00";
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

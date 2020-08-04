package application.model.GsonsClass;

public class Main {
    private Float temp;
    private Float feels_like;
    private Float temp_min;
    private Float temp_max;
    private Float pressure;
    private Integer humidity;

    public Float getTemp() {
        return temp;
    }

    public Float getFeels_like() {
        return feels_like;
    }

    public Float getTemp_min() {
        return temp_min;
    }

    public Float getTemp_max() {
        return temp_max;
    }

    public Float getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public void setFeels_like(Float feels_like) {
        this.feels_like = feels_like;
    }

    public void setTemp_min(Float temp_min) {
        this.temp_min = temp_min;
    }

    public void setTemp_max(Float temp_max) {
        this.temp_max = temp_max;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}

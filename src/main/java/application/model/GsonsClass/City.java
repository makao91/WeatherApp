package application.model.GsonsClass;

public class City {

    Integer id;
    String name;
    Coord coord;
    String country;
    Integer population;
    Integer timezone;
    Integer sunrise;
    Integer sunset;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPopulation() {
        return population;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }
}

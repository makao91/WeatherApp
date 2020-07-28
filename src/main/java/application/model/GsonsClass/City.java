package application.model.GsonsClass;

public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;
    private Integer population;
    private Integer timezone;
    private Integer sunrise;
    private Integer sunset;

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

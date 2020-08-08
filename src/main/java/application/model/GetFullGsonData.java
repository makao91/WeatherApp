package application.model;

import application.model.gsonsClass.FullWeatherInformation;
import application.model.gsonsClass.FullWrappedGson;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import  java.net.http.HttpClient;
import  java.net.http.HttpRequest;
import  java.net.http.HttpResponse;
import java.util.List;

import static application.model.StaticValues.API_KEY;


public class GetFullGsonData {

    private final String town;
    private String country;
    private FullWrappedGson fullWrappedGson = new FullWrappedGson();
    private List<FullWeatherInformation> fullWeatherInformation;


    public GetFullGsonData(String town, String country) {
        this.town = town;
        this.country = country;
    }

    public void getResponse() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("http://api.openweathermap.org/data/2" +
                        ".5/forecast?q=" + town + "," + country + "&units=metric&lang=pl&appid=" + API_KEY)))
                .GET()
                .build();

        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        fullWrappedGson = new Gson().fromJson(response.body(), FullWrappedGson.class);
        fullWeatherInformation = fullWrappedGson.getList();

    }

    public String getTown() {
        return town;
    }

    public List<FullWeatherInformation> getFullWeatherInformation() {
        return fullWeatherInformation;
    }

    public FullWrappedGson getFullWrappedGson() {
        return fullWrappedGson;
    }
}

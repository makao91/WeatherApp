package application.model;

import application.model.GsonsClass.FullWeatherInformation;
import application.model.GsonsClass.FullWrappedGson;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import  java.net.http.HttpClient;
import  java.net.http.HttpRequest;
import  java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import static application.model.StaticValues.API_KEY;


public class GetFullGsonData {

    private final String town;
    private String country;
    private final FullWrappedGson fullWrappedGson;
    private List<FullWeatherInformation> fullWeatherInformation;


    public GetFullGsonData(String town, String country) throws IOException {
        this.town = town;
        this.country = country;
        this.fullWrappedGson = getResponse();
    }

    private final FullWrappedGson getResponse() throws IOException {

        FullWrappedGson obj = new FullWrappedGson();
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("http://api.openweathermap.org/data/2" +
                        ".5/forecast?q=" + town + "," + country + "&units=metric&lang=pl&appid=" + API_KEY)))
                .GET()
                .build();
    try{
        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        obj = new Gson().fromJson(response.body(), FullWrappedGson.class);
        System.out.println(new Gson().fromJson(response.body(), FullWrappedGson.class));
        fullWeatherInformation = obj.getList();
    }catch(NumberFormatException | InterruptedException e){
        e.printStackTrace();
        }
    return obj;
    }

    public String getTown() {
        return town;
    }

    public String getCountry() {
        country = fullWrappedGson.getCity().getCountry();
        return country;
    }

    public List<FullWeatherInformation> getFullWeatherInformation() {
        return fullWeatherInformation;
    }
}

package application.model;

import application.model.GsonsClass.FullWeatherInformation;
import application.model.GsonsClass.FullWrappedGson;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import  java.net.http.HttpClient;
import  java.net.http.HttpRequest;
import  java.net.http.HttpResponse;


public class GetFullGsonData {


public void getResponse() throws IOException {
    String API_KEY = "efcffdfceae519b062a44af691b68cc8";
    HttpClient client = HttpClient.newHttpClient();

    HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(URI.create(String.format("http://api.openweathermap.org/data/2.5/forecast?q=Warsaw&units=metric&lang=pl&appid=" + API_KEY)))
            .GET()
            .build();
    try{
        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        FullWrappedGson obj = new Gson().fromJson(response.body(), FullWrappedGson.class);

        for (FullWeatherInformation list: obj.getList()) {
            System.out.println(list.getMain().getTemp());
        }

    }catch(Exception e){
        e.printStackTrace();
        }
    }
}

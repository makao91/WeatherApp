package application.controller;



import application.model.GetFullGsonData;
import application.model.gsonsClass.FullWeatherInformation;
import application.model.gsonsClass.Main;
import application.model.gsonsClass.Weather;

import java.util.ArrayList;
import java.util.List;

import static application.model.StaticValues.NUMBER_OF_GSON_DATA_IN_PACKAGE;

public class FullWeatherInformationStub  {

    private List<FullWeatherInformation> fullWeatherInformationList = new ArrayList<>();
    private FullWeatherInformation fullWeatherInformation = new FullWeatherInformation();
    private Main main = new Main();
    private List <Weather> weatherList = new ArrayList<>();
    private Weather weather = new Weather();
    private GetFullGsonData getFullGsonData = new GetFullGsonData("town", "country");

    public List<FullWeatherInformation> getFullWeatherInformationList() {
        dataFromOpenWeatherMap();
        return fullWeatherInformationList;
    }

    private void dataFromOpenWeatherMap() {

        for (int i = 0; i < NUMBER_OF_GSON_DATA_IN_PACKAGE; i++) {
            fullWeatherInformation.setDt(1597060800);

            main.setTemp(29.26F);
            fullWeatherInformation.setMain(main);

            weather.setIcon("04d");
            weatherList.add(weather);
            fullWeatherInformation.setWeather(weatherList);
            fullWeatherInformationList.add(fullWeatherInformation);
        }
    }

    public void setFullWeatherInformationList(List<FullWeatherInformation> fullWeatherInformationList) {
        this.fullWeatherInformationList = fullWeatherInformationList;
    }

    public FullWeatherInformation getFullWeatherInformation() {
        return fullWeatherInformation;
    }

    public void setFullWeatherInformation(FullWeatherInformation fullWeatherInformation) {
        this.fullWeatherInformation = fullWeatherInformation;
    }

    public GetFullGsonData getGetFullGsonData() {
        getFullGsonData.setFullWeatherInformation(getFullWeatherInformationList());
        return getFullGsonData;
    }

    public void setGetFullGsonData(GetFullGsonData getFullGsonData) {
        this.getFullGsonData = getFullGsonData;
    }
}

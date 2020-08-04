package application.controller;



import application.model.GsonsClass.FullWeatherInformation;
import application.model.GsonsClass.FullWrappedGson;
import application.model.GsonsClass.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FullWeatherInformationStub  {

    private List<FullWeatherInformation> fullWeatherInformationList = new ArrayList<FullWeatherInformation>();
    private FullWeatherInformation fullWeatherInformation = new FullWeatherInformation();
    private Main main = new Main();

    public FullWeatherInformationStub() {
        this.main.setTemp((float) 22.12);
        this.fullWeatherInformation.setMain(main);
        this.fullWeatherInformationList.add(fullWeatherInformation);
    }

    public List<FullWeatherInformation> getFullWeatherInformationList() {
        return fullWeatherInformationList;
    }


}

package application.controller;



import application.model.gsonsClass.FullWeatherInformation;
import application.model.gsonsClass.Main;

import java.util.ArrayList;
import java.util.List;

public class FullWeatherInformationStub  {

    private List<FullWeatherInformation> fullWeatherInformationList = new ArrayList<>();
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

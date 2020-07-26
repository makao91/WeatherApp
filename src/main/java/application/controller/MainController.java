package application.controller;

import application.model.GetFullGsonData;

import java.io.IOException;

public abstract class MainController {

   protected GetFullGsonData getFullGsonData;
   protected GetFullGsonData getFullGsonDataForSecondCity;
   protected String fxmlName;

    public MainController(String town, String country, String secondTown, String secondCountry, String fxmlName) throws IOException {
        this.getFullGsonData = new GetFullGsonData(town, country);
        this.getFullGsonDataForSecondCity = new GetFullGsonData(secondTown, secondCountry);
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}

package application.controller;

import application.model.GetFullGsonData;

import java.io.IOException;

public abstract class MainController {

   protected GetFullGsonData getFullGsonData;
   protected String fxmlName;

    public MainController(String town, String country, String fxmlName) throws IOException {
        this.getFullGsonData = new GetFullGsonData(town, country);
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}

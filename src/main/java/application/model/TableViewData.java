package application.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.ImageView;


public class TableViewData {

    private final ImageView icon;

    private final SimpleStringProperty dateTime;

    private final SimpleFloatProperty temp;

    private final GetWeatherIcon imageToResize;

    public TableViewData(String dateTime, String iconSymbol, Float temp) {
        this.dateTime = new SimpleStringProperty(dateTime);
        imageToResize = new GetWeatherIcon("http://openweathermap.org/img/wn/"+iconSymbol+"@2x.png");
        this.icon = imageToResize.getImageToResize();
        this.temp = new SimpleFloatProperty(temp);
    }

    public String getDateTime() {
        return dateTime.get();
    }

    public ImageView getIcon() {
        return icon;
    }

    public float getTemp() {
        return temp.get();
    }

}

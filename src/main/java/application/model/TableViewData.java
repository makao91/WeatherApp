package application.model;

import javafx.beans.property.SimpleFloatProperty;
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
        this.icon = imageToResize.getImageToResize(30);
        this.temp = new SimpleFloatProperty(temp);
    }

    public ImageView getIcon() {
        return icon;
    }

    public String getDateTime() {
        return dateTime.get();
    }

    public SimpleStringProperty dateTimeProperty() {
        return dateTime;
    }

    public float getTemp() {
        return temp.get();
    }

    public SimpleFloatProperty tempProperty() {
        return temp;
    }

    public GetWeatherIcon getImageToResize() {
        return imageToResize;
    }
}

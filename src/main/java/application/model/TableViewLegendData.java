package application.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.ImageView;

public class TableViewLegendData {

    private final ImageView icon;
    private final SimpleStringProperty description;
    private final GetWeatherIcon imageToResize;

    public TableViewLegendData(String iconSymbol, String description) {
        this.description = new SimpleStringProperty(description);
        imageToResize = new GetWeatherIcon("http://openweathermap.org/img/wn/"+iconSymbol+"@2x.png");
        this.icon = imageToResize.getImageToResize(40);
    }

    public ImageView getIcon() {
        return icon;
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public GetWeatherIcon getImageToResize() {
        return imageToResize;
    }
}

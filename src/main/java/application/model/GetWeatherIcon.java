package application.model;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GetWeatherIcon {

    private ImageView image;

    public GetWeatherIcon(String linkToIcon) {
        this.image = new ImageView(linkToIcon);
    }

    public ImageView getImageToResize(int pixelSize) {
        this.image.setFitWidth(pixelSize);
        this.image.setFitHeight(pixelSize);
        return this.image;
    }
}

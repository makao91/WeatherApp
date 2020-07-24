package application.model;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GetWeatherIcon {

    private ImageView image;

    public GetWeatherIcon(String linkToIcon) {
        this.image = new ImageView(linkToIcon);
    }

    public ImageView getImageToResize() {
        this.image.setFitWidth(50);
        this.image.setFitHeight(50);
        return this.image;
    }
}

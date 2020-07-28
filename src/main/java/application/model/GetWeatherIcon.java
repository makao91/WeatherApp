package application.model;
import javafx.scene.image.ImageView;

public class GetWeatherIcon {

    private final ImageView image;

    public GetWeatherIcon(String linkToIcon) {
        this.image = new ImageView(linkToIcon);
    }
    public ImageView getImageToResize(int pixelSize) {
        this.image.setFitWidth(pixelSize);
        this.image.setFitHeight(pixelSize);
        return this.image;
    }
}

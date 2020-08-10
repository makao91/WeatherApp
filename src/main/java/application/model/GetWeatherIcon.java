package application.model;
import javafx.scene.image.ImageView;

public class GetWeatherIcon {

    private final ImageView image;

    public GetWeatherIcon(String linkToIcon) {
        image = new ImageView(linkToIcon);
    }
    public ImageView getImageToResize(int pixelSize) {
        image.setFitWidth(pixelSize);
        image.setFitHeight(pixelSize);
        return image;
    }
}

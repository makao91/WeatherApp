package application.view;

import application.controller.PrimaryController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import static application.model.StaticValues.*;


public class ViewFactory {

    public void showMainWindow() throws IOException {
        PrimaryController controller = new PrimaryController(FIRST_TOWN, FIRST_COUNTRY, SECOND_TOWN, SECOND_COUNTRY,
                FXML_NAME);
        sceneLoader(controller);
    }

    private final void sceneLoader(PrimaryController baseController) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent, 1250, 850);
        Stage stage = new Stage();
        stage.setScene(scene);
        scene.getStylesheets().add("/application/style.css");
        stage.show();
    }
}

package application.view;

import application.controller.MainController;
import application.controller.PrimaryController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    public void showMainWindow() throws IOException {
        MainController controller = new PrimaryController("Poznań", "", "/application/primary.fxml");
        sceneLoader(controller);
    }

    private void sceneLoader(MainController baseController) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent, 1050, 512);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

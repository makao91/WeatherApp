package application;

import application.controller.MainController;
import application.controller.PrimaryController;
import application.model.GetFullGsonData;
import application.view.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Calendar;

/**
 * JavaFX App
 */
public class App extends Application {



    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();

    }



    public static void main(String[] args) {
        launch();
    }

}
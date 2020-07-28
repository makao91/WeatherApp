package application;

import application.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();
    }
    public static void main(String[] args) {
        launch();
    }
}
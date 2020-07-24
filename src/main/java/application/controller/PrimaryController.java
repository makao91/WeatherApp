package application.controller;


import application.model.GsonsClass.FullWeatherInformation;
import application.model.TableViewData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class PrimaryController extends MainController implements Initializable {

    ArrayList<FullWeatherInformation> fullWeatherInformation;

    private final ObservableList<TableViewData> data;

    public PrimaryController(String town, String country, String fxmlName) throws IOException {
        super(town, country, fxmlName);
        fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
        data =  FXCollections.observableArrayList(

                new TableViewData(fullWeatherInformation.get(0).getFormattedDate(),
                        fullWeatherInformation.get(0).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(0).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(1).getFormattedDate(),
                        fullWeatherInformation.get(1).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(1).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(2).getFormattedDate(),
                        fullWeatherInformation.get(2).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(2).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(3).getFormattedDate(),
                        fullWeatherInformation.get(3).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(3).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(4).getFormattedDate(),
                        fullWeatherInformation.get(4).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(4).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(5).getFormattedDate(),
                        fullWeatherInformation.get(5).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(5).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(6).getFormattedDate(),
                        fullWeatherInformation.get(6).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(6).getMain().getTemp()),
                new TableViewData(fullWeatherInformation.get(7).getFormattedDate(),
                        fullWeatherInformation.get(7).getWeather().get(0).getIcon(),
                        fullWeatherInformation.get(7).getMain().getTemp())
        );


    }

    @FXML
    private TextField firstCountry;

    @FXML
    private TextField secondCountry;

    @FXML
    private TextField firstTown;

    @FXML
    private TextField secondTown;


    @FXML
    private TableView<TableViewData> trueTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeCol;

    @FXML
    private TableColumn<TableViewData, String> stateCol;

    @FXML
    private TableColumn<TableViewData, Float> tempCol;

    @FXML
    void firstShowButton(){
    }

    @FXML
    void secondShowButton() {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstTown.setText(getFullGsonData.getTown());
        setUpFirstTableView();
       // System.out.println(temperatureFirstDay.getFirstCol());
    }

    private void setUpFirstTableView() {
        trueTableView.setItems(data);
        timeCol.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateCol.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempCol.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

    }
}

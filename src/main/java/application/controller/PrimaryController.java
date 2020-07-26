package application.controller;


import application.model.GsonsClass.FullWeatherInformation;
import application.model.LegendData;
import application.model.TableViewData;
import application.model.TableViewLegendData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;


public class PrimaryController extends MainController implements Initializable {

    ArrayList<FullWeatherInformation> fullWeatherInformation;
    ArrayList<FullWeatherInformation> fullWeatherInformationForSecondCity;
    HashMap<String, String> legendMap;
    Date dt;

    private ObservableList<TableViewData> dataFirstFirst;
    private ObservableList<TableViewData> dataFirstSecond;
    private ObservableList<TableViewData> dataFirstThird;
    private ObservableList<TableViewData> dataFirstFourth;
    private ObservableList<TableViewData> dataFirstFifth;
    private ObservableList<TableViewLegendData> legendDataObservableList;
    private ObservableList<TableViewData> dataSecondFirst;
    private ObservableList<TableViewData> dataSecondSecond;
    private ObservableList<TableViewData> dataSecondThird;
    private ObservableList<TableViewData> dataSecondFourth;
    private ObservableList<TableViewData> dataSecondFifth;


    public PrimaryController(String town, String country, String secondTown, String secondCountry, String fxmlName) throws IOException {
        super(town, country, secondTown, secondCountry, fxmlName);
        fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
        fullWeatherInformationForSecondCity = getFullGsonDataForSecondCity.getFullWeatherInformation();

        LegendData legendData = new LegendData();
        legendMap = legendData.getLegednData();
        dt = new Date();

        dataFirstFirst =  FXCollections.observableArrayList();
        dataFirstSecond =  FXCollections.observableArrayList();
        dataFirstThird =  FXCollections.observableArrayList();
        dataFirstFourth =  FXCollections.observableArrayList();
        dataFirstFifth =  FXCollections.observableArrayList();
        legendDataObservableList = FXCollections.observableArrayList();
        dataSecondFirst =  FXCollections.observableArrayList();
        dataSecondSecond =  FXCollections.observableArrayList();
        dataSecondThird =  FXCollections.observableArrayList();
        dataSecondFourth =  FXCollections.observableArrayList();
        dataSecondFifth =  FXCollections.observableArrayList();

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
    private TableView<TableViewData> firstFirstTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColFrstFrst;

    @FXML
    private TableColumn<TableViewData, String> stateColFrstFrst;

    @FXML
    private TableColumn<TableViewData, Float> tempColFrstFrst;

    @FXML
    private TableView<TableViewData> firstSecondTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColFrstSecond;

    @FXML
    private TableColumn<TableViewData, String> stateColFrstSecond;

    @FXML
    private TableColumn<TableViewData, Float> tempColFrstSecond;

    @FXML
    private Label labelFirstSecond;

    @FXML
    private TableView<TableViewData> firstThirdTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColFrstThird;

    @FXML
    private TableColumn<TableViewData, String> stateColFrstThird;

    @FXML
    private TableColumn<TableViewData, Float> tempColFrstThird;

    @FXML
    private TableView<TableViewData> firstFouthTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColFrstFourth;

    @FXML
    private TableColumn<TableViewData, String> stateColFrstFourth;

    @FXML
    private TableColumn<TableViewData, Float> tempColFrstFourth;

    @FXML
    private TableView<TableViewData> firstFifthTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColFrstFifth;

    @FXML
    private TableColumn<TableViewData, String> stateColFrstFifth;

    @FXML
    private TableColumn<TableViewData, Float> tempColFrstFifth;



    @FXML
    private Label labelFirstThird;

    @FXML
    private Label labelFirstFouth;

    @FXML
    private Label labelFirstFifth;

    @FXML
    private Label labelFirstFirst;

    @FXML
    private TableView<TableViewData> secondFirstTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColSecondFrst;

    @FXML
    private TableColumn<TableViewData, String> stateColSecondFirst;

    @FXML
    private TableColumn<TableViewData, Float> tempColSecondFirst;

    @FXML
    private Label labelSecondFirst;

    @FXML
    private TableView<TableViewData> secondSecondTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColSecondSecond;

    @FXML
    private TableColumn<TableViewData, String> stateColSecondSecond;

    @FXML
    private TableColumn<TableViewData, Float> tempColSecondSecond;

    @FXML
    private TableView<TableViewData> secondThirdTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColSecondThird;

    @FXML
    private TableColumn<TableViewData, String> stateColSecondThird;

    @FXML
    private TableColumn<TableViewData, Float> tempColSecondThird;

    @FXML
    private TableView<TableViewData> secondFourthTableView;

    @FXML
    private TableColumn<TableViewData, String> stateColSecondFourth;

    @FXML
    private TableColumn<TableViewData, Float> tempColSecondFourth;

    @FXML
    private TableColumn<TableViewData, Integer> timeColSecondFourth;

    @FXML
    private TableView<TableViewData> secondFifthTableView;

    @FXML
    private TableColumn<TableViewData, Integer> timeColSecondFifth;

    @FXML
    private TableColumn<TableViewData, String> stateColSecondFifth;

    @FXML
    private TableColumn<TableViewData, Float> tempColSecondFifth;

    @FXML
    private Label labelSecondSecond;

    @FXML
    private Label labelSecondThird;

    @FXML
    private Label labelSecondFourth;

    @FXML
    private Label labelSecondFifth;


    @FXML
    void firstShowButton() {

    }

    @FXML
    void secondShowButton() {

    }
    @FXML
    private TableView<TableViewLegendData> legendTableView;

    @FXML
    private TableColumn<TableViewLegendData, String> iconCol;

    @FXML
    private TableColumn<TableViewLegendData, String> descriptionCol;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstTown.setText(getFullGsonData.getTown());
        secondTown.setText(getFullGsonDataForSecondCity.getTown());
        firstCountry.setText(getFullGsonData.getCountry());
        secondCountry.setText(getFullGsonDataForSecondCity.getCountry());
        setUpLegend();
        setUpLabels();
        setUpFirstTableView();
        setUpSecondTableView();
    }

    private void setUpLabels() {
        labelFirstFirst.setText("Pogoda na dziś");
        labelFirstSecond.setText("Pogoda na jutro");
        labelFirstThird.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(2)));
        labelFirstFouth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(3)));
        labelFirstFifth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(4)));

        labelFirstFirst.setText("Pogoda na dziś");
        labelFirstSecond.setText("Pogoda na jutro");
        labelSecondThird.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(2)));
        labelSecondFourth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(3)));
        labelSecondFifth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(4)));

    }

    private void setUpLegend() {

        legendTableView.setItems(legendDataObservableList);
        iconCol.setCellValueFactory(new PropertyValueFactory<TableViewLegendData, String>("icon"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<TableViewLegendData, String>("description"));

        for (String i : legendMap.keySet()) {

            legendDataObservableList.add(
                    new TableViewLegendData(i, legendMap.get(i))
            );
        }
    }

    private void setUpSecondTableView() {
        secondFirstTableView.setItems(dataSecondFirst);
        timeColSecondFrst.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColSecondFirst.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColSecondFirst.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        secondSecondTableView.setItems(dataSecondSecond);
        timeColSecondSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColSecondSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColSecondSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        secondThirdTableView.setItems(dataSecondThird);
        timeColSecondThird.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColSecondThird.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColSecondThird.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        secondFourthTableView.setItems(dataSecondFourth);
        timeColSecondFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColSecondFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColSecondFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        secondFifthTableView.setItems(dataSecondFifth);
        timeColSecondFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColSecondFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColSecondFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        for(int i =0; i<40; i++){
            fullWeatherInformationForSecondCity.get(i).getFormattedDate();
            fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon();
            fullWeatherInformationForSecondCity.get(i).getMain().getTemp();

            if(fullWeatherInformationForSecondCity.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()) {
                dataSecondFirst.add(
                        new TableViewData(fullWeatherInformationForSecondCity.get(i).getFormattedDate(),
                                fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformationForSecondCity.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformationForSecondCity.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+1) {
                dataSecondSecond.add(
                        new TableViewData(fullWeatherInformationForSecondCity.get(i).getFormattedDate(),
                                fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformationForSecondCity.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformationForSecondCity.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+2) {
                dataSecondThird.add(
                        new TableViewData(fullWeatherInformationForSecondCity.get(i).getFormattedDate(),
                                fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformationForSecondCity.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformationForSecondCity.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+3) {
                dataSecondFourth.add(
                        new TableViewData(fullWeatherInformationForSecondCity.get(i).getFormattedDate(),
                                fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformationForSecondCity.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformationForSecondCity.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+4) {
                dataSecondFifth.add(
                        new TableViewData(fullWeatherInformationForSecondCity.get(i).getFormattedDate(),
                                fullWeatherInformationForSecondCity.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformationForSecondCity.get(i).getMain().getTemp())
                );
            }
        }
    }

    private void setUpFirstTableView() {
        firstFirstTableView.setItems(dataFirstFirst);
        timeColFrstFrst.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColFrstFrst.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColFrstFrst.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        firstSecondTableView.setItems(dataFirstSecond);
        timeColFrstSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColFrstSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColFrstSecond.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        firstThirdTableView.setItems(dataFirstThird);
        timeColFrstThird.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColFrstThird.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColFrstThird.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        firstFouthTableView.setItems(dataFirstFourth);
        timeColFrstFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColFrstFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColFrstFourth.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));

        firstFifthTableView.setItems(dataFirstFifth);
        timeColFrstFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateColFrstFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempColFrstFifth.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));


        for(int i =0; i<40; i++){
            fullWeatherInformation.get(i).getFormattedDate();
            fullWeatherInformation.get(i).getWeather().get(0).getIcon();
            fullWeatherInformation.get(i).getMain().getTemp();

            if(fullWeatherInformation.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()) {
                dataFirstFirst.add(
                        new TableViewData(fullWeatherInformation.get(i).getFormattedDate(),
                                fullWeatherInformation.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformation.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformation.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+1) {
                dataFirstSecond.add(
                        new TableViewData(fullWeatherInformation.get(i).getFormattedDate(),
                                fullWeatherInformation.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformation.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformation.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+2) {
                dataFirstThird.add(
                        new TableViewData(fullWeatherInformation.get(i).getFormattedDate(),
                                fullWeatherInformation.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformation.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformation.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+3) {
                dataFirstFourth.add(
                        new TableViewData(fullWeatherInformation.get(i).getFormattedDate(),
                                fullWeatherInformation.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformation.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatherInformation.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth()+4) {
                dataFirstFifth.add(
                        new TableViewData(fullWeatherInformation.get(i).getFormattedDate(),
                                fullWeatherInformation.get(i).getWeather().get(0).getIcon(),
                                fullWeatherInformation.get(i).getMain().getTemp())
                );
            }
        }


    }

    private Integer getCuurentDayOfTheMonth() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        int integerDay = Integer.parseInt(dtf.format(now));
        return integerDay;
    }
    private String getDayAndMonth (LocalDateTime date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MM");
        LocalDateTime now = LocalDateTime.now();
        String formatted = date.format(dtf);
        return formatted;
    }

}

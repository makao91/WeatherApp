package application.controller;


import application.model.*;
import application.model.gsonsClass.FullWeatherInformation;
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

import java.util.*;

import static application.model.StaticValues.*;


public class PrimaryController implements Initializable {

    private List<FullWeatherInformation> fullWeatherInformation;
    private List<FullWeatherInformation> fullWeatherInformationForSecondCity;
    private Map<String, String> legendMap;
    private LegendData legendData;
    private LocalDateTime localDate;
    private GetFullGsonData getFullGsonData;
    private GetFullGsonData getFullGsonDataForSecondCity;
    private String fxmlName;
    private ObservableList<TableViewData> dataFirstFirst = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstSecond = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstThird = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstFourth = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstFifth = FXCollections.observableArrayList();
    private ObservableList<TableViewLegendData> legendDataObservableList = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFirst = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondSecond = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondThird = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFourth = FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFifth = FXCollections.observableArrayList();

    private String ftown;
    private String fCountry;
    private String sTown;
    private String sCountry;
    @FXML
    private Label titleLabel;

    @FXML
    private Label helpLabel1;

    @FXML
    private Label helpLabel2;

    @FXML
    private Label errorLabel;

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
    private TableView<TableViewLegendData> legendTableView;

    @FXML
    private TableColumn<TableViewLegendData, String> iconCol;

    @FXML
    private TableColumn<TableViewLegendData, String> descriptionCol;

    public PrimaryController(String town, String country, String secondTown, String secondCountry, String fxmlName) {
        legendData = new LegendData();
        legendMap = legendData.getLegendData();
        this.fxmlName = fxmlName;
        ftown = town;
        fCountry = country;
        sTown = secondTown;
        sCountry = secondCountry;
        localDate = LocalDateTime.now();
    }

    @FXML
    private void firstShowButton() {
        clearLists(dataFirstFirst, dataFirstSecond, dataFirstThird, dataFirstFourth, dataFirstFifth, fullWeatherInformation);
        if (!firstTown.getText().isEmpty() || !firstCountry.getText().isEmpty()) {
            try {
                getFullGsonData = getNewData(firstTown.getText(), firstCountry.getText());
                fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
                setUpFirstTableView();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                errorLabel.setText(WRONG_NAME_OF_TOWN_OR_COUNTRY);
            }
        } else {
            errorLabel.setText("Musisz wpisać miasto lub państwo!");
        }
    }

    @FXML
    private void secondShowButton() {
        clearLists(dataSecondFirst, dataSecondSecond, dataSecondThird, dataSecondFourth, dataSecondFifth, fullWeatherInformationForSecondCity);
        if (!secondTown.getText().isEmpty() || !secondCountry.getText().isEmpty()) {
            try {
                getFullGsonDataForSecondCity = getNewData(secondTown.getText(), secondCountry.getText());
                fullWeatherInformationForSecondCity = getFullGsonDataForSecondCity.getFullWeatherInformation();
                setUpSecondTableView();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                errorLabel.setText(WRONG_NAME_OF_TOWN_OR_COUNTRY);
            }
        } else {
            errorLabel.setText("Musisz wpisać miasto lub państwo!");
        }
    }


    private void clearLists(ObservableList<TableViewData> dataOne, ObservableList<TableViewData> dataTwo,
                            ObservableList<TableViewData> dataThree, ObservableList<TableViewData> dataFour,
                            ObservableList<TableViewData> dataFive, List<FullWeatherInformation> fullWeatInf) {
        dataOne.clear();
        dataTwo.clear();
        dataThree.clear();
        dataFour.clear();
        dataFive.clear();
        errorLabel.setText("");
        if (fullWeatInf != null) {
            fullWeatInf.clear();
        }
    }

    public String getFxmlName() {
        return fxmlName;
    }

    private GetFullGsonData getNewData (String town, String country) {
        GetFullGsonData data = new GetFullGsonData(town, country);
        try {
            data.getResponse();
        } catch (IOException e) {
            errorLabel.setText(INTERNET_CONNECTION_FAILS);
            e.printStackTrace();
        } catch (InterruptedException e) {
            errorLabel.setText(INTERNET_CONNECTION_FAILS);
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getFullGsonData = getNewData(ftown, fCountry);
        getFullGsonDataForSecondCity = getNewData(sTown, sCountry);
        fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
        fullWeatherInformationForSecondCity = getFullGsonDataForSecondCity.getFullWeatherInformation();
        firstCountry.setPromptText(SET_COUNTRY);
        firstTown.setPromptText(SET_TOWN);
        secondCountry.setPromptText(SET_COUNTRY);
        secondTown.setPromptText(SET_TOWN);
        setUpLegend();
        setUpLabels();
        setUpFirstTableView();
        setUpSecondTableView();
    }

    private void setUpLabels() {
        setUpLabelsToTables(labelFirstFirst, labelFirstSecond, labelFirstThird, labelFirstFouth, labelFirstFifth);
        setUpLabelsToTables(labelSecondFirst, labelSecondSecond, labelSecondThird, labelSecondFourth, labelSecondFifth);
    }

    private void setUpLabelsToTables(Label labelOne, Label labelTwo, Label labelThree, Label labelFour,
                                     Label labelFive) {
        labelOne.setText("Pogoda na dziś");
        labelTwo.setText("Pogoda na jutro");
        labelThree.setText(getDayAndMonth(localDate, 2));
        labelFour.setText(getDayAndMonth(localDate, 3));
        labelFive.setText(getDayAndMonth(localDate, 4));
    }


    private void setUpLegend() {
        legendTableView.setItems(legendDataObservableList);
        iconCol.setCellValueFactory(new PropertyValueFactory<>("icon"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        for (String i : legendMap.keySet()) {
            legendDataObservableList.add(
                    new TableViewLegendData(i, legendMap.get(i))
            );
        }
    }

    private void setUpSecondTableView() {
        setTextfields(secondTown, secondCountry, getFullGsonDataForSecondCity);
        connectColumsWithData(secondFirstTableView, dataSecondFirst, timeColSecondFrst, stateColSecondFirst, tempColSecondFirst);
        connectColumsWithData(secondSecondTableView, dataSecondSecond, timeColSecondSecond, stateColSecondSecond, tempColSecondSecond);
        connectColumsWithData(secondThirdTableView, dataSecondThird, timeColSecondThird, stateColSecondThird, tempColSecondThird);
        connectColumsWithData(secondFourthTableView, dataSecondFourth, timeColSecondFourth, stateColSecondFourth, tempColSecondFourth);
        connectColumsWithData(secondFifthTableView, dataSecondFifth, timeColSecondFifth, stateColSecondFifth, tempColSecondFifth);
        setUpWeatherData(fullWeatherInformationForSecondCity, dataSecondFirst, dataSecondSecond, dataSecondThird,
                dataSecondFourth, dataSecondFifth);
    }

    private void setUpFirstTableView() {
        setTextfields(firstTown, firstCountry, getFullGsonData);
        connectColumsWithData(firstFirstTableView, dataFirstFirst, timeColFrstFrst, stateColFrstFrst, tempColFrstFrst);
        connectColumsWithData(firstSecondTableView, dataFirstSecond, timeColFrstSecond, stateColFrstSecond, tempColFrstSecond);
        connectColumsWithData(firstThirdTableView, dataFirstThird, timeColFrstThird, stateColFrstThird, tempColFrstThird);
        connectColumsWithData(firstFouthTableView, dataFirstFourth, timeColFrstFourth, stateColFrstFourth, tempColFrstFourth);
        connectColumsWithData(firstFifthTableView, dataFirstFifth, timeColFrstFifth, stateColFrstFifth, tempColFrstFifth);
        setUpWeatherData(fullWeatherInformation, dataFirstFirst, dataFirstSecond, dataFirstThird,
                dataFirstFourth, dataFirstFifth);
    }

    private void setTextfields(TextField town, TextField country, GetFullGsonData data) {
        town.clear();
        country.clear();
        town.setText(data.getTown());
        country.setText(data.getFullWrappedGson().getCity().getCountry());
    }

    private void setUpWeatherData(List<FullWeatherInformation> fullWeatInfo,
                                  ObservableList<TableViewData> dataOne,
                                  ObservableList<TableViewData> dataTwo,
                                  ObservableList<TableViewData> dataThree,
                                  ObservableList<TableViewData> dataFour,
                                  ObservableList<TableViewData> dataFive) {
        LocalDateTime dateOfWeather;

        for (int i = 0; i < NUMBER_OF_GSON_DATA_IN_PACKAGE; i++) {

            dateOfWeather = getDateFromGsonData(fullWeatInfo.get(i).getDt());
            String dateToJavaFxTable = dateOfWeather.getHour() + ":00";
            String iconToJavaFxTable = fullWeatInfo.get(i).getWeather().get(0).getIcon();
            Float tempToJavaFxTable = fullWeatInfo.get(i).getMain().getTemp();

            if (dateOfWeather.getDayOfMonth() == localDate.getDayOfMonth()) {
                dataOne.add(
                        new TableViewData(dateToJavaFxTable,
                                iconToJavaFxTable,
                                tempToJavaFxTable)
                );
            } else if (dateOfWeather.getDayOfMonth() == localDate.plusDays(1).getDayOfMonth()) {
                dataTwo.add(
                        new TableViewData(dateToJavaFxTable,
                                iconToJavaFxTable,
                                tempToJavaFxTable)
                );
            } else if (dateOfWeather.getDayOfMonth() == localDate.plusDays(2).getDayOfMonth()) {
                dataThree.add(
                        new TableViewData(dateToJavaFxTable,
                                iconToJavaFxTable,
                                tempToJavaFxTable)
                );
            } else if (dateOfWeather.getDayOfMonth() == localDate.plusDays(3).getDayOfMonth()) {
                dataFour.add(
                        new TableViewData(dateToJavaFxTable,
                                iconToJavaFxTable,
                                tempToJavaFxTable)
                );
            } else if (dateOfWeather.getDayOfMonth() == localDate.plusDays(4).getDayOfMonth()) {
                dataFive.add(
                        new TableViewData(dateToJavaFxTable,
                                iconToJavaFxTable,
                                tempToJavaFxTable)
                );
            }
        }
    }

    private void connectColumsWithData(TableView<TableViewData> table, ObservableList<TableViewData> obsListData,
                                       TableColumn<TableViewData, Integer> timeCol,
                                       TableColumn<TableViewData, String> stateCol,
                                       TableColumn<TableViewData, Float> tempCol) {
        table.setItems(obsListData);
        timeCol.setCellValueFactory(new PropertyValueFactory<>("dateTime"));
        stateCol.setCellValueFactory(new PropertyValueFactory<>("icon"));
        tempCol.setCellValueFactory(new PropertyValueFactory<>("temp"));
    }

    public List<FullWeatherInformation> getFullWeatherInformation() {
        return fullWeatherInformation;
    }

    public void setFullWeatherInformation(List<FullWeatherInformation> fullWeatherInformation) {
        this.fullWeatherInformation = fullWeatherInformation;
    }

    public List<FullWeatherInformation> getFullWeatherInformationForSecondCity() {
        return fullWeatherInformationForSecondCity;
    }

    public void setFullWeatherInformationForSecondCity(List<FullWeatherInformation> fullWeatherInformationForSecondCity) {
        this.fullWeatherInformationForSecondCity = fullWeatherInformationForSecondCity;
    }

    public String getFtown() {
        return ftown;
    }

    public void setFtown(String ftown) {
        this.ftown = ftown;
    }

    public String getfCountry() {
        return fCountry;
    }

    public void setfCountry(String fCountry) {
        this.fCountry = fCountry;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabel(Label errorLabel) {
        this.errorLabel = errorLabel;
    }

    public TextField getFirstCountry() {
        return firstCountry;
    }

    public void setFirstCountry(TextField firstCountry) {
        this.firstCountry = firstCountry;
    }

    public TextField getFirstTown() {
        return firstTown;
    }

    public void setFirstTown(TextField firstTown) {
        this.firstTown = firstTown;
    }

    public GetFullGsonData getGetFullGsonData() {
        return getFullGsonData;
    }

    public void setGetFullGsonData(GetFullGsonData getFullGsonData) {
        this.getFullGsonData = getFullGsonData;
    }

    public GetFullGsonData getGetFullGsonDataForSecondCity() {
        return getFullGsonDataForSecondCity;
    }

    public void setGetFullGsonDataForSecondCity(GetFullGsonData getFullGsonDataForSecondCity) {
        this.getFullGsonDataForSecondCity = getFullGsonDataForSecondCity;
    }

    public String getsTown() {
        return sTown;
    }

    public void setsTown(String sTown) {
        this.sTown = sTown;
    }

    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public TextField getSecondCountry() {
        return secondCountry;
    }

    public void setSecondCountry(TextField secondCountry) {
        this.secondCountry = secondCountry;
    }

    public TextField getSecondTown() {
        return secondTown;
    }

    public void setSecondTown(TextField secondTown) {
        this.secondTown = secondTown;
    }
}

package application.controller;


import application.model.*;
import application.model.GsonsClass.FullWeatherInformation;
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
import java.util.*;

import static application.model.StaticValues.getCuurentDayOfTheMonth;
import static application.model.StaticValues.getDayAndMonth;


public class PrimaryController implements Initializable {

    private List<FullWeatherInformation> fullWeatherInformation;
    private List<FullWeatherInformation> fullWeatherInformationForSecondCity;
    private Map<String, String> legendMap;
    private LegendData legendData;
    private Date dt;
    private GetFullGsonData getFullGsonData;
    private GetFullGsonData getFullGsonDataForSecondCity;
    private String fxmlName;
    private ObservableList<TableViewData> dataFirstFirst=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstSecond=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstThird=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstFourth=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataFirstFifth=  FXCollections.observableArrayList();
    private ObservableList<TableViewLegendData> legendDataObservableList=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFirst=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondSecond=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondThird=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFourth=  FXCollections.observableArrayList();
    private ObservableList<TableViewData> dataSecondFifth=  FXCollections.observableArrayList();

    private String ftown;
    private String fCountry;
    private String sTown;
    private String sCountry;


    public PrimaryController(String town, String country, String secondTown, String secondCountry, String fxmlName) throws IOException {
        legendData = new LegendData();
        legendMap = legendData.getLegednData();
        dt = new Date();
        this.fxmlName = fxmlName;
        this.ftown = town;
        this.fCountry = country;
        this.sTown = secondTown;
        this.sCountry = secondCountry;

    }

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
    private  TextField firstTown;

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
    private void firstShowButton() {
        clearLists(dataFirstFirst,dataFirstSecond,dataFirstThird,dataFirstFourth,dataFirstFifth, fullWeatherInformation);
        if(validFields(firstTown.getText(), firstCountry.getText())) {
            try {
                getFullGsonData = new GetFullGsonData(firstTown.getText(), firstCountry.getText());
                fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
                setUpFirstTableView();
            }catch (Exception e) {
                e.printStackTrace();
                errorLabel.setText("Niewłaściwa nazwa miejscowości lub państwa!");
            }
        }
    }

    @FXML
    private void secondShowButton()  {
        clearLists(dataSecondFirst,dataSecondSecond,dataSecondThird,dataSecondFourth,dataSecondFifth, fullWeatherInformationForSecondCity);
        if(validFields(secondTown.getText(), secondCountry.getText())) {
            try {
                getFullGsonDataForSecondCity = new GetFullGsonData(secondTown.getText(), secondCountry.getText());
                fullWeatherInformationForSecondCity = getFullGsonDataForSecondCity.getFullWeatherInformation();
                setUpSecondTableView();
            }catch (Exception e) {
                e.printStackTrace();
                errorLabel.setText("Niewłaściwa nazwa miejscowości lub państwa!");
            }
        }
    }

    @FXML
    private TableView<TableViewLegendData> legendTableView;

    @FXML
    private TableColumn<TableViewLegendData, String> iconCol;

    @FXML
    private TableColumn<TableViewLegendData, String> descriptionCol;

    private final void clearLists(ObservableList<TableViewData> dataOne, ObservableList<TableViewData> dataTwo,
                                  ObservableList<TableViewData> dataThree, ObservableList<TableViewData> dataFour,
                                  ObservableList<TableViewData> dataFive,  List<FullWeatherInformation> fullWeatInf) {
        dataOne.clear();
        dataTwo.clear();
        dataThree.clear();
        dataFour.clear();
        dataFive.clear();
        errorLabel.setText("");
        if(fullWeatInf != null) {
            fullWeatInf.clear();
        }
    }

    public String getFxmlName() {
        return fxmlName;
    }

    private final boolean validFields(String field1, String field2) {
        if(field1.isEmpty() && field2.isEmpty()) {
            errorLabel.setText("Musisz wpisać miasto lub państwo!");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            this.getFullGsonData = new GetFullGsonData(ftown, fCountry);
            this.getFullGsonDataForSecondCity = new GetFullGsonData(sTown, sCountry);
            fullWeatherInformation = getFullGsonData.getFullWeatherInformation();
            fullWeatherInformationForSecondCity = getFullGsonDataForSecondCity.getFullWeatherInformation();
        } catch (IOException e) {
            errorLabel.setText("Problem z internetem :(");
            e.printStackTrace();
        }
        firstCountry.setPromptText("Wprowadź nazwę kraju.");
        firstTown.setPromptText("Wprowadź nazwę miasta.");
        secondCountry.setPromptText("Wprowadź nazwę kraju.");
        secondTown.setPromptText("Wprowadź nazwę miasta.");
        setUpLegend();
        setUpLabels();
        setUpFirstTableView();
        setUpSecondTableView();
    }

    private final void setUpLabels() {
        setUpLabelsToTables(labelFirstFirst,labelFirstSecond,labelFirstThird,labelFirstFouth,labelFirstFifth);
        setUpLabelsToTables(labelSecondFirst,labelSecondSecond,labelSecondThird,labelSecondFourth,labelSecondFifth);
    }

    private final void setUpLabelsToTables(Label labelOne, Label labelTwo, Label labelThree, Label labelFour,
                                      Label labelFive) {
        labelOne.setText("Pogoda na dziś");
        labelTwo.setText("Pogoda na jutro");
        labelThree.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(2)));
        labelFour.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(3)));
        labelFive.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(4)));
    }


    private final void setUpLegend() {
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
        setTextfields(secondTown, secondCountry,getFullGsonDataForSecondCity);
        connectColumsWithData(secondFirstTableView, dataSecondFirst, timeColSecondFrst, stateColSecondFirst,tempColSecondFirst);
        connectColumsWithData(secondSecondTableView, dataSecondSecond, timeColSecondSecond, stateColSecondSecond, tempColSecondSecond);
        connectColumsWithData(secondThirdTableView, dataSecondThird, timeColSecondThird, stateColSecondThird, tempColSecondThird);
        connectColumsWithData(secondFourthTableView, dataSecondFourth, timeColSecondFourth, stateColSecondFourth, tempColSecondFourth);
        connectColumsWithData(secondFifthTableView, dataSecondFifth, timeColSecondFifth, stateColSecondFifth, tempColSecondFifth);
        setUpWeatherData(fullWeatherInformationForSecondCity, dataSecondFirst, dataSecondSecond, dataSecondThird,
                dataSecondFourth, dataSecondFifth);
    }

    private void setUpFirstTableView() {
        setTextfields(firstTown, firstCountry,getFullGsonData);
        connectColumsWithData(firstFirstTableView, dataFirstFirst, timeColFrstFrst, stateColFrstFrst,tempColFrstFrst);
        connectColumsWithData(firstSecondTableView, dataFirstSecond, timeColFrstSecond, stateColFrstSecond, tempColFrstSecond);
        connectColumsWithData(firstThirdTableView, dataFirstThird, timeColFrstThird, stateColFrstThird, tempColFrstThird);
        connectColumsWithData(firstFouthTableView, dataFirstFourth, timeColFrstFourth, stateColFrstFourth, tempColFrstFourth);
        connectColumsWithData(firstFifthTableView, dataFirstFifth, timeColFrstFifth, stateColFrstFifth, tempColFrstFifth);
        setUpWeatherData(fullWeatherInformation, dataFirstFirst, dataFirstSecond, dataFirstThird,
                dataFirstFourth, dataFirstFifth);
    }

    private final void setTextfields(TextField town, TextField country, GetFullGsonData data) {
        town.clear();
        country.clear();
        town.setText(data.getTown());
        country.setText(data.getCountry());
    }
    private final void setUpWeatherData(List<FullWeatherInformation> fullWeatInfo,
                                        ObservableList<TableViewData> dataOne,
                                        ObservableList<TableViewData> dataTwo,
                                        ObservableList<TableViewData> dataThree,
                                        ObservableList<TableViewData> dataFour,
                                        ObservableList<TableViewData> dataFive) {
        for(int i =0; i<40; i++){
            fullWeatInfo.get(i).getFormattedDate();
            fullWeatInfo.get(i).getWeather().get(0).getIcon();
            fullWeatInfo.get(i).getMain().getTemp();

            if(fullWeatInfo.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth(0)) {
                dataOne.add(
                        new TableViewData(fullWeatInfo.get(i).getFormattedDate(),
                                fullWeatInfo.get(i).getWeather().get(0).getIcon(),
                                fullWeatInfo.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatInfo.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth(1)) {
                dataTwo.add(
                        new TableViewData(fullWeatInfo.get(i).getFormattedDate(),
                                fullWeatInfo.get(i).getWeather().get(0).getIcon(),
                                fullWeatInfo.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatInfo.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth(2)) {
                dataThree.add(
                        new TableViewData(fullWeatInfo.get(i).getFormattedDate(),
                                fullWeatInfo.get(i).getWeather().get(0).getIcon(),
                                fullWeatInfo.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatInfo.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth(3)) {
                dataFour.add(
                        new TableViewData(fullWeatInfo.get(i).getFormattedDate(),
                                fullWeatInfo.get(i).getWeather().get(0).getIcon(),
                                fullWeatInfo.get(i).getMain().getTemp())
                );
            }
            else if (fullWeatInfo.get(i).getDayFromWeatherData() == getCuurentDayOfTheMonth(4)) {
                dataFive.add(
                        new TableViewData(fullWeatInfo.get(i).getFormattedDate(),
                                fullWeatInfo.get(i).getWeather().get(0).getIcon(),
                                fullWeatInfo.get(i).getMain().getTemp())
                );
            }
        }
    }

    private final void connectColumsWithData(TableView<TableViewData> table, ObservableList<TableViewData> obsListData,
                                  TableColumn<TableViewData, Integer> timeCol,
                                  TableColumn<TableViewData, String> stateCol,
                                  TableColumn<TableViewData, Float> tempCol) {
        table.setItems(obsListData);
        timeCol.setCellValueFactory(new PropertyValueFactory<TableViewData, Integer>("dateTime"));
        stateCol.setCellValueFactory(new PropertyValueFactory<TableViewData, String>("icon"));
        tempCol.setCellValueFactory(new PropertyValueFactory<TableViewData, Float>("temp"));
    }

}

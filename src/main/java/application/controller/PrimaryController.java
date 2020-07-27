package application.controller;


import application.model.GetFullGsonData;
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
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;


public class PrimaryController implements Initializable {

    private ArrayList<FullWeatherInformation> fullWeatherInformation;
    private ArrayList<FullWeatherInformation> fullWeatherInformationForSecondCity;
    private HashMap<String, String> legendMap;
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

    final Label placeholderLabelCountry = new Label("Wprowadź nazwę kraju");
    final Label placeholderLabelTown = new Label("Wprowadź nazwę miasta");
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
    void firstShowButton() throws IOException {
        errorLabel.setText("");
       clearArraysListsFirstTown();
        if(fullWeatherInformation != null){
            fullWeatherInformation.clear();
        }
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
    void secondShowButton() throws IOException {
        errorLabel.setText("");
        clearArraysListsSecondTown();
        if(fullWeatherInformationForSecondCity != null) {
            fullWeatherInformationForSecondCity.clear();
        }
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

    public String getFxmlName() {
        return fxmlName;
    }

    private boolean validFields(String field1, String field2) {
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

        firstTown.setText(getFullGsonData.getTown());
        secondTown.setText(getFullGsonDataForSecondCity.getTown());
        firstCountry.setText(getFullGsonData.getCountry());
        secondCountry.setText(getFullGsonDataForSecondCity.getCountry());
        firstCountry.setPromptText("Wprowadź nazwę kraju.");
        firstTown.setPromptText("Wprowadź nazwę miasta.");
        secondCountry.setPromptText("Wprowadź nazwę kraju.");
        secondTown.setPromptText("Wprowadź nazwę miasta.");
        setUpLegend();
        setUpLabels();
        setUpFirstTableView();
        setUpSecondTableView();
    }

    private void clearArraysListsFirstTown() {
        dataFirstFirst.clear();
        dataFirstSecond.clear();
        dataFirstThird.clear();
        dataFirstFourth.clear();
        dataFirstFifth.clear();
    }

    private void clearArraysListsSecondTown() {
        dataSecondFirst.clear();
        dataSecondSecond.clear();
        dataSecondThird.clear();
        dataSecondFourth.clear();
        dataSecondFourth.clear();
    }

    private void setUpLabels() {
        labelFirstFirst.setText("Pogoda na dziś");
        labelFirstSecond.setText("Pogoda na jutro");
        labelFirstThird.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(2)));
        labelFirstFouth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(3)));
        labelFirstFifth.setText(getDayAndMonth(LocalDateTime.from(dt.toInstant().atZone(ZoneId.of("UTC+2"))).plusDays(4)));

        labelSecondFirst.setText("Pogoda na dziś");
        labelSecondSecond.setText("Pogoda na jutro");
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

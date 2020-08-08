package application.controller;

import application.model.GetFullGsonData;
import application.model.gsonsClass.FullWeatherInformation;
import application.model.LegendData;
import application.model.TableViewData;
import application.model.TableViewLegendData;
import com.google.gson.JsonSyntaxException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class PrimaryControllerTest {


   private FullWeatherInformationStub weatherInfo = new FullWeatherInformationStub();
   private LegendData legendData = new LegendData();


    @Mock
   private TableViewData tableViewData;
   private TableViewLegendData tableViewLegendData;

    @Test
    void checkAddingDataToLegendDataList(){
        //given
        ObservableList<TableViewLegendData> legendDataObservableList =  FXCollections.observableArrayList();
        //when
        legendDataObservableList.add(tableViewLegendData);
        //then
        assertThat(legendDataObservableList, hasSize(1));
    }
    @Test
    void dataInLegendsShouldReturnProperGeneratedData() {
        //given
        //when
        //then
        assertThat(legendData.getLegendData().get("01d"), equalTo("bezchmurne niebo"));
    }
    @Test
    void shoudGetTemperature() {
        //given
        //when
        List<FullWeatherInformation> fullWeatInf = weatherInfo.getFullWeatherInformationList();
        //then
        assertThat(fullWeatInf.get(0).getMain().getTemp(), notNullValue());
        assertThat(fullWeatInf.get(0).getMain().getTemp(), is((float)22.12));
    }
    @Test
    void shouldThrowExeptionIfNoValidTownOrCountryWillEntry() {
        //given
        //when
        //then
        assertThrows(JsonSyntaxException.class, () -> new GetFullGsonData("",""));
        assertThrows(JsonSyntaxException.class, () -> new GetFullGsonData("Krak",""));
    }
    @Test
    void shouldDownloadDataFromServerForProperTownName() throws IOException {
        //given
        GetFullGsonData getFullGsonData = new GetFullGsonData("Kraków","");
        //when
        //then
        assertThat(getFullGsonData.getFullWeatherInformation(), hasSize(40));
    }
    @Test
    void checkClearingfFunctionsWorkProperly() {
        //given
        List<FullWeatherInformation> fullWeatInf = weatherInfo.getFullWeatherInformationList();
        ObservableList<TableViewData> dataFirstFirst = FXCollections.observableArrayList();
        dataFirstFirst.add(tableViewData);
        //when
        dataFirstFirst.clear();
        fullWeatInf.clear();
        //then
        assertAll(
                () -> assertThat(dataFirstFirst, empty()),
                () -> assertThat(fullWeatInf, empty())
        );
    }
    @Test
    void addingToListsShoudReturnListsWithElements() {
        //given
        List<FullWeatherInformation> fullWeatInf = weatherInfo.getFullWeatherInformationList();
        ObservableList<TableViewData> dataFirstFirst = FXCollections.observableArrayList();
        dataFirstFirst.add(tableViewData);
        //when
        //then
        assertAll(
                () -> assertThat(dataFirstFirst, hasItem(tableViewData)),
                () -> assertThat(fullWeatInf, hasSize(1))
        );
    }
    @Test
    void checkValidFieldsFunction(){
        //given
        PrimaryController primaryController = mock(PrimaryController.class);
        //when
        //then
      //  assertTrue(primaryController.validFields("lubie", "placki"));

    }
}

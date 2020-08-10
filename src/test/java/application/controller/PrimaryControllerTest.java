package application.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PrimaryControllerTest {

    private FullWeatherInformationStub fullWeatherInformationStub = new FullWeatherInformationStub();
    private PrimaryController primaryController = new PrimaryController("firstTown", "firstCountry", "secondTown",
           "second country", "fxmlName");


    @Test
    void shouldThrowExeptionIfNoValidTownOrCountryWillEntry() {
        //given
        //when
        //then
    }

    @Test
    void checkInternetConnectionError() {
        //given
        //when
        //then
    }
}

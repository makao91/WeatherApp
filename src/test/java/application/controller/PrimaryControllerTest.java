package application.controller;

import application.model.GetFullGsonData;
import application.model.GsonsClass.FullWeatherInformation;


import application.model.GsonsClass.FullWrappedGson;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;


import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;


class PrimaryControllerTest {

    @Test
    void shoudGetTemperature() {
        //given
        FullWeatherInformationStub weatherInfo = new FullWeatherInformationStub();
        //when
        List<FullWeatherInformation> fullWeatInf = weatherInfo.getFullWeatherInformationList();
        //then
        assertThat(fullWeatInf.get(0).getMain().getTemp(), notNullValue());
        assertThat(fullWeatInf.get(0).getMain().getTemp(), is((float)22.12));
    }
    @Test
    void shouldThrowExeptionIfNoValidTownOrCountryWillEntry() throws IOException {
        //given
        //when
        //then
        assertThrows(JsonSyntaxException.class, () -> new GetFullGsonData("",""));
    }
}

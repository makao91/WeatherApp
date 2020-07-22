/**
 *
 */
module application {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens application.controller;
    opens application.model.GsonsClass;
    opens application;

}
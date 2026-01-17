package com.calendlyo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

import java.util.TimeZone;

@EntityScan(basePackages = "com.calendlyo.api.domain.entity")
@SpringBootApplication
public class CalendlyoApiApplication {

    private CalendlyoApiApplication() {}

    /**
     * Start the application
     *
     * @param args the list of program arguments
     */
    static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
        SpringApplication.run(CalendlyoApiApplication.class, args);
    }
}


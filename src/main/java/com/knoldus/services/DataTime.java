package com.knoldus.services;
import java.time.*;

class DataTime {

    String ageOfPerson(){
        LocalDate birthDate = LocalDate.of(1995,12,19);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();
        return "Your age is " + years + " years, " + months + " months & " + days + " days!";
    }

}
package org.example;

import org.example.Config.HibernateConfig;
import org.example.Entity.Country;
import org.example.Entity.President;
import org.example.Service.CountryService;
import org.example.Service.PresidentService;
import org.example.Service.ServiceImpl.CountryServiceImpl;
import org.example.Service.ServiceImpl.PresidentServiceImpl;

public class App {
    public static void main( String[] args ) {

        PresidentService presidentService = new PresidentServiceImpl();
        CountryService countryService = new CountryServiceImpl();

        President president = new President("Donald","Tramp","T@gmail.com");

        Country country = new Country("USE","English");
        country.setPresident(president);
        countryService.save(country);

        countryService.deleteCountryById(2L);
        presidentService.deletePresident(5L);
    }
}
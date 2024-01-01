package org.example.Service.ServiceImpl;

import org.example.Entity.Country;
import org.example.Service.CountryService;
import org.example.repository.CountryRepository;
import org.example.repository.repositoryImpl.CountryRepositoryImpl;

public class CountryServiceImpl implements CountryService {
  CountryRepository countryRepository = new CountryRepositoryImpl();
    @Override
    public String save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountryById(Long id) {
        countryRepository.deleteCountryById(id);
    }
}

package org.example.repository;

import org.example.Entity.Country;

public interface CountryRepository {
    String save (Country country);
    void deleteCountryById(Long id);
}

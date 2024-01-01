package org.example.Service;

import org.example.Entity.Country;

public interface CountryService {
    String save (Country country);
    void deleteCountryById(Long id);
}

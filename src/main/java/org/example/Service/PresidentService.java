package org.example.Service;

import org.example.Entity.President;

public interface PresidentService {
    void savePresident(President president);
    void deletePresident(Long id);
}
